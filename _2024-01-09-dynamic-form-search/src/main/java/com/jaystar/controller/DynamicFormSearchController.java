package com.jaystar.controller;

import com.jaystar.dto.MyForm;
import com.jaystar.service.DynamicFormSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class DynamicFormSearchController {

    private final DynamicFormSearchService service;

    @GetMapping("/forms")
    public String getDynamicForms(Model model) {
        String[] formNames = {"myProfileFormService", "myOrderFormService"};

        List<List<MyForm>> forms = service.getForms(formNames);

        model.addAttribute("section", forms);

        return "dynamicForm";
    }
}
