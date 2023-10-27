<%--
  Created by IntelliJ IDEA.
  User: Minh-Tri NGUYEN, Ilyes TALAOUBRID, Lydia TERKI, Rayan MOUSSI, Sanaa ABDELLAH, Sélim HADDIOUI
  Date: 22/10/2023
  Time: 15:02
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Espace Tuteur-Enseignant</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="/WEB-INF/css/tutor.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
</head>

<body>

<%@ include file="/WEB-INF/jspf/menu.jspf" %>

<div class="bg">
    <div class="container mt-4 mb-4">
        <div class="custom-form-container">
            <div class="d-flex justify-content-between align-items-center">
                <h2 class="custom-form-title">Liste des apprentis</h2>
                <div class="dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Filtrer
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end w-auto">
                        <li><a class="dropdown-item" href="#">Tous</a></li>
                        <li><a class="dropdown-item" href="#">Archivé</a></li>
                        <li><a class="dropdown-item" href="#">Non archivé</a></li>
                    </ul>
                </div>
            </div>
            <c:choose>
                <c:when test="${apprentices.isEmpty()}">
                    <p>${emptyListMessage}</p>
                </c:when>
                <c:otherwise>
                    <%@ include file="/WEB-INF/jspf/apprentices_list.jspf" %>
                </c:otherwise>
            </c:choose>
            <div class="text-center">
                <button type="button" class="btn btn-secondary btn-lg mx-auto">Ajouter un apprenti</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
