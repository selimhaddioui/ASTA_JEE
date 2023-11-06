INSERT INTO Entreprise (RaisonSocial, Adresse, InfosAcces) VALUES ('ABC Manufacturing', '123 Main Street', 'Badge nécessaire');
INSERT INTO Entreprise (RaisonSocial, Adresse, InfosAcces) VALUES ('XYZ Manufacturing', '456 Main Street', 'Pièce didentité nécessaire');
INSERT INTO Entreprise (RaisonSocial, Adresse, InfosAcces) VALUES ('ABC Consulting', '123 Main Street', 'étage 2');

INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('tutor@efrei.net', 'mdp', 'ACHVAR', 'Didier', '0702070207');
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('tutor_without_apprentice@efrei.net', 'mdp', 'TUTEUR', 'tuteur', '0702070207');
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
INSERT INTO Utilisateur (Email, MotDePasse, Nom, Prenom, Tel) VALUES ('corrupted@efrei.net', 'mdp', 'NEITHER', 'APPRENTICE_OR_TUTOR','0402010506');

INSERT INTO Tuteur (Email, Poste, Remarque) VALUES ('tutor@efrei.net', 'Software Engineer', 'Une remarque');
INSERT INTO Tuteur (Email, Poste, Remarque) VALUES ('tutor_without_apprentice@efrei.net', 'Data Scientist', 'Un tuteur sans apprenti');

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

INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('ABC Manufacturing', 'student0@efrei.net', 'DevOps, node.js, CI CD, Tests', 'Expert en cybersécurité', 'Un commentaire', 'Suivi au top', '100');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('ABC Manufacturing', 'student1@efrei.net', 'React, SQL, POO', 'Assistant fonctionnel', 'Un commentaire', 'Suivi au top', '75');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('ABC Manufacturing', 'student2@efrei.net', 'TDD, QA, Audit', 'Testeur', 'Un commentaire', 'Suivi au top', '80');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('ABC Manufacturing', 'student3@efrei.net', 'Cyber, Reseau, Cloud', 'Auditeur SSI', 'Un commentaire', 'Suivi a revoir', '50');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('XYZ Manufacturing', 'student4@efrei.net', 'Chef de projet, ScrumMaster', 'Paramétreur de progiciels', 'Un commentaire', 'Suivi a revoir', '60');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('XYZ Manufacturing', 'student5@efrei.net', 'Software Engineer', 'Technicien d exploitation', 'Un commentaire', 'Suivi a revoir', '70');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('XYZ Manufacturing', 'student6@efrei.net', 'Developpeur .NET', 'Architecte Technique', 'Un commentaire', 'Suivi a revoir', '80');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('XYZ Manufacturing', 'student7@efrei.net', 'Java, C sharp', 'Concepteur Developpeur', 'Un commentaire', 'Aucun suivi', '0');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('ABC Consulting', 'student8@efrei.net', 'Spring, JEE', 'Assistant fonctionnel', 'Un commentaire', 'Aucun suivi', '5');
INSERT INTO Mission (Entreprise, Apprenti, Description, Cigref, Commentaire, FeedbackApprenti, EvaluationApprenti) VALUES ('ABC Consulting', 'student9@efrei.net', 'Product Owner, Scrum Master', 'Product Owner', 'Un commentaire', 'Aucun suivi', '15');

INSERT INTO Visite (Apprenti, Date, Format, CompteRendu) VALUES ('student2@efrei.net', '2021-01-01', 'Présentiel', 'Bon environnement');
INSERT INTO Visite (Apprenti, Date, Format, CompteRendu) VALUES ('student3@efrei.net', '2021-02-01', 'Présentiel', 'Equipe bienveillante');
INSERT INTO Visite (Apprenti, Date, Format, CompteRendu) VALUES ('student4@efrei.net', '2021-03-01', 'Distanciel', 'Manager à l écoute');
INSERT INTO Visite (Apprenti, Date, Format, CompteRendu) VALUES ('student5@efrei.net', '2023-04-01', 'Présentiel', 'Equipe bienveillante');
INSERT INTO Visite (Apprenti, Date, Format, CompteRendu) VALUES ('student5@efrei.net', '2021-04-01', 'Distanciel', 'Eleve motivé et integré');

INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (1, 'student0@efrei.net', 'Sujet 1', '2021-01-01', 100, 'Un commentaire', 'Mémoire');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (2, 'student1@efrei.net', 'Sujet 2', '2021-02-01', 100, 'Un commentaire', 'Rapport');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (3, 'student2@efrei.net', 'Sujet 3', '2021-03-01', 100, 'Un commentaire', 'Soutenance');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (4, 'student2@efrei.net', 'Sujet 4', '2021-04-01', 100, 'Un commentaire', 'Mémoire');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (5, 'student2@efrei.net', 'Sujet 5', '2021-05-01', 100, 'Un commentaire', 'Rapport');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (6, 'student5@efrei.net', 'Sujet 6', '2021-02-01', 100, 'Au top', 'Mémoire');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (6, 'student5@efrei.net', 'Sujet 10', '2021-06-01', 100, 'Niquel', 'Soutenance');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (7, 'student7@efrei.net', 'Sujet 7', '2021-07-01', 100, 'Un commentaire', 'Rapport');
INSERT INTO Evaluation (ID_Evaluation, Apprenti, Sujet, Date, Note, Commentaire, Type_Evaluation) VALUES (8, 'student8@efrei.net', 'Sujet 8', '2021-08-01', 100, 'Un commentaire', 'Soutenance');
