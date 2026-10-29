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

        print("Aluno salvo no banco!")


alunos = []

while True:

    print("Mim de 3 numbers que vou calcular pra tu que burro e nao sabe dividi")

    nome = input("Digite o nome do Aluno: ")

    idade = int(input("Digite a idade do mesmo: "))

    ope = int(input("Se deseja sair do programa digite 1, se nao 0: "))

    print("----------------------------------------------------------------------")

    if ope == 0:
        print("--------------------------------------")
        n1 = float(input("Digite a primeira nota: "))
        n2 = float(input("Digite a segunda nota: "))
        n3 = float(input("Digite a terceira nota: "))
        print("----------------------------------------")

        mediaA = CalcMedia(n1, n2, n3)

        nAluno = Aluno(nome, idade, mediaA)

        print(
            "---------------------------------------"
            f"A Média final do aluno {nAluno.nome} é: "
            f"{nAluno.nota:.2f}"
            "-----------------------------------------"
        )

        nAluno.salvar_no_banco()

        alunos.append(nAluno)

        for aluno in alunos:

            print(f"Nome: {aluno.nome}")
            print(f"Idade: {aluno.idade}")
            print(f"Nota: {aluno.nota:.2f}")
            print("--------------------------")

    else:
        break