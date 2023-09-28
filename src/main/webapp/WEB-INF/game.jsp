<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Game</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</head>
<body>
<h4>Игрок: ${sessionScope.username}</h4>
<p>id сессии: ${sessionScope.sessionId}</p>
<h3>${requestScope.question.textQuestion}</h3>

<c:if test="${requestScope.question.lose || requestScope.question.win}">
    <c:if test="${requestScope.question.win}">
        <p>лол... ты победил</p>
    </c:if>
    <c:if test="${requestScope.question.lose}">
        <p>лол... ты проиграл</p>
    </c:if>
    <form class="form-horizontal">
        <div class="form-group">
            <label class="col-md-4 control-label" for="lose-button"></label>
            <div class="col-md-4">
                <button id="lose-button" name="reboot" value="true" class="btn btn-warning">Перезапустить</button>
            </div>
        </div>
    </form>
</c:if>

<c:if test="${!requestScope.question.win && !requestScope.question.lose}">
<form class="form-horizontal">
    <fieldset>
        <div class="form-group">
            <label class="col-md-4 control-label" for="button1id">Прими решение...</label>
            <div class="col-md-8">
                <button id="button1id" name="answer" value="${requestScope.question.nextQuestionId.get(0)}" class="btn btn-success">${requestScope.question.textAnswers.get(0)}</button>
                <br>
                <button id="button2id" name="answer" value="${requestScope.question.nextQuestionId.get(1)}" class="btn btn-danger">${requestScope.question.textAnswers.get(1)}</button>
            </div>
        </div>
    </fieldset>
</form>
</c:if>

</body>
</html>
