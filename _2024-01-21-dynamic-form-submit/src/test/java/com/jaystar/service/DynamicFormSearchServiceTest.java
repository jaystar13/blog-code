package com.jaystar.service;

import com.jaystar.controller.SectionItem;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DynamicFormSearchServiceTest {

    @Test
    void sectionItemsTest() {
        SectionItem[] values = SectionItem.values();
        SectionItem sectionItem = Arrays.stream(values).filter(item -> "profile".equals(item.getKey())).findFirst().orElseThrow();

        for (SectionItem value : values) {
            if ("profile".equals(value.getKey())) {

            }
        }

        //assertThat(profile).isNotNull();
    }

    private SectionItem getSectionItem(String keyName) {
        SectionItem[] items = SectionItem.values();
        for (SectionItem item : items) {
            if (keyName.equals(item.getKey())) {
                return item;
            }
        }

        return null;
    }
}