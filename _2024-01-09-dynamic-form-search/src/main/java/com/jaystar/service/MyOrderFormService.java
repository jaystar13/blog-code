package com.jaystar.service;

import com.jaystar.dto.MyForm;
import com.jaystar.dto.MyOrderForm;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MyOrderFormService implements MyFormService {
    @Override
    public List<MyForm> getMyForms() {
        return Arrays.asList(new MyOrderForm("clean code", 2),
                new MyOrderForm("candy", 10));
    }
}
