<%--
  Created by IntelliJ IDEA.
  User: Minh-Tri NGUYEN, Ilyes TALAOUBRID, Lydia TERKI, Rayan MOUSSI, Sanaa ABDELLAH, Sélim HADDIOUI
  Date: 22/10/2023
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Connexion</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous">
    </script>
    <style>
        .bg {
            width: 100%;
            height: 100vh;
            display: flex;

            background-size: 300% 300%;
            background-image: linear-gradient(-45deg, #6d6d6d 0%, #272727 25%, #6d6d6d 51%, #3f35ff 100%);
            -webkit-animation: AnimateBG 20s ease infinite;
            animation: AnimateBG 20s ease infinite;
        }

        @-webkit-keyframes AnimateBG {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
        }

        @keyframes AnimateBG {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
        }

        .custom-form-container {
            background-color: #bebebe; /* Gris légèrement plus foncé */
            border-radius: 10px;
            padding: 20px;
        }
        .custom-form-title {
            background-color: #bebebe; /* Même couleur que le fond du conteneur */
            display: inline-block;
            padding: 5px 15px;
            border-radius: 10px 10px 0 0; /* Coins supérieurs arrondis */
            margin: -20px -20px 20px -20px; /* Pour couvrir la bordure du conteneur */
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Asta</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0"></ul>
        </div>
    </div>
</nav>
<div class="bg">
    <div class="container mt-4">
        <div class="custom-form-container">
            <h2 class="custom-form-title">Connexion</h2>
            <div style="color:red">
                ${errorMessage}
            </div>
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Nom d'utilisateur</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="fieldEmail" autofocus="">
                    <div id="emailHelp" class="form-text">Nous ne partagerons jamais votre email.</div>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Mot de passe</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" name="fieldPassword">
                </div>
                <div class="mb-3 form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Retenir mes informations</label>
                </div>
                <input type="submit" name="action" value="Se connecter" class="btn btn-primary"/>
                <!--<p>Vous n'avez pas de compte ? <a href="inscription.html">Inscrivez-vous</a></p>-->
            </form>
        </div>
    </div>
</div>
</body>
</html>

