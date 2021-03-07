CREATE DATABASE academia
GO
USE academia

CREATE TABLE alunos(
codigo_aluno INT,
nome VARCHAR(100)
)

CREATE TABLE atividade(
codigo INT NOT NULL ,
descricao VARCHAR(100),
imc DECIMAL(7,2)
)

INSERT INTO atividade VALUEs
(1,'Corrida + Step', 18.5),
(2,'Biceps + Costas + Pernas', 24.9),
(3,'Esteira+ Biceps + Costas + Pernas', 29.9),
(4,'Bicicleta + Biceps + Costas + Pernas', 34.9),
(5,'Esteira + Bicicleta ',39.9)

SELECT*FROM atividade
