package com.md.playground.dao;

import com.md.playground.entity.SavedMnemonic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SavedMnemonicRepository extends CrudRepository<SavedMnemonic, Integer> {
    @Query("SELECT m FROM SavedMnemonic m WHERE m.userID = ?1")
    List<SavedMnemonic> getAllUserSavedMnemonics(int userID);
    
    @Query("SELECT m FROM SavedMnemonic m WHERE m.userID = ?1 AND m.mnemonic_id = ?2")
    SavedMnemonic getSavedMnemonic (int userID, int mnemonic_id);
}
