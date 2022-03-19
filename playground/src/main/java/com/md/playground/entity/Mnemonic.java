package com.md.playground.entity;

import javax.persistence.*;

@Entity
public class Mnemonic {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String study_concept;

    private String mnemonic_device;

    private boolean isPrivate;

    private String creator_username;

    protected Mnemonic() {}

    public Mnemonic(String study_concept, String mnemonic_device, boolean isPrivate, String creator_username) {
        this.study_concept = study_concept;
        this.mnemonic_device = mnemonic_device;
        this.isPrivate = isPrivate;
        this.creator_username = creator_username;
    }

    public int getId() {
        return id;
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

    public String getCreator_username() {
        return creator_username;
    }

    public void setCreator_username(String creator_username) {
        this.creator_username = creator_username;
    }
}