package com.md.playground.dao;

import com.md.playground.entity.Mnemonic;
import com.md.playground.entity.Tag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TagRepository extends CrudRepository<Tag, Integer> {
    @Query("SELECT t FROM Tag t WHERE t.mnemonic_id = ?1")
    List<Tag> getAllMnemonicTags(int mnemonic_id);
}
