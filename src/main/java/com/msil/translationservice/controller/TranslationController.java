package com.msil.translationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msil.translationservice.entity.TranslationContent;
import com.msil.translationservice.service.TranslationService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController()
@RequestMapping("/api/v1/translation")
public class TranslationController {
	@Autowired
    private TranslationService translationService;

    @PostMapping("/save")
    public String saveModel(@RequestBody TranslationContent translationContent) {
         translationService.save(translationContent);
         return "Done";
    }
    @GetMapping("/hello")
    public String sayHello() {
    	return "hi Hello";
    }
}
