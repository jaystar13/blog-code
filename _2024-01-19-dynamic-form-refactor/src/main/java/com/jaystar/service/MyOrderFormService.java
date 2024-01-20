package com.jaystar.service;

import com.jaystar.dto.MyOrderForm;
import com.jaystar.dto.MySection;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyOrderFormService implements MyFormService {
    @Override
    public MySection getMySection() {
        return new MySection("order", Arrays.asList(new MyOrderForm("clean code", 2),
                new MyOrderForm("candy", 10)));
    }
}
