<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Espace Tuteur-Enseignant</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <style>
        .bg {
            width: 100%;
            display: flex;
            background-size: cover;
            background-color: #727272;
        }

        .custom-form-container {
            color: whitesmoke;
            background-color: #343a40;
            padding: 20px;
            margin: 0 auto;
        }

        .custom-form-title {
            background-color: #343a40;
            display: inline-block;
            padding: 5px 15px;
            margin: -20px -20px 20px -20px;
        }

        .rounded-table {
            overflow: hidden;
            border-radius: 10px;
        }
    </style>
</head>

<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">ASTA</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Accueil</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Archive</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Documents
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" aria-disabled="true">Se déconnecter</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Chercher</button>
            </form>
        </div>
    </div>
</nav>
<div class="bg">
    <div class="container mt-4 mb-4">
        <div class="custom-form-container">
            <div class="d-flex justify-content-between align-items-center">
                <h2 class="custom-form-title">Liste des apprentis</h2>
                <div class="dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
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
                <tr class="table-light">
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
                <tr class="table-light">
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
                <tr class="table-light">
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
                <tr class="table-light">
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
            <div class="text-center">
                <!-- Ajoutez ici la pagination Bootstrap -->
                <ul class="pagination">
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
        </div>
    </div>
</div>
</body>
</html>
