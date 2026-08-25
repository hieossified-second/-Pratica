import java.util.Scanner;

public class pessoaClasses {
    static class Pessoa{
        String nome; //Atributos da classe
        int idade;
        String cpf;

        void falar(String nome){ // Metodo da classe
            System.out.println("Ola, meu nome é " + nome);
        }
    }


    static Scanner sc = new Scanner(System.in);


    public static void exemploDois() {
        
        Pessoa pessoa1 = new Pessoa();
    
    
        pessoa1.nome = "Kevin";
        pessoa1.idade = 18;
        pessoa1.cpf = "12345678901";
    
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.cpf);
    }
    
    
    public static void exemploUm(){
        Pessoa pessoa = new Pessoa(); // Objeto da Classe

        String p_nome = pessoa.nome;
        int p_idade = pessoa.idade;
        String p_cpf = pessoa.cpf;

        System.out.println("Digite seu Nome: ");
        p_nome = sc.nextLine();
        
        System.out.println("Digite sua Idade: ");
        p_idade = sc.nextInt();

        System.out.println("Digite seu CPF: ");
        p_cpf = sc.next();

        System.out.println("----------------------");
        System.out.println("Seu Nome: " + p_nome + "\nSua idade: " + p_idade + 
            "\nSeu cpf: " + p_cpf);
        pessoa.falar(p_nome);
    }

    public static void main(String[] args) {
        exemploUm();
        System.out.println("-------------------");
        System.out.println("");
        exemploDois();
    }
}
