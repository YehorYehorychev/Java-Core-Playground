package com.yehor.lessons.reflectionapi;

import java.io.Serializable;

public class User extends Person implements Serializable, Comparable<User> {
    private String name;

    public User(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
