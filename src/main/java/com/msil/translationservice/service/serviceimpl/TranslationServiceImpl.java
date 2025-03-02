package com.msil.translationservice.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msil.translationservice.entity.TranslationContent;
import com.msil.translationservice.repository.TranslationRepository;
import com.msil.translationservice.service.TranslationService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class TranslationServiceImpl implements TranslationService {
	@Autowired
    private TranslationRepository translationRepository;

    public void save(TranslationContent translationContent) {
    	
         translationRepository.insertItem(translationContent);
    }
}
