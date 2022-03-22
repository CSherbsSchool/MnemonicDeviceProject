package com.md.playground.entity;

import javax.persistence.*;

@Entity
@Table(name = "Saved_Mnemonics")
public class SavedMnemonic {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int saved_mnemonicsID;

    private int userID;

    private int mnemonic_id;

    public SavedMnemonic() {
    }

    public SavedMnemonic(int userID, int mnemonic_id) {
        this.userID = userID;
        this.mnemonic_id = mnemonic_id;
    }

    public int getSaved_mnemonicsID() {
        return saved_mnemonicsID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMnemonic_id() {
        return mnemonic_id;
    }

    public void setMnemonic_id(int mnemonic_id) {
        this.mnemonic_id = mnemonic_id;
    }
}