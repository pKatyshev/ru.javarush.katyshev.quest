package ru.javarush.katyshev.quest.services;

import ru.javarush.katyshev.quest.entities.Question;
import ru.javarush.katyshev.quest.repositories.QuestionRepository;

public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question getQuestionById(int id) {
        return questionRepository.getQuestionById(id);
    }
}
