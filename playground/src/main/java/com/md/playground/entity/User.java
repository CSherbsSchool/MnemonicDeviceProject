package com.md.playground.entity;

import javax.persistence.*;

public class User {
    @Entity
    @Table(name = "user")
    public class user {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "username")
        private String userName;

        @Column(name = "password")
        private String userPassword;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }
    }

}


