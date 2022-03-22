package com.md.playground.entity;

import javax.persistence.*;

@Entity
@Table(name = "Mnemonics")
public class Mnemonic {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int mnemonic_id;

    private String study_concept;

    private String mnemonic_device;

    @Column(name = "private")
    private boolean isPrivate;

    private int creator_userID;

    public Mnemonic() {}

    public Mnemonic(String study_concept, String mnemonic_device, boolean isPrivate, int creator_userID) {
        this.study_concept = study_concept;
        this.mnemonic_device = mnemonic_device;
        this.isPrivate = isPrivate;
        this.creator_userID = creator_userID;
    }

    public int getMnemonic_id() {
        return mnemonic_id;
    }

    public String getStudy_concept() {
        return study_concept;
    }

    public void setStudy_concept(String study_concept) {
        this.study_concept = study_concept;
    }

    public String getMnemonic_device() {
        return mnemonic_device;
    }

    public void setMnemonic_device(String mnemonic_device) {
        this.mnemonic_device = mnemonic_device;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public int getCreator_userID() {
        return creator_userID;
    }

    public void setCreator_userID(int creator_userID) {
        this.creator_userID = creator_userID;
    }
}