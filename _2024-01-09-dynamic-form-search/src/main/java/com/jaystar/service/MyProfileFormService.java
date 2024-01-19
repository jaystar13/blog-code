package com.jaystar.service;

import com.jaystar.dto.MyForm;
import com.jaystar.dto.MyProfileForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyProfileFormService implements MyFormService {
    @Override
    public List<MyForm> getMyForms() {
        return List.of(new MyProfileForm("홍길동", "012-3456-7890"));
    }
}
