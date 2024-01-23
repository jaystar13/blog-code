package com.jaystar.dto;

import com.jaystar.controller.SectionItem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MySection {
    private SectionItem sectionItem;

    private MyForms myForms;

    public MySection(SectionItem sectionItem, MyForms mySection) {
        this.sectionItem = sectionItem;
        this.myForms = mySection;
    }

}
