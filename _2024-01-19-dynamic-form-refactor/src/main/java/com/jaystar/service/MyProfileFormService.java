package com.jaystar.service;

import com.jaystar.dto.MyProfileForm;
import com.jaystar.dto.MySection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyProfileFormService implements MyFormService {
    @Override
    public MySection getMySection() {
        return new MySection("profile", List.of(new MyProfileForm("홍길동", "012-3456-7890")));
    }
}
