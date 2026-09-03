CREATE VIEW vw_UsuarioEmp AS
SELECT
    user_sb.id_u as 'Conta', --Chama id do usuario/id conta
    user_sb.nome as  'Nome', -- Nome do usuario
    user_sb.cpf as 'CPF', --CPF do usuario
    emprestimo.emp as 'Emprestimos' --Chama a tabela de emprestimos
FROM user_sb -- chama a tabela user
INNER JOIN emprestimo -- Agruopa a tablea emprestimo com a tabela user
ON id_e = id_u; -- chama a tabela agrupando as duas pelo id de cada uma

SELECT * FROM vw_usuarioemp;