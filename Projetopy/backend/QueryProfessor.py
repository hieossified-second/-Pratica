import mysql.connector

class QP:
    def __init__(self, profid):
        self.profid = profid

    def procurarProfessor(self):
   
        connect = mysql.connector.connect(
                host="localhost",
                user="root",
                password="soloemuitotuffo123@",
                database="professores"
        )

        cursor = connect.cursor()

        sql = """
            SELECT * from professores
            WHERE id = %s
            """

        valores = (self.profid,)

        cursor.execute(sql, valores)

        prof = cursor.fetchone()

        cursor.close()
        connect.close()

        return prof

# --- BLOCO DE TESTE NO MESMO ARQUIVO ---
if __name__ == "__main__":
    print("------------------------------------------")
    print("TESTANDO A CLASSE QP")
    print("------------------------------------------")
    
    try:
        id_teste = int(input("Digite um ID de professor para testar: "))
        
        # Cria a instância da classe
        busca_teste = QP(id_teste)
        
        # Executa o método
        resultado = busca_teste.procurarProfessor()
        
        print("\n--- RESULTADO ---")
        if resultado:
            print("Professor encontrado com sucesso!")
            print(f"Tupla retornada: {resultado}")
        else:
            print("Nenhum professor encontrado com o ID informado.")
            
    except ValueError:
        print("Erro: Digite apenas números inteiros para o ID.")
    print("------------------------------------------")
    