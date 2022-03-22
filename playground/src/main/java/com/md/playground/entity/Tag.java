package com.md.playground.entity;

import javax.persistence.*;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int tagID;

    private String tag;

    private int mnemonic_id;

    public Tag() {
    }

    public Tag(String tag, int mnemonic_id) {
        this.tag = tag;
        this.mnemonic_id = mnemonic_id;
    }

    public int getTagID() {
        return tagID;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getMnemonic_id() {
        return mnemonic_id;
    }

    public void setMnemonic_id(int mnemonic_id) {
        this.mnemonic_id = mnemonic_id;
    }
}