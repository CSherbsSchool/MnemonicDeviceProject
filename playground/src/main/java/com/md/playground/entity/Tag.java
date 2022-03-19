package com.md.playground.entity;

import javax.persistence.*;

@Entity
public class Mnemonic {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String tag;

    private int mnemonic_id;

    protected Mnemonic() {
    }

    public Mnemonic(String tag, int mnemonic_id) {
        this.tag = tag;
        this.mnemonic_id = mnemonic_id;
    }

    public int getId() {
        return id;
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