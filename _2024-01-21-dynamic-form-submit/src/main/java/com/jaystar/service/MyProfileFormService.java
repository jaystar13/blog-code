package com.jaystar.service;

import com.jaystar.controller.SectionItem;
import com.jaystar.dto.MyForms;
import com.jaystar.dto.MyProfileForm;
import com.jaystar.dto.MySection;
import com.jaystar.dto.MySectionsSubmit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyProfileFormService implements MyFormService {

    @Override
    public MySection getMySection() {
        return new MySection(SectionItem.PROFILE, new MyForms(List.of(new MyProfileForm("홍길동", "012-3456-7890"))));
    }

    @Override
    public Integer saveMySection(MySectionsSubmit mySection) {
        List<MyProfileForm> profiles = mySection.getProfiles();
        return null;
    }
}
