# ASTA_JEE

## Base de données.

Url, login et mot de passe indiqué dans le fichier [persistence.xml](./src/main/resources/META-INF/persistence.xml).
WildFly se charge d'héberger la base de donnée. 
Les SGBD (WAMP, MAMP, LAMP, XAMPP, ...) ne semble pas utile. 


## Login

Connexion via les logins suivants :  

- Apprenti :  
  - Email : student1@efrei.net  
  - Mot de passe : mdp  

- Tuteur avec des apprentis à charge :  
  - Email : tutor@efrei.net  
  - Mot de passe : mdp  

- Tuteur sans apprenti à charge :  
  - Email : tutor_without_apprentice@efrei.net  
  - Mot de passe : mdp  

- Utilisateur sans rôle :  
  - Email : corrupted@efrei.net  
  - Mot de passe : mdp  

Pour plus de logins consulter [insert_asta.sql](./src/main/resources/META-INF/sql/insert_asta.sql).

## Reste à faire

Retravailler le front si nécessaire.  

2.b Bonus (+1) : Affichez au maximum 5 apprenti(e)s en gérant la pagination des données.  
6 Recherche en tapant dans un champ l'une des données suivantes : entreprise, mot-clé de la mission.  
1.a La Vue: Il faut qu'au moins une de vos pages soit basée à 100% sur des services Web RESTful. Donc vous n'utiliserez pas de JSP dans cette page.  
Rapport de projet.
Bonus Spring (+3) 