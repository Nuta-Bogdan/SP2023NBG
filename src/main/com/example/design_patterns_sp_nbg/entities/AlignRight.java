package com.example.design_patterns_sp_nbg.entities;

public class AlignRight implements AlignStrategy {

    @Override
    public String render(Paragraph paragraph) {
        return "        " + paragraph.getText();
    }
}
