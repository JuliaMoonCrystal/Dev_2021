CREATE DATABASE academia
GO
USE academia

CREATE TABLE alunos(
codigo_aluno INT PRIMARY KEY,
nome VARCHAR(100)
)

CREATE TABLE atividade(
codigo INT NOT NULL PRIMARY KEY,
descricao VARCHAR(100),
imc DECIMAL(7,2)
)

CREATE TABLE Atividade_Alunos(
Aluno_Codigo INT ,
altura DECIMAL(7,2),
peso DECIMAL(7,2),
imc DECIMAL(7,2),
atividade_codigo INT
PRIMARY KEY(Aluno_codigo,atividade_codigo),
FOREIGN  key(Aluno_codigo) REFERENCES alunos(codigo_aluno),
FOREIGN  key(atividade_codigo) REFERENCES atividade(codigo)
)

INSERT INTO atividade VALUEs
(1,'Corrida + Step', 18.5),
(2,'Biceps + Costas + Pernas', 24.9),
(3,'Esteira+ Biceps + Costas + Pernas', 29.9),
(4,'Bicicleta + Biceps + Costas + Pernas', 34.9),
(5,'Esteira + Bicicleta ',39.9)

SELECT*FROM atividade
SELECT*FROM alunos
SELECT*FROM Atividade_Alunos

--DROP TABLE atividade
--DROP TABLE alunos
--DROP TABLE Atividade_Alunos
