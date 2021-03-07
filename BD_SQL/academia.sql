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
imc DECIMAL
)