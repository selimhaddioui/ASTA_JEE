DROP DATABASE IF EXISTS ApprentissageDB;
/*
drop table if exists apprentissagedb.evaluation_ecole;
drop table if exists apprentissagedb.mission;
drop table if exists apprentissagedb.evaluation;
drop table if exists apprentissagedb.visite;
drop table if exists apprentissagedb.apprenti;
drop table if exists apprentissagedb.maitre_apprentissage;
drop table if exists apprentissagedb.entreprise;
*/
CREATE DATABASE ApprentissageDB;

-- Utilisation de la base de données créée
USE ApprentissageDB;

-- Création des tables

CREATE TABLE Entreprise
(
    ID_Entreprise  INT PRIMARY KEY,
    Raison_sociale VARCHAR(255),
    Adresse        VARCHAR(255),
    Infos_utiles   VARCHAR(100)
);

CREATE TABLE Utilisateur
(
    ID_User    INT PRIMARY KEY,
    Email      VARCHAR(100),
    MotDePasse VARCHAR(100),
    Prenom     VARCHAR(50),
    Nom        VARCHAR(50),
    Tel        VARCHAR(20)
);

CREATE TABLE Maitre_Apprentissage
(
    ID_User       INT PRIMARY KEY,
    Email         VARCHAR(100),
    MotDePasse    VARCHAR(100),
    Prenom        VARCHAR(50),
    Nom           VARCHAR(50),
    Tel           VARCHAR(20),
    Poste         VARCHAR(100),
    Remarques     VARCHAR(200),
    ID_Entreprise INT,
    FOREIGN KEY (ID_Entreprise) REFERENCES Entreprise (ID_Entreprise)
);

CREATE TABLE Apprenti
(
    ID_User       INT PRIMARY KEY,
    Email         VARCHAR(100),
    MotDePasse    VARCHAR(100),
    Prenom        VARCHAR(50),
    Nom           VARCHAR(50),
    Tel           VARCHAR(20),
    Programme     VARCHAR(50),
    Majeure       VARCHAR(100),
    Annee         VARCHAR(50),
    Archiver      BOOLEAN,
    ID_Entreprise INT,
    ID_Maitre     INT,
    FOREIGN KEY (ID_Entreprise) REFERENCES Entreprise (ID_Entreprise),
    FOREIGN KEY (ID_Maitre) REFERENCES Maitre_Apprentissage (ID_User)
);

CREATE TABLE Mission
(
    ID_Mission    INT PRIMARY KEY,
    Mots_Cles     VARCHAR(100),
    Metier        VARCHAR(255),
    Commentaires  VARCHAR(200),
    ID_Apprenti   INT,
    ID_Entreprise INT,
    FOREIGN KEY (ID_Entreprise) REFERENCES Entreprise (ID_Entreprise),
    FOREIGN KEY (ID_Apprenti) REFERENCES Apprenti (ID_User)
);

CREATE TABLE Visite
(
    ID_Visite     INT PRIMARY KEY,
    Date          DATE,
    Format        VARCHAR(50),
    Compte_Rendu  VARCHAR(200),
    ID_Apprenti   INT,
    ID_Maitre     INT,
    ID_Entreprise INT,
    FOREIGN KEY (ID_Entreprise) REFERENCES Entreprise (ID_Entreprise),
    FOREIGN KEY (ID_Maitre) REFERENCES Maitre_Apprentissage (ID_User),
    FOREIGN KEY (ID_Apprenti) REFERENCES Apprenti (ID_User)
);

CREATE TABLE Evaluation
(
    ID_Evaluation   INT PRIMARY KEY,
    Sujet           VARCHAR(255),
    Date            DATE,
    Note            FLOAT,
    Commentaires    VARCHAR(200),
    Type_Evaluation VARCHAR(255),
    ID_Apprenti     INT,
    FOREIGN KEY (ID_Apprenti) REFERENCES Apprenti (ID_User)
);

-- Insert data into the "Entreprise" table
INSERT INTO Entreprise (ID_Entreprise, Raison_sociale, Adresse, Infos_utiles)
VALUES (1, 'ABC Manufacturing', '123 Main Street', 'Manufacturing company'),
       (2, 'XYZ Tech Solutions', '456 Tech Avenue', 'Tech services provider'),
       (3, 'Global Innovations', '789 Innovation Lane', 'Research and Dev. firm'),
       (4, 'Precision Tools Inc.', '101 Precision Street', 'Tool manufacturing'),
       (5, 'Software Solutions Ltd', '555 Software Road', 'Software development');

