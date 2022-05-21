package com.cde.stuff;

public class Person {
    String name;
    int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s %d", name, id);
    }
}
