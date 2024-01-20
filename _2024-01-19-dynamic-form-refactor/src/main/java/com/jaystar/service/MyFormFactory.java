package com.jaystar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@RequiredArgsConstructor
@Component
public class MyFormFactory {
    private final Map<String, MyFormService> formServiceMap;

    public MyFormService getInstance(String serviceKey) {
        return formServiceMap.get(serviceKey);
    }
}
