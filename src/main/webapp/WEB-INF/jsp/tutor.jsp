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
            <table class="table rounded-table table-dark">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Prénom</th>
                    <th scope="col">Nom</th>
                    <th scope="col">Programme</th>
                    <th scope="col">Majeure</th>
                    <th scope="col">Année Académique</th>
                    <th scope="col">Adresse Electronique</th>
                    <th scope="col">Téléphone</th>
                    <th scope="col">Entreprise</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <tr class="table-warning">
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>
                        <button type="button" class="btn btn-light">...</button>
                    </td>
                </tr>
                <tr class="table-warning">
                    <th scope="row">2</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>
                        <button type="button" class="btn btn-light">...</button>
                    </td>
                </tr>
                <tr class="table-warning">
                    <th scope="row">3</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>
                        <button type="button" class="btn btn-light">...</button>
                    </td>
                </tr>
                <tr class="table-secondary">
                    <th scope="row">4</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>
                        <button type="button" class="btn btn-light">...</button>
                    </td>
                </tr>
                <tr class="table-secondary">
                    <th scope="row">5</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>
                        <button type="button" class="btn btn-light">...</button>
                    </td>
                </tr>
                <tr class="table-secondary">
                    <th scope="row">6</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>
                        <button type="button" class="btn btn-light">...</button>
                    </td>
                </tr>
                <tr class="table-warning">
                    <th scope="row">7</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>
                        <button type="button" class="btn btn-light">...</button>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="d-flex justify-content-center">
                <!-- Ajoutez ici la pagination Bootstrap avec une classe personnalisée -->
                <ul class="pagination custom-pagination">
                    <li class="page-item disabled">
                        <span class="page-link">Précédent</span>
                    </li>
                    <li class="page-item active" aria-current="page">
                        <span class="page-link">1</span>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">2</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">3</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">Suivant</a>
                    </li>
                </ul>
            </div>

            <div class="text-center">
                <button type="button" class="btn btn-secondary btn-lg mx-auto">Ajouter un apprenti</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
