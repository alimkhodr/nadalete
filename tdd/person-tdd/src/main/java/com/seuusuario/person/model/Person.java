package com.seuusuario.person.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<Email> emails = new ArrayList<>();

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void addEmail(Email email) {
        this.emails.add(email);
    }

    public List<Email> getEmails() {
        return emails;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
