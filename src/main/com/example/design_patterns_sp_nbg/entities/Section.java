package com.example.design_patterns_sp_nbg.entities;

import java.util.ArrayList;

public class Section implements Element{
    private String title;
    private ArrayList<Element> content = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element element : content) {
            element.print();
        }
    }

    @Override
    public void add(Element element) {
        content.add(element);
    }

    @Override
    public void remove(Element element) {
        content.remove(element);
    }

    @Override
    public Element getElement(int index) {
        return content.get(index);
    }
}
