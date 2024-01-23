package com.jaystar.service;

import com.jaystar.dto.MySection;
import com.jaystar.dto.MySectionsSubmit;
import org.springframework.stereotype.Service;

@Service
public interface MyFormService {
    MySection getMySection();

    Integer saveMySection(MySectionsSubmit mySection);
}
