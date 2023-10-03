<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello page</title>
    <script src="bootstrap.js"></script>
</head>
<body>
<h1><%= "Название квеста" %>
</h1>
<br>
<p>Нет времени писать легенду. Но её можно прописать тут</p>
<p>Пока просто представься</p>
<br/>

<form class="form-horizontal" action="game-servlet" method="post">
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Введите свое имя</label>
        <div class="col-md-4">
            <input id="textinput" name="username-from-form" type="text" placeholder="" class="form-control input-md">
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-4 control-label" for="button"></label>
        <div class="col-md-4">
            <button id="button" name="button" class="btn btn-success">Перейти к квесту</button>
        </div>
    </div>
</form>

</body>
</html>