INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('tutor@efrei.net', 'mdp', 'ACHVAR', 'Didier', '0702070207');

INSERT INTO Tuteur (Email, Poste, Remarque) VALUES ('tutor@efrei.net', 'Software Engineer', 'Une remarque');

INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student0@efrei.net', 'mdp', 'Student0-LN', 'student0-FN', '0423547569');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student1@efrei.net', 'mdp', 'Student1-LN', 'student1-FN', '0602060106');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student2@efrei.net', 'mdp', 'Student2-LN', 'student2-FN', '0602060106');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student3@efrei.net', 'mdp', 'Student3-LN', 'student3-FN', '0702070207');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student4@efrei.net', 'mdp', 'Student4-LN', 'student4-FN', '0702075675');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student5@efrei.net', 'mdp', 'Student5-LN', 'student5-FN', '0756870207');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student6@efrei.net', 'mdp', 'Student6-LN', 'student6-FN', '0624589512');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student7@efrei.net', 'mdp', 'Student7-LN', 'student7-FN', '0154785627');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student8@efrei.net', 'mdp', 'Student8-LN', 'student8-FN-Archived', '0702010205');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('student9@efrei.net', 'mdp', 'Student9-LN', 'student9-FN-Archived','0402010506');

INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student0@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student1@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student2@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student3@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student4@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student5@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student6@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student7@efrei.net', 'LSI', 'Software Engineering', 2023, false, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student8@efrei.net', 'LSI', 'Software Engineering', 2010, true, 'tutor@efrei.net');
INSERT INTO Apprenti (Email, Programme, Majeure, Annee, Archiver, EmailTuteur) VALUES ('student9@efrei.net', 'LSI', 'Software Engineering', 2010, true, 'tutor@efrei.net');

INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('corrupted@efrei.net', 'mdp', 'NEITHER', 'APPRENTICE_OR_TUTOR','0402010506');
