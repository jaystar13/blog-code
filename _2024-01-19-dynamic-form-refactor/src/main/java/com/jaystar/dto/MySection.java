package com.jaystar.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MySection {
    private String sectionName;

    private List<MyForm> mySection;

    public MySection(String sectionName, List<MyForm> mySection) {
        this.sectionName = sectionName;
        this.mySection = mySection;
    }
}
