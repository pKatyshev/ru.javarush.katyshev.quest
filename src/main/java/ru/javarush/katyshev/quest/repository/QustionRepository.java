package ru.javarush.katyshev.quest.repository;

import ru.javarush.katyshev.quest.entity.Question;

public interface QustionRepository {
    Question getQuestionById(int id);
}
