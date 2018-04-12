package com.begburs.mevlutBul.controller;

import com.begburs.mevlutBul.model.Question;
import com.begburs.mevlutBul.service.QuestionService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String questionPage(Model model) {

        return "home";
    }


    @GetMapping("/saveQuestion")
    public void saveQuestion(@RequestParam(value="question", required=true)String question,
                           @RequestParam(value="answerA", required=true)String answerA,
                           @RequestParam(value="answerB", required=true)String answerB,
                           @RequestParam(value="answerC", required=true)String answerC,
                           @RequestParam(value="answerD", required=true)String answerD) {

        Question newQuestion = new Question();
        newQuestion.setQuestion(question);
        newQuestion.setAnswerA(answerA);
        newQuestion.setAnswerB(answerB);
        newQuestion.setAnswerC(answerC);
        newQuestion.setAnswerD(answerD);
        questionService.saveQuestion(newQuestion);
    }
}

