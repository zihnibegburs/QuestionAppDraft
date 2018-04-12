package com.begburs.mevlutBul.service;

import com.begburs.mevlutBul.model.Question;
import com.begburs.mevlutBul.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void saveQuestion(Question question){

       questionRepository.save(question);

    }
}
