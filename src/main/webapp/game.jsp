<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Game</title>
    <script src="bootstrap.js"></script>
</head>
<body>
<h4>Игрок: ${sessionScope.username}</h4>
<p>id сессии: ${sessionScope.sessionId}</p>
<h3>${requestScope.question.textQuestion}</h3>

<c:if test="${requestScope.question.lose || requestScope.question.win}">
    <c:if test="${requestScope.question.win}">
        <p>ты победил</p>
    </c:if>
    <c:if test="${requestScope.question.lose}">
        <p>ты проиграл</p>
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
                    <button id="button1id" name="answer" value="${requestScope.question.nextQuestionId.get(0)}"
                            class="btn btn-success">${requestScope.question.textAnswers.get(0)}</button>
                    <br>
                    <button id="button2id" name="answer" value="${requestScope.question.nextQuestionId.get(1)}"
                            class="btn btn-danger">${requestScope.question.textAnswers.get(1)}</button>
                </div>
            </div>
        </fieldset>
    </form>
</c:if>

</body>
</html>
