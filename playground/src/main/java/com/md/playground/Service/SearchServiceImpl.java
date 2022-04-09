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

    //Thought process for implementing search:
    //we have a word search criteria
    //first we search the mnemonics table for the word
    //we add the results to the list
    //we then search the tags for the search criteria
    //we group the result by mnemonic id, so we don't have multiple results that ultimately point to the same mnemonic
    //we add the result to the list too
    //but how do we avoid adding the same mnemonic that has been added from the mnemonic table search?
    //Will using a set to store the result avoid duplication? YES


    //searches for criteria as word only in both mnemonic and tag
    @Override
    public List<Mnemonic> searchForMnemonics_Word(String searchCriteria) {

        Set<Mnemonic> results = new HashSet<>();
        results.addAll(mnemonicService.getMnemonicsWithKeyword(searchCriteria));

        List<Object[]> matchingTags = tagService.getMnemonicIdsOfTagsWithKeyword(searchCriteria);

        if(!matchingTags.isEmpty()){
            for (Object[] tagMnemonicID: matchingTags) {
                results.add(mnemonicService.getMnemonic((Integer) tagMnemonicID[0]));
            }
        }

        return results.stream().toList();
    }

    //searches for criteria as word in both mnemonic and tag table,
    //then we break the sentence down and search tag table for each word to get similar mnemonics
    @Override
    public List<Mnemonic> searchForMnemonics_Sentence(String searchCriteria) {
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

        return results.stream().toList();
    }
}
