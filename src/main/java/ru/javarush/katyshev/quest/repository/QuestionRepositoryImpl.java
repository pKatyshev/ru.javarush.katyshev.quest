package ru.javarush.katyshev.quest.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import ru.javarush.katyshev.quest.entity.Question;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@Slf4j(topic = "QuestionRepository")
public class QuestionRepositoryImpl implements QustionRepository {
    private final List<Question> questions;

    public QuestionRepositoryImpl() {
        ObjectMapper mapper = new ObjectMapper();
        URL resource = getClass().getClassLoader().getResource("question.json");
        File file = new File(resource.getFile());

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
