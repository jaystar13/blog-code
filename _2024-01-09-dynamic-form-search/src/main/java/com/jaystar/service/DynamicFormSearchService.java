package com.jaystar.service;

import com.jaystar.dto.MyForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DynamicFormSearchService {

    private final MyFormFactory myFormFactory;

    public List<List<MyForm>> getForms(String[] serviceNames) {
        List<List<MyForm>> sections = new ArrayList<>();
        for (String serviceName : serviceNames) {
            MyFormService myFormService = myFormFactory.getInstance(serviceName);
            List<MyForm> myForms = myFormService.getMyForms();
            sections.add(myForms);
        }

        return sections;
    }
}
