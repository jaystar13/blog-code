package com.jaystar.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class MySections {
    private List<MySection> sections;

    public MySections() {
        this.sections = new ArrayList<>();
    }

    public boolean add(MySection mySection) {
        return sections.add(mySection);
    }
}
