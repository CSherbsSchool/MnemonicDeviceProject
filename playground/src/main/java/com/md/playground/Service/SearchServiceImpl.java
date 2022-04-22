package com.md.playground.Service;

import com.md.playground.entity.Mnemonic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SearchServiceImpl implements SearchService{
    @Autowired
    MnemonicServiceImpl mnemonicService;

    @Autowired
    TagServiceImpl tagService;

    //searches for criteria as word in both mnemonic and tag table,
    //then we break the sentence down and search tag table for each word to get similar mnemonics
    @Override
    public List<Mnemonic> searchForMnemonics(String searchCriteria) {
        Set<Mnemonic> results = new HashSet<>();

        //break down the sentence to words
        String[] words = searchCriteria.split(" ");

        //search for the sentence as a whole first
        results.addAll(mnemonicService.getMnemonicsWithKeyword(searchCriteria));

        //search for tag with the whole sentence first
        List<Object[]> matchingTags = tagService.getMnemonicIdsOfTagsWithKeyword(searchCriteria);

        if(!matchingTags.isEmpty()){
            for (Object[] tagMnemonicID: matchingTags) {
                results.add(mnemonicService.getMnemonic((Integer) tagMnemonicID[0]));
            }
        }

        //I'm not searching the mnemonics table for each word because I don't want things like
        //adding a mnemonic to the result because it has "the" in its title to happen.

        //search for each word in tag
        //we run the same risk of adding unnecessary mnemonics because of words like "the", "is", "of" etc
        //I think the chances are less here because tags are generally short and specific
        for (String word: words) {
            matchingTags = tagService.getMnemonicIdsOfTagsWithKeyword(word);

            if(!matchingTags.isEmpty()){
                for (Object[] tagMnemonicID: matchingTags) {
                    results.add(mnemonicService.getMnemonic((Integer) tagMnemonicID[0]));
                }
            }
        }

        return new ArrayList<>(results);
    }
}
