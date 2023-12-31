package ru.javarush.katyshev.quest.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.javarush.katyshev.quest.repository.QuestionRepositoryImpl;

class QuestionServiceTest {
    private QuestionService questionService;

    @BeforeEach
    public void init() {
        questionService = new QuestionService(new QuestionRepositoryImpl());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    void getQuestionById(int id) {
        Assertions.assertEquals(id, questionService.getQuestionById(id).getId());
    }
}