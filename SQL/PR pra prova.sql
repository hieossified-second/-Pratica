CREATE View VerNomeCLi
AS
SELECT customer.first_name as 'Nome',
       customer.last_name as 'Sobre Nome',
       CONCAT(customer.first_name  " " customer.last_name)
FROM customer
where id = 1;

CREATE TABLE alunos (
    id INT PRIMARY key AUTO_INCREMENT,
    nome VARCHAR(100),
    curso VARCHAR(50),
    nota DECIMAL(5, 2),
    idade INT
);

INSERT INTO alunos (nome,curso,nota,idade) VALUES
('João', 'Java', 8.5, 20),
('Maria', 'Java', 7.0, 21),
('Pedro', 'Python', 9.5, 19),
('Ana', 'Python', 6.5, 22),
('Carlos', 'Java', 10.0, 20),
('Lucas', 'Python', 8.0, 21);


--SELECIONA TUDO DA TABELA ALUNOS
SELECT * FROM alunos;



--MOSTA SO NOTA E NOME DO ALUNO
SELECT alunos.nome as 'nome',
       alunos.nota as 'nota'
FROM alunos;


--ALUNOS APENAS COM NOTAS MAIORES QUE 8
SELECT alunos.nome as 'nome',
       alunos.nota as 'nota'
FROM alunos
WHERE alunos.nota >= 8;


--SELECT NO ALUNO COM MAIOR NOTA
SELECT max(nota)
FROM alunos;

--PEGA A MEDIA DAS NOTAS DOS ALUNOS
SELECT avg(nota)
from alunos;

--PEGA O NOME E A MEDIA DE CADA UM
SELECT alunos.nome as 'nome',
        avg(nota)
FROM alunos
GROUP BY nome
HAVING avg(nota);

--PEGA O CURSO O TANTO DE ALUNOS E A MEDIA DAS NOTAS DAS TURMAS
SELECT alunos.curso as 'curso',
       count(alunos.nome),
       avg(nota)  
from alunos
GROUP BY curso
HAVING avg(nota) >= 8;


--FUNCTONS

DELIMITER $$

CREATE FUNCTION pegar_media_turma (curso VARCHAR(100))
RETURNS FLOAT(10)
DETERMINISTIC
BEGIN
    DECLARE media_turma FLOAT;

    SELECT avg(nota)
    INTO media_turma
    FROM alunos
    WHERE curso = curso;

    RETURN media_turma;
END;


DELIMITER ;



SELECT pegar_media_turma('a');


DELIMITER $$

CREATE FUNCTION quantidade_filmes(Rparam ENUM('G','PG','PG-13','R'))
RETURNS int(10)
DETERMINISTIC
BEGIN
    DECLARE quant_f INT;

    SELECT COUNT(film.rating)
    INTO quant_f
    from film
    where Rparam = rating;

    RETURN quant_f;
END $$

DELIMITER ;

SELECT quantidade_filmes('PG');


CREATE VIEW vw_action_film
AS
SELECT film.film_id as 'ID filme',
       category_name as 'Tituo',
       film.description as 'Descricao',
       film.release_year as 'Ano de Lancamento',
       film.rating as 'Classificacao Indicativa'
FROM film

INNER JOIN film_category ON
film.film_id = film_category.film_id

INNER JOIN category
ON film_category.category_id = category.category_id


WHERE category_name = 'Action';

CREATE TABLE historico_filmes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    film_id INT,
    titulo_antigo VARCHAR(255),
    data_alteracao DATETIME
);

DELIMITER $$
CREATE Trigger trg_historico_filme
BEFORE UPDATE
ON historico_filmes
FOR EACH ROW
BEGIN
    SELECT OLD.titulo_antigo
