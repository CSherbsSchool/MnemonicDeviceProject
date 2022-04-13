package com.md.playground.Service;

import com.md.playground.dao.TagRepository;
import com.md.playground.entity.Tag;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private TagRepository repository;

    @Override
    public void createTag(Tag tag) {
        repository.save(tag);
    }

    @Override
    public Tag getTag(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteTag(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Tag> getAllMnemonicTags(int mnemonic_id) {
        return repository.getAllMnemonicTags(mnemonic_id);
    }

    @Override
    public List<Object[]> getMnemonicIdsOfTagsWithKeyword(String keyword) {
        return repository.getMnemonicIdsOfTagsWithKeyword(keyword);
    }

}
