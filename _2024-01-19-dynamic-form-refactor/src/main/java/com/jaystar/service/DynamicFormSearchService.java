package com.jaystar.service;

import com.jaystar.dto.MySection;
import com.jaystar.dto.MySections;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DynamicFormSearchService {

    private final MyFormFactory myFormFactory;

    public MySections getForms(String[] serviceNames) {
        MySections sections = new MySections();
        for (String serviceName : serviceNames) {
            MyFormService myFormService = myFormFactory.getInstance(serviceName);
            MySection mySection = myFormService.getMySection();
            sections.add(mySection);
        }

        return sections;
    }
}
