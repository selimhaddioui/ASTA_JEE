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
    <title>Espace Apprenti(e)</title>
    <link rel="stylesheet" href="<c:url value="/css/apprenti.css" />"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
</head>

<body>
<%@ include file="/WEB-INF/jspf/menu.jspf" %>

<div class="bg">
    <div class="big-container mt-4">
        <h1>Informations</h1>
        <!-- Informations sur l'entreprise -->
        <div class="container mt-4 mb-4">
            <h2>Raison sociale de l'entreprise</h2>
            <p>${selectedApprentice.job.company.companyName}</p>
        </div>

        <div class="container mt-4 mb-4">
            <h2>Adresse de l'entreprise</h2>
            <p>${selectedApprentice.job.company.address}</p>
        </div>

        <div class="container mt-4 mb-4">
            <h2>Informations d'accès aux locaux de l'entreprise</h2>
            <p>${selectedApprentice.job.company.accessInformation}</p>
        </div>

        <!-- Informations sur le tuteur d'apprentissage -->
        <div class="container mt-4 mb-4">
        <h2>Tuteur d'apprentissage</h2>
            <p>Nom : ${selectedApprentice.tutor.lastName}</p>
            <p>Prénom : ${selectedApprentice.tutor.firstName}</p>
            <p>Poste : ${selectedApprentice.tutor.job}</p>
            <p>Adresse électronique : ${selectedApprentice.tutor.email}</p>
        </div>

        <!-- Informations sur la mission -->
        <div class="container mt-4 mb-4">
            <h2>Mission</h2>
            <p>Mots clés de la mission : ${selectedApprentice.job.descriptionKeysWords}</p>
            <p>Métier cible CIGREF : ${selectedApprentice.job.cigrefJob}</p>
            <p>Commentaires : ${selectedApprentice.job.remarks}</p>
            <p>Retour d'expérience : ${selectedApprentice.job.apprenticeFeedBack}</p>
            <p>Notation : ${selectedApprentice.job.apprenticeGrading}%</p>
        </div>

        <div class="container mt-4 mb-4">
            <!-- Informations sur les visites du tuteur -->
            <c:if test="${selectedApprentice.visits.size() != 0}">
                <h2>Visite(s) du tuteur</h2>
            </c:if>
            <c:forEach items="${selectedApprentice.visits}" var="visit" varStatus="loop">
                <h3>Date de la visite : ${visit.date}</h3>
                <p>Format de la visite : ${visit.format}</p>
                <p>Compte rendu : ${visit.remarks}</p>
            </c:forEach>

            <!-- Informations sur les notes -->
            <c:if test="${selectedApprentice.grades.size() != 0}">
                <h2>Notes</h2>
            </c:if>
            <c:forEach items="${selectedApprentice.grades}" var="grade" varStatus="loop">
                <h3>Type d'évaluation : ${grade.type}</h3>
                <p>Sujet de l'évaluation : ${grade.subject}</p>
                <p>Date de l'évaluation : ${grade.date}</p>
                <p>Note : ${grade.grade}%</p>
                <p>Commentaires : ${grade.remarks}</p>
            </c:forEach>
        </div>
    </div>
</div>

</body>
</html>
