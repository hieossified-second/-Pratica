CREATE TABLE curso(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_aluno VARCHAR(150),
    nome_curso VARCHAR(100),

    FOREIGN KEY (id) REFERENCES alunos(id)
);



INSERT INTO alunos (nome, idade, curso)
VALUES('Kevin', 18, 'ADS');

SELECT * FROM alunos;


CREATE VIEW curso_aluno AS
SELECT alunos.id as 'ID Aluno',
       alunos.nome as 'Nome',
       curso.id as 'ID Curso',
       curso.nome_curso as 'Nome do Curso'
FROM alunos
INNER JOIN curso
ON alunos.id = curso.id;

ALTER TABLE curso
    ADD preco_curso DECIMAL(10,2);

CREATE FUNCTION OBTER_ID_ALUNO(idParam INT)
RETURNS CHAR(1)
DETERMINISTIC

BEGIN

    DECLARE idUsuario CHAR(1);

    SELECT id
    INTO idUsuario
    FROM alunos
    WHERE id = idParam;

    RETURN idUsuario;

END;

CREATE VIEW Alunosplus_precoCurso AS
SELECT curso.id as 'Codigo Curso',
       curso.preco_curso as 'Preco',
       alunos.id as 'Id do Aluno',
       alunos.nome as 'Nome do Aluno'
FROM curso
INNER JOIN alunos 
ON curso.id = alunos.id;

INSERT INTO alunos (nome, idade, curso)
VALUES('Stela', 40, 'Psicologia');

INSERT INTO alunos (nome, idade, curso)
VALUES('Marcos', 30, 'Engenheiro');

INSERT INTO alunos (nome, idade, curso)
VALUES('Enzo', 15, 'Ensino Medio Tecnico');

INSERT INTO alunos (nome, idade, curso)
VALUES('Fabricio', 12, 'Ensino Fundamental Tecnico');

---FUNCTIONS

CREATE FUNCTION PrecoCurso (idParam INT)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN

    DECLARE Preco DECIMAL(10,2);

    SELECT preco_curso
    INTO Preco
    FROM curso
    WHERE id = idParam;

    RETURN Preco;

END;

DROP FUNCTION OBTER_NOME_ALUNOS;

INSERT INTO curso(nome_aluno, nome_curso, preco_curso)
VALUES('Kevin', 'ADS', 400.20);

CREATE FUNCTION OBTER_NOME_ALUNOS()
RETURNS VARCHAR(150)
DETERMINISTIC
BEGIN

    DECLARE NomeAluno VARCHAR(150);

    SELECT alunos.nome
    INTO NomeAluno
    FROM alunos
    WHERE id = idParam;

    RETURN NomeAluno;

END;

------PROCEDURES



CREATE PROCEDURE ListaAlunos(Letra VARCHAR(50))
BEGIN
    SELECT curso, nome
    FROM alunos
    WHERE curso LIKE Letra;

END;

CALL `ListaAlunos`('E%')

DROP PROCEDURE `ListaAlunosComNomes`;

CREATE PROCEDURE ListaAlunosComNomes(Letra VARCHAR(50))
BEGIN
    SELECT curso, nome as 'Nome Aluno'
    FROM alunos
    WHERE curso LIKE Letra;

END;

CALL `ListaAlunosComNomes`('E%')

CREATE PROCEDURE ListaAlunosCursos(Letra VARCHAR(50))
BEGIN
    SELECT nome as 'Nome do Aluno', curso as 'Nome do Curso',
           idade as 'Idade'
    FROM alunos
    WHERE curso LIKE Letra;

END;

CALL `ListaAlunosCursos`('E%')