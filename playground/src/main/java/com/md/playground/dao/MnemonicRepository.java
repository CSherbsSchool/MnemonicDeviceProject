package com.md.playground.dao;

import com.md.playground.entity.Mnemonic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MnemonicRepository extends CrudRepository<Mnemonic, Integer> {

    @Query("SELECT m FROM Mnemonic m WHERE m.creator_userID = ?1")
    List<Mnemonic> getMnemonicsCreatedByUser(int user_id);

    @Query("SELECT m FROM Mnemonic m WHERE m.study_concept LIKE %?1%")
    List<Mnemonic> getMnemonicsWithKeyword(String keyword);
}
