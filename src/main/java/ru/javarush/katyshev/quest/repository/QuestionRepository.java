package ru.javarush.katyshev.quest.repository;

import ru.javarush.katyshev.quest.entity.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionRepository {
    private final List<Question> questions = new ArrayList<>();

    {
        Question question1 = new Question();
        question1.setId(1);
        question1.setTextQuestion("Ты потерял память. Принять вызов НЛО?");
        question1.setTextAnswers(Arrays.asList("Принять вызов", "Отклонить вызов"));
        question1.setNextQuestionId(Arrays.asList(2, 3));

        Question question2 = new Question();
        question2.setId(2);
        question2.setTextQuestion("Ты принял вызов. Поднимешься на мостик к капитану?");
        question2.setTextAnswers(Arrays.asList("Подняться на мостик", "Отказаться подниматься на мостик"));
        question2.setNextQuestionId(Arrays.asList(4, 5));

        Question question3 = new Question();
        question3.setId(3);
        question3.setTextQuestion("Ты отклонил вызов. Поражение");
        question3.setTextAnswers(Arrays.asList("", ""));
        question3.setNextQuestionId(Arrays.asList(-1, -1));
        question3.setLose(true);

        Question question4 = new Question();
        question4.setId(4);
        question4.setTextQuestion("Ты поднялся на мостик. Ты кто?");
        question4.setTextAnswers(Arrays.asList("Рассказвть правду о себе", "Солгать"));
        question4.setNextQuestionId(Arrays.asList(6, 7));

        Question question5 = new Question();
        question5.setId(5);
        question5.setTextQuestion("Ты не пошел на переговоры. Поражение");
        question5.setTextAnswers(Arrays.asList("", ""));
        question5.setNextQuestionId(Arrays.asList(-1, -1));
        question5.setLose(true);

        Question question6 = new Question();
        question6.setId(6);
        question6.setTextQuestion("Тебя вернули домой! Победа!");
        question6.setTextAnswers(Arrays.asList("", ""));
        question6.setNextQuestionId(Arrays.asList(-1, -1));
        question6.setWin(true);

        Question question7 = new Question();
        question7.setId(7);
        question7.setTextQuestion("Врать не хорошо. Поражение");
        question7.setTextAnswers(Arrays.asList("", ""));
        question7.setNextQuestionId(Arrays.asList(-1, -1));
        question7.setLose(true);

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);

        System.out.println("repository has been initialised");
    }

    public Question getQuestionById(int id) {
        return questions.get(--id);
    }
}
