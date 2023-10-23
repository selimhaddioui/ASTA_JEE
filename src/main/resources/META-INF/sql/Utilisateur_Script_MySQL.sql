DROP DATABASE IF EXISTS ApprentissageDB;
CREATE DATABASE ApprentissageDB;


-- Utilisation de la base de données ApprentissageDB
USE ApprentissageDB;

DROP TABLE IF EXISTS UTILISATEUR;

DROP TABLE IF EXISTS Apprenti;

CREATE TABLE UTILISATEUR
(
    ID_User    INT PRIMARY KEY,
    Email      VARCHAR(100) UNIQUE,
    MotDePasse VARCHAR(100),
    Prenom     VARCHAR(50),
    Nom        VARCHAR(50),
    Tel        VARCHAR(20),
    CONSTRAINT email_unique_constraint UNIQUE (Email)
);

CREATE TABLE Apprenti
(
    ID_User    INT PRIMARY KEY,
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
    CONSTRAINT email_unique_constraint UNIQUE (Email)
);

-- Insert data into the "Utilisateur" table
INSERT INTO UTILISATEUR (ID_User, Email, MotDePasse, Nom, Prenom, Tel)
VALUES (1, 'emily.miller@email.com', 'miller78', 'Miller', 'Emily', '+1 111-222-333'),
       (2, 'michael.anderson@email.com', '12345', 'Anderson', 'Michael', '+1 444-555-666'),
       (3, 'olivia.lee@email.com', 'olee', 'Lee', 'Olivia', '+1 777-888-999'),
       (4, 'william.harris@email.com', 'mdp123', 'Harris', 'William', '+1 222-333-444'),
       (5, 'sophia.clark@email.com', 'mdp456', 'Clark', 'Sophia', '+1 555-666-777');


-- Insert data into the "Apprenti" table
INSERT INTO Apprenti (ID_User, Email, MotDePasse, Nom, Prenom, Tel, Programme, Majeure, Annee, Archiver)
VALUES (1, 'emily.miller@email.com', 'miller78', 'Miller', 'Emily', '+1 111-222-333', 'A12345', 'Computer Science',
        '2023', false),
       (2, 'michael.anderson@email.com', '12345', 'Anderson', 'Michael', '+1 444-555-666', 'B56789', 'Electrical Eng.',
        '2024', false),
       (3, 'olivia.lee@email.com', 'olee', 'Lee', 'Olivia', '+1 777-888-999', 'C98765', 'Mechanical Eng.',
        '2024', false),
       (4, 'william.harris@email.com', 'mdp123', 'Harris', 'William', '+1 222-333-444', 'A12345', 'Computer Science',
        '2025', false),
       (5, 'sophia.clark@email.com', 'mdp456', 'Clark', 'Sophia', '+1 555-666-777', 'B56789', 'Electrical Eng.',
        '2010', true);

