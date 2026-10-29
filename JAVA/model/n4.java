package model;
import java.util.Scanner;

public class n4{
    public static void L(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
        }
    }
    
    public static class Aluno {
        String nome;
        int idade;
        double media;

        public double calcula_media(double n1, double n2, double n3){
            double resultado = (n1 + n2 + n3) / 3;
            return resultado;
        }

        public void mostrarDados(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.printf("Média: %.2f",this.media);
        }
    }

        public static class Professor {
        String nome;
        int idade;
        String materia;


        public void mostrarDados(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.printf("Materia: " + this.materia);
        }
    }


    public static class Menu extends Aluno{
        Aluno a1 = new Aluno();

        public void mostrarMenu(){
            System.out.println("==== SISTEMA ESCOLAR =====");
            System.out.println("1 -  Cadastar aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Listar Professores");
            System.out.println("5 - Calcular Media");
            System.out.println("6 - Sair");
        }
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Menu menu1 = new Menu();
        Professor p1 = new Professor();

        Scanner sc = new Scanner(System.in);

        boolean continua = true;
        while (continua) {
            menu1.mostrarMenu();
            int entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    System.out.println("==== Digite o nome do aluno ====");
                    a1.nome = sc.next();
                    L();

                    System.out.println("==== Digite a idade do aluno ====");
                    a1.idade = sc.nextInt();
                    L();

                    
                    L();
                    System.out.println("==== Dados ====");
                    a1.mostrarDados();
                    
                    L();
                    break;
                case 2:
                    System.out.println("==== Digite o nome do Professor ====");
                    p1.nome = sc.next();
                    L();

                    System.out.println("==== Digite a Idade do Professor ====");
                    p1.idade = sc.nextInt();
                    L();

                    System.out.println("==== Digite a Materia dele ==== ");
                    p1.materia = sc.next();

                    L();
                    System.out.println("==== Dados ====");
                    p1.mostrarDados();
                    L();

                    break;
                case 3:
                    L();
                    a1.mostrarDados();
                    L();
                    break;
                case 4:
                    L();
                    p1.mostrarDados();
                    L();
                    break;
                case 5:
                    System.out.println("==== Nota 1 ====");
                    double n1 = sc.nextDouble();
                    L();

                    System.out.println("==== Nota 2 ====");
                    double n2 = sc.nextDouble();
                    L();

                    System.out.println("==== Nota 3 ====");
                    double n3 = sc.nextDouble();
                    L();

                    L();
                    
                    double resultado = a1.calcula_media(n1, n2, n3);

                    a1.media = resultado;

                    
                    break;
                case 6:
                    System.out.println("==== SAINDO ====");
                    L();
                    continua = false;
                default:
                    break;
            }
        }
        sc.close();
    }


}