<%--
  Created by IntelliJ IDEA.
  User: Minh-Tri NGUYEN, Ilyes TALAOUBRID, Lydia TERKI, Rayan MOUSSI, Sanaa ABDELLAH, Sélim HADDIOUI
  Date: 20/10/2023
  Time: 11:21
--%>

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <title>Jakarta EE - Login</title>
</head>

<body>
<div class="container" style="margin-top:30px">
    <div class="col-md-4">
        <div style="color:red">
            ${errorMessage}
        </div>
        <div class="login-panel panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Login</h3>
            </div>
            <div class="panel-body">
                <form action="${pageContext.request.contextPath}/login" method="post">
                    <fieldset>
                        <div class="form-group">
                            <label>
                                <input class="form-control" placeholder="Login" name="fieldLogin" autofocus="">
                            </label>
                        </div>
                        <div class="form-group">
                            <label>
                                <input class="form-control" placeholder="Mot de passe" name="fieldPassword" type="password">
                            </label>
                        </div>

                        <input type="submit" name="action" value="Login" class="btn btn-primary"/>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>