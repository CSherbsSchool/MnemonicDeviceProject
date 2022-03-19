package com.md.playground.entity;

import javax.persistence.*;

@Entity
@IdClass(AccountId.class)
public class SavedMnemonic {
    @Id
    private String username;

    @Id
    private int mnemonic_id;

    protected SavedMnemonic() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMnemonic_id() {
        return mnemonic_id;
    }

    public void setMnemonic_id(int mnemonic_id) {
        this.mnemonic_id = mnemonic_id;
    }
}