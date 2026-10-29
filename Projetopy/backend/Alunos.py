import mysql.connector


def CalcMedia(x, y, z):

    resultado = (x + y + z) / 3

    return resultado


class Aluno:

    def __init__(self, nome, idade, nota):
        self.nome = nome
        self.idade = idade
        self.nota = nota

    def salvar_no_banco(self):

        conexao = mysql.connector.connect(
            host="localhost",
            user="root",
            password="soloemuitotuffo123@",
            database="alunos"
        )

        cursor = conexao.cursor()

        sql = """
        INSERT INTO Alunos (nome, idade, nota)
        VALUES (%s, %s, %s)
        """

        valores = (self.nome, self.idade, self.nota)

        cursor.execute(sql, valores)

        conexao.commit()

        cursor.close()
        conexao.close()

