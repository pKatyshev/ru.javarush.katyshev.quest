package ru.javarush.katyshev.quest.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.javarush.katyshev.quest.entity.Question;
import ru.javarush.katyshev.quest.repository.QuestionRepository;
import ru.javarush.katyshev.quest.services.QuestionService;

public class QuestionRepositoryTest {
    private QuestionService questionService;

    @BeforeEach
    public void init() {
        questionService = new QuestionService(new QuestionRepository());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
    void loopingTest(int id){
        Question question = questionService.getQuestionById(id);
        boolean isOver = question.isLose() || question.isWin();

        if (isOver) {
            Assertions.assertTrue(true);
        } else {
            Assertions.assertNotEquals(id, question.getNextQuestionId().get(0));
            Assertions.assertNotEquals(id, question.getNextQuestionId().get(1));
        }

    }
}