-- Insert data into the "Maitre_Apprentissage" table
INSERT INTO Maitre_Apprentissage (ID_User, Nom, Prenom, Poste, Email, Tel, Remarques, ID_Entreprise)
VALUES (1, 'Smith', 'John', 'Senior Engineer', 'john.smith@abc.com', '+1 123-456-789', NULL, 1),
       (2, 'Johnson', 'Jane', 'Lead Developer', 'jane.johnson@xyztech.com', '+1 987-654-321', 'Experienced', 2),
       (3, 'Brown', 'Robert', 'R&D Manager', 'rbrown@globalinnovations.com', '+1 555-123-789', NULL, 3),
       (4, 'Davis', 'Sarah', 'Production Manager', 'sarah.davis@precisiontools.com', '+1 777-111-333', 'Skilled', 4),
       (5, 'Wilson', 'James', 'Software Architect', 'james.wilson@softsol.com', '+1 999-888-777', 'Experienced', 5);

-- Insert data into the "Apprenti" table
INSERT INTO Apprenti (ID_User, Programme, Annee, Majeure, Nom, Prenom, Email, Tel, ID_Entreprise, ID_Maitre)
VALUES (1, 'A12345', '2', 'Computer Science', 'Miller', 'Emily', 'emily.miller@email.com', '+1 111-222-333', 1, 1),
       (2, 'B56789', '1', 'Electrical Eng.', 'Anderson', 'Michael', 'michael.anderson@email.com', '+1 444-555-666', 2,
        2),
       (3, 'C98765', '3', 'Mechanical Eng.', 'Lee', 'Olivia', 'olivia.lee@email.com', '+1 777-888-999', 3, 3),
       (4, 'A12345', '2', 'Computer Science', 'Harris', 'William', 'william.harris@email.com', '+1 222-333-444', 4, 4),
       (5, 'B56789', '1', 'Electrical Eng.', 'Clark', 'Sophia', 'sophia.clark@email.com', '+1 555-666-777', 5, 5);

-- Insert data into the "Mission" table
INSERT INTO Mission (ID_Mission, Mots_Cles, Metier, Commentaires, ID_Apprenti, ID_Entreprise)
VALUES (1, 'Data Analysis', 'Data Scientist', NULL, 1, 1),
       (2, 'Web Development', 'Web Developer', 'Ongoing', 2, 2),
       (3, 'Product Design', 'Industrial Designer', 'Completed', 3, 3),
       (4, 'Quality Control', 'Quality Engineer', 'In Progress', 4, 4),
       (5, 'Software Dev', 'Software Engineer', NULL, 5, 5);

-- Insert data into the "Visite" table
INSERT INTO Visite (ID_Visite, Date, Format, Compte_Rendu, ID_Apprenti, ID_Maitre, ID_Entreprise)
VALUES (1, '2023-03-15', 'On-Site', 'Met with team', 1, 1, 1),
       (2, '2023-04-20', 'Virtual', 'Discussed project', 2, 2, 2),
       (3, '2023-05-10', 'On-Site', 'Reviewed plans', 3, 3, 3),
       (4, '2023-06-05', 'Virtual', 'Inspected production', 4, 4, 4),
       (5, '2023-07-18', 'On-Site', 'Reviewed code', 5, 5, 5);

-- Insert data into the "Evaluation" table
INSERT INTO Evaluation (ID_Evaluation, Sujet, Date, Note, Commentaires, Type_Evaluation, ID_Apprenti)
VALUES (1, 'Project Report', '2023-04-15', 94.5, 'Well done!', 'Mid-term', 1),
       (2, 'Coding Skills', '2023-05-25', 88.2, 'Good progress', 'Mid-term', 2),
       (3, 'Design Skills', '2023-06-15', 76.0, 'Needs improvement', 'Mid-term', 3),
       (4, 'Quality Review', '2023-07-05', 90.1, 'Great work!', 'Mid-term', 4),
       (5, 'Software Design', '2023-08-20', 85.5, 'Good effort', 'Mid-term', 5);
