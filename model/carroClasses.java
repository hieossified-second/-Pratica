package model;
import java.util.Scanner;

public class carroClasses {
    static Scanner sc = new Scanner(System.in);

    static class Carro{//Sem construtor
        String marca;
        String modelo;
        int velocidade;

        void acelerar(){
            velocidade += 10;
        }
    }

    public static void exemploUm(){
        Carro carro1 = new Carro();

        String c_marca = carro1.marca;
        String c_modelo = carro1.modelo;
        carro1.acelerar();
        carro1.acelerar();
        
        System.out.println("Digite a marca: ");
        c_marca = sc.nextLine();

        System.out.println("Digite o modelo");
        c_modelo = sc.nextLine();

        System.out.println("---------------------------");

        System.out.println("Marca do carro: " + c_marca);
        System.out.println("Modelo: " + c_modelo);
        System.out.println("Velocidade: " + carro1.velocidade);
        
    }

    static class Carro2 {
        String marca;
        String modelo;
        int velocidade;

        int acelerar(int vel){
            velocidade += vel;
            return velocidade;
        }

    }


    public static void exemploDois(){
        Carro2 carro = new Carro2();

        String marcaCarro = carro.marca;
        String modeloCarro = carro.modelo;
        int velocidadeCarro = carro.velocidade;
        

        System.out.println("Digite a marca do carro");
        marcaCarro = sc.nextLine();

        System.out.println("Digite a modelo do carro");
        modeloCarro = sc.nextLine();

        System.out.println("Digite a velocidade do carro");
        velocidadeCarro = sc.nextInt();


        System.out.println("---------------------------");

        System.out.println("Marca do carro: " + marcaCarro);
        System.out.println("Modelo: " + modeloCarro);
        System.out.println("Velocidade: " + velocidadeCarro);

        System.out.println("----------------------------");

        velocidadeCarro += carro.acelerar(20);
        System.out.println("O carro acelerou 20");
        System.out.println("Velocidade final: " + velocidadeCarro);
        

    }

    static class Carro3 {//Construtor
        String marca;
        String modelo;
        int velocidade;

        public Carro3(String mar, String mod, int velo){
            this.marca = mar;
            this.modelo = mod;
            this.velocidade = velo;
        }
    }

    public static void exemploTres(){
        Carro3 carro = new Carro3("Ford", "Ford k", 150);

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidade);
    }



    public static void main(String[] args) {
        exemploUm();

        System.out.println();
        System.out.println("-------------------------------------");
        exemploDois();

        System.out.println();
        System.out.println("-------------------------------------");
        exemploTres();
    }
}