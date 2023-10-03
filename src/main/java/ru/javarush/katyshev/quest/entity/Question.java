package ru.javarush.katyshev.quest.entity;

import lombok.Data;

import java.util.List;

@Data
public class Question {
    private int id;
    private String textQuestion;
    private List<String> textAnswers;
    private List<Integer> nextQuestionId;
    private boolean isLose = false;
    private boolean isWin = false;

}
