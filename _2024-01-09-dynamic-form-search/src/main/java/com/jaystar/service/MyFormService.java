package com.jaystar.service;

import com.jaystar.dto.MyForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyFormService {
    List<MyForm> getMyForms();
}
