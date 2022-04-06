package com.md.playground.Service;

import com.md.playground.dao.SavedMnemonicRepository;
import com.md.playground.entity.SavedMnemonic;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavedMnemonicServiceImpl implements SavedMnemonicService{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private SavedMnemonicRepository repository;

    @Override
    public void createSaveMnemonic(SavedMnemonic savedMnemonic) {
        repository.save(savedMnemonic);
    }

    @Override
    public SavedMnemonic getSavedMnemonic(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteSavedMnemonic(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<SavedMnemonic> getAllUserSavedMnemonics(int userID) {
        return repository.getAllUserSavedMnemonics(userID);
    }
}
