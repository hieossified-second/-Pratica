import java.util.Scanner;

public class pratica1 {
    public static void calculadora(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        double soma = num + num2;

        double sub = num - num2;

        double mult = num * num2;

        double div = num / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + mult);
        System.out.println("Divisao: " + div);
        
    }

    public static void espaco(){
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculador de Media");
        espaco();

        System.out.println("Media minima para passar: 7");
        System.out.println("Recuperacao: 5 - 6.9");
        System.out.println("Menos de 5 = reprovado");
        espaco();

        System.out.println("Digite a nota dos alunos: ");

        //  nota dos alunos
        System.out.println("Nota 1:");
        double n1 = sc.nextDouble();
        espaco();
            
        System.out.println("Nota 2:");
        espaco();
        double n2 = sc.nextDouble();

        System.out.println("Nota 3:");
        double n3 = sc.nextDouble();
        espaco();

        double resultado = (n1 + n2 + n3) / 3;
        
        while(resultado < 10){
            if (resultado >= 7){
                System.out.println("Estado: Aprovado - " + resultado);
                break;
            }
            else if (resultado <= 6.9 & resultado <= 5){
                System.out.println("Estado: Recuperacao - "+ resultado);
                break;
            }
            else if (resultado < 5){
                System.out.println("Estado: Reprovado - " + resultado);
                break;
            }

            if (resultado > 10){
                System.out.println("Numero invalido - " + resultado);
                return;
            }
        }
    }
}


