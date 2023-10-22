<%--
  Created by IntelliJ IDEA.
  User: ilyes
  Date: 22/10/2023
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Espace Tuteur-Enseignant</title>
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


    .rounded-table {
      overflow: hidden;
      border-radius: 10px; /* Ajustez la valeur en pixels selon vos préférences */
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
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Accueil</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Espace Apprenti</a>
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
  <div class="container mt-4">
    <div class="custom-form-container">
      <h2 class="custom-form-title">Liste des apprentis</h2>
      <table class="table rounded-table">
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
        <tr class="table-info">
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
        <tr class="table-info">
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
        <tr class="table-info">
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
        <tr class="table-info">
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
        <tr class="table-info">
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
        <tr class="table-info">
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
        <tr class="table-danger">
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
        <tr class="table-danger">
          <th scope="row">8</th>
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
        <tr class="table-danger">
          <th scope="row">9</th>
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
        <tr class="table-danger">
          <th scope="row">10</th>
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
        <tr class="table-danger">
          <th scope="row">11</th>
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
      </table>
      <div class="text-center">
        <button type="button" class="btn btn-primary btn-lg mx-auto">Ajouter un apprenti</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>

