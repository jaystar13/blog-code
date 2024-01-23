package com.jaystar.service;

import com.jaystar.controller.SectionItem;
import com.jaystar.dto.MySection;
import com.jaystar.dto.MySections;
import com.jaystar.dto.MySectionsSubmit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DynamicFormSearchService {

    private final MyFormFactory myFormFactory;

    public MySections getForms(List<SectionItem> sectionItems) {

        MySections sections = new MySections();
        for (SectionItem item : sectionItems) {
            MyFormService myFormService = myFormFactory.getInstance(item.getBeanName());
            MySection mySection = myFormService.getMySection();
            sections.add(mySection);
        }

        return sections;
    }
    
    public void saveForms(List<SectionItem> sectionItems, MySectionsSubmit mySections) {

        for (SectionItem sectionItem : sectionItems) {
            MyFormService myFormService = myFormFactory.getInstance(sectionItem.getBeanName());
            myFormService.saveMySection(mySections);
        }

    }
}
