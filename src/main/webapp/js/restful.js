var userDataElement = document.getElementById('data');
var content = document.getElementById('content');
var logout = document.getElementById('logout');
var apiUrl = "/ASTA/user";
console.log(userDataElement);
console.log(content);
fetch(apiUrl)
    .then(response => {
        if (!response.ok) {
            throw new Error('Vous n\'êtes pas autorisée à accéder à cette page ! Veuillez vous connectez.');
        }
        return response.json();
    })
    .then(data => {
        console.log(data);
        userDataElement.innerHTML = "Bonjour " + data.firstName + " " + data.lastName + " !";
        content.innerHTML = "Bienvenu sur la page RESTFul !";
        logout.href = "/ASTA/logout";
        logout.innerText = "Se déconnecter";
    })
    .catch(error => {
        content.innerHTML = error.message;
    });