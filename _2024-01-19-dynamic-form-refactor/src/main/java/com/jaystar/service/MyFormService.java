package com.jaystar.service;

import com.jaystar.dto.MySection;
import org.springframework.stereotype.Service;

@Service
public interface MyFormService {
    MySection getMySection();
}
