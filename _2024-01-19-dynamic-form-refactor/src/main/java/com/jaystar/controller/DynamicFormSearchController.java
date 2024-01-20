package com.jaystar.controller;

import com.jaystar.dto.MySections;
import com.jaystar.service.DynamicFormSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class DynamicFormSearchController {

    private final DynamicFormSearchService service;

    @GetMapping("/forms")
    public String getDynamicForms(Model model) {
        String[] formNames = {"myProfileFormService", "myOrderFormService"};

        MySections sections = service.getForms(formNames);

        model.addAttribute("sections", sections);

        return "dynamicForm";
    }
}
