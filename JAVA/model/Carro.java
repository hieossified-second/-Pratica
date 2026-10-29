

public class Carro {
    String modelo;
    String marca;
    int velocidade;

    public Carro(String modelo, String marca, int velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public static void main(String[] args){
        Carro carro1 = new Carro("Ford K","Ford", 200);
        Carro carro2 = new Carro("Sybau", "solo", 6767);
    }


}
