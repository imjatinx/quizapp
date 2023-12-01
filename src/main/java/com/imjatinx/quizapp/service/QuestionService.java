package com.imjatinx.quizapp.service;

import com.imjatinx.quizapp.Question;
import com.imjatinx.quizapp.dao.QuestionDao;

import java.util.List;

public class QuestionService {

    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}
