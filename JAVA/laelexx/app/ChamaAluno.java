package app;

import model.Aluno;
import model.VerificaPassou;

public class ChamaAluno {
    static Aluno aluno1 = new Aluno();
    static VerificaPassou passou1 = new VerificaPassou();

    public static void main(String[] args){
        aluno1.nome = "Kevin";
        aluno1.idade = 18;
        aluno1.sexo = 'm';
        aluno1.nota1 = 7;
        aluno1.nota2 = 10;
        aluno1.nota3 = 8;

        String result = passou1.media(aluno1.nota1, aluno1.nota2, aluno1.nota3);

        System.out.println(result);
    }
}
