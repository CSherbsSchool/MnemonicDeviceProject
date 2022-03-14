package com.md.playground.entity;

import javax.persistence.*;

@Entity
public class SavedMnemonicId implements Serializable {
    private String username;

    private int mnemonic_id;

    public SavedMnemonicId(String username, int mnemonic_id) {
        this.username = username;
        this.mnemonic_id = mnemonic_id;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        SavedMnemonicId that = (SavedMnemonicId) object;
        return mnemonic_id == that.mnemonic_id && java.util.Objects.equals(username, that.username);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), username, mnemonic_id);
    }
}