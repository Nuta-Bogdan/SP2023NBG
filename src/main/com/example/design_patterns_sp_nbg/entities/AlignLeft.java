package com.example.design_patterns_sp_nbg.entities;

public class AlignLeft implements AlignStrategy{

    public String render(Paragraph paragraph) {
        return paragraph.getText();
    }
}
