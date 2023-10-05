package ru.javarush.katyshev.quest.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import ru.javarush.katyshev.quest.entity.Question;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j(topic = "QuestionRepository")
public class QuestionRepositoryImpl implements QustionRepository {
    private final List<Question> questions;

    public QuestionRepositoryImpl() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("M:\\IDEA_proj\\ru.javarush.katyshev.quest\\src\\main\\resources\\question.json");

        try {
            questions = mapper.readValue(file, new TypeReference<>() {});
        } catch (IOException e) {
            log.error("Question List was not initialized");
            throw new RuntimeException(e);
        }

        log.info("repository has been initialised");
    }

    @Override
    public Question getQuestionById(int id) {
        return questions.get(--id);
    }
}
