package ru.javarush.katyshev.quest.controller;


import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import org.apache.commons.lang3.StringUtils;
import ru.javarush.katyshev.quest.repositories.QuestionRepository;
import ru.javarush.katyshev.quest.services.QuestionService;


@WebServlet(name = "gameServlet", urlPatterns = "/game-servlet")
public class GameServlet extends HttpServlet {
    private QuestionService questionService;

    @Override
    public void init() {
        questionService = new QuestionService(new QuestionRepository());

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String reboot = request.getParameter("reboot");
        if (reboot != null){
            if (reboot.equals("true")) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                session.invalidate();
                requestDispatcher.forward(request, response);
                return;
            }
        }

        int answerId = Integer.parseInt(request.getParameter("answer"));

        request.setAttribute("question", questionService.getQuestionById(answerId));

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("game.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();

        String username = request.getParameter("username-from-form");
        if (StringUtils.isBlank(username)) {
            username = "Аноним";
        }

        session.setAttribute("username", username);
        session.setAttribute("sessionId", request.getRequestedSessionId());
        request.setAttribute("question", questionService.getQuestionById(1));

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("game.jsp");
        requestDispatcher.forward(request, response);
    }
}
