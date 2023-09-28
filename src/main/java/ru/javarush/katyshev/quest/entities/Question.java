package ru.javarush.katyshev.quest.entities;

import java.util.List;

public class Question {
    private int id;
    private String textQuestion;
    private List<String> textAnswers;
    private List<Integer> nextQuestionId;
    private boolean isLose = false;
    private boolean isWin = false;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public List<String> getTextAnswers() {
        return textAnswers;
    }

    public void setTextAnswers(List<String> textAnswers) {
        this.textAnswers = textAnswers;
    }

    public List<Integer> getNextQuestionId() {
        return nextQuestionId;
    }

    public void setNextQuestionId(List<Integer> nextQuestionId) {
        this.nextQuestionId = nextQuestionId;
    }

    public boolean isLose() {
        return isLose;
    }

    public void setLose(boolean lose) {
        isLose = lose;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }
}
