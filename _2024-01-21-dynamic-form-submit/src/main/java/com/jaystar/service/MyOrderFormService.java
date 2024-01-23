package com.jaystar.service;

import com.jaystar.controller.SectionItem;
import com.jaystar.dto.MyForms;
import com.jaystar.dto.MyOrderForm;
import com.jaystar.dto.MySection;
import com.jaystar.dto.MySectionsSubmit;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyOrderFormService implements MyFormService {
    @Override
    public MySection getMySection() {
        return new MySection(SectionItem.ORDER, new MyForms(Arrays.asList(new MyOrderForm("clean code", 2),
                new MyOrderForm("candy", 10))));
    }

    @Override
    public Integer saveMySection(MySectionsSubmit mySection) {
        return null;
    }
}
