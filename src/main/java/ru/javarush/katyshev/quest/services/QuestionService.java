package ru.javarush.katyshev.quest.services;

import ru.javarush.katyshev.quest.entity.Question;
import ru.javarush.katyshev.quest.repository.QustionRepository;

public class QuestionService {

    private final QustionRepository questionRepository;

    public QuestionService(QustionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question getQuestionById(int id) {
        return questionRepository.getQuestionById(id);
    }
}
