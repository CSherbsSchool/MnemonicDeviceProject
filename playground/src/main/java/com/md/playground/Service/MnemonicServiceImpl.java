package com.md.playground.Service;

import com.md.playground.dao.MnemonicRepository;
import com.md.playground.entity.Mnemonic;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import java.util.ArrayList;
import java.util.List;

@Service
public class MnemonicServiceImpl implements MnemonicService{

    @Autowired
    private MnemonicRepository repository;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createMnemonic(Mnemonic mnemonic) {
        repository.save(mnemonic);
    }

    @Override
    public void deleteMnemonic(int id) {
        repository.deleteById(id);
    }

    @Override
    public Mnemonic getMnemonic(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Mnemonic> getMnemonicsCreatedByUser(int user_id) {
        return repository.getMnemonicsCreatedByUser(user_id);
    }

    @Override
    public List<Mnemonic> getAllMnemonics() {
        List<Mnemonic> mnemonics = new ArrayList<>();
        repository.findAll().forEach(mnemonic -> {
            mnemonics.add(mnemonic);
        });
        return mnemonics;
    }

    @Override
    public List<Mnemonic> getMnemonicsWithKeyword(String keyword) {
        return repository.getMnemonicsWithKeyword(keyword);
    }

	@Override
	public String[] splitMnemonic(Mnemonic mnemonic) {
		String[] showMnemonic =  mnemonic.getMnemonic_device().split(" ");
		return showMnemonic;
	}

	@Override
	public String[] splitConcept(Mnemonic mnemonic) {
		String[] showConcept = mnemonic.getStudy_concept().split(" ");
		return showConcept;
	}

}
