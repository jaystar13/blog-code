package com.jaystar.controller;

import lombok.Getter;

@Getter
public enum SectionItem {
    PROFILE("profile", "myProfileFormService"),
    ORDER("order", "myOrderFormService");

    private final String key;
    private final String beanName;

    SectionItem(String key, String beanName) {
        this.key = key;
        this.beanName = beanName;
    }
}
