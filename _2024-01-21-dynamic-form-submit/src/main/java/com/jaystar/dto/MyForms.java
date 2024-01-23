package com.jaystar.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MyForms {

    private List<MyForm> myForms;

    public MyForms(List<MyForm> myForms) {
        this.myForms = myForms;
    }
}
