package com.md.playground.Service;

import com.md.playground.entity.Tag;

import java.util.List;

public interface TagService {
    void createTag(Tag tag);
    Tag getTag(int id);
    void deleteTag(int id);
    List<Tag> getAllMnemonicTags(int mnemonic_id);
    List<Object[]> getMnemonicIdsOfTagsWithKeyword(String keyword);
}
