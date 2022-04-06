package com.md.playground.Service;

import com.md.playground.entity.SavedMnemonic;
import com.md.playground.entity.Tag;

import java.util.List;

public interface SavedMnemonicService {
    void createSaveMnemonic(SavedMnemonic savedMnemonic);
    SavedMnemonic getSavedMnemonic(int id);
    void deleteSavedMnemonic(int id);
    List<SavedMnemonic> getAllUserSavedMnemonics(int userID);
}
