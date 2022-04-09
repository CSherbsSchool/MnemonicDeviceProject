package com.md.playground.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mnemonics")
public class Mnemonic {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int mnemonic_id;

    private String title;

    private String study_concept;

    private String mnemonic_device;

    @Column(name = "private")
    private boolean isPrivate;

    private int creator_userID;

    public Mnemonic() {}

    public Mnemonic(String title, String study_concept, String mnemonic_device, boolean isPrivate, int creator_userID) {
        this.title = title;
        this.study_concept = study_concept;
        this.mnemonic_device = mnemonic_device;
        this.isPrivate = isPrivate;
        this.creator_userID = creator_userID;
    }

    public int getMnemonic_id() {
        return mnemonic_id;
    }

    public void setMnemonic_id(int mnemonic_id) {
        this.mnemonic_id = mnemonic_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public int getCreator_userID() {
        return creator_userID;
    }

    public void setCreator_userID(int creator_userID) {
        this.creator_userID = creator_userID;
    }

    @Override
    public String toString() {
        return "Mnemonic{" +
                "mnemonic_id=" + mnemonic_id +
                ", title='" + title + '\'' +
                ", study_concept='" + study_concept + '\'' +
                ", mnemonic_device='" + mnemonic_device + '\'' +
                ", isPrivate=" + isPrivate +
                ", creator_userID=" + creator_userID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mnemonic mnemonic = (Mnemonic) o;
        return mnemonic_id == mnemonic.mnemonic_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mnemonic_id);
    }
}