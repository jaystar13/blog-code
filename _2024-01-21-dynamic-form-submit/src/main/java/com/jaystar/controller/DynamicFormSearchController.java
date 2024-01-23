package com.jaystar.controller;

import com.jaystar.dto.MySections;
import com.jaystar.dto.MySectionsSubmit;
import com.jaystar.service.DynamicFormSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class DynamicFormSearchController {

    private final DynamicFormSearchService service;

    @GetMapping("/forms")
    public String getDynamicForms(Model model) {

        MySections sections = service.getForms(getSectionItems());

        model.addAttribute("sections", sections);

        return "dynamicForm";
    }

    @PostMapping("/forms")
    public String submitDynamicForms(@ModelAttribute("sections") MySectionsSubmit submit) {
        log.info("mySectionsSubmit sections={}", submit);

        service.saveForms(getSectionItems(), submit);

        return "redirect:/forms";
    }

    private List<SectionItem> getSectionItems() {
        return Arrays.asList(SectionItem.PROFILE, SectionItem.ORDER);
    }
}
