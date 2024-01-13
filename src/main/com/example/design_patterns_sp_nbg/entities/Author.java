package com.example.design_patterns_sp_nbg.entities;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}
