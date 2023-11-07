package com.example.design_patterns_sp_nbg.entities;
public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void print() {
        System.out.println("Table: " + title);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element getElement(int index) {
        return null;
    }
}
