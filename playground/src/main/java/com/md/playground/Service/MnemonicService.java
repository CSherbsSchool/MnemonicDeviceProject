package com.md.playground.Service;

import com.md.playground.entity.Mnemonic;

import java.util.List;

public interface MnemonicService {
    void createMnemonic(Mnemonic mnemonic);

    void deleteMnemonic(int id);

    Mnemonic getMnemonic(int id);

    List<Mnemonic> getMnemonicsCreatedByUser(int user_id);

    List<Mnemonic> getAllMnemonics();

    List<Mnemonic> getMnemonicsWithKeyword(String keyword);
    
    String[] splitMnemonic(Mnemonic mnemonic);
    
    String[] splitConcept(Mnemonic mnemonic);
}