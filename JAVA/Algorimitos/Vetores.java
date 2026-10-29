import java.util.Random;
public class Vetores {

    public static class Pratica{
        //int [] i = new int[10]; //Vetor unidimensional: e como uma linha reta.
        //int [][] m = new int[2][3]; //Possui linhas e colunas.

        void montar_array(int [] vetor ){
            Random rd = new Random();
            for(int valor = 0; valor < vetor.length; valor++){
                vetor[valor] = rd.nextInt(10);
            }
        }
        
        void mostrar_array(int [] vetor){
            for(int i= 0; i < vetor.length; i++){
                System.out.println("Valor do Indice " + i + ": " + vetor[i]);
            }
        }

        void montar_matriz(int [][] matriz){
            Random rd = new Random();
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = rd.nextInt(101);
                }
            }
        }

        void mostrar_matriz(int [][] matriz){
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.println("Linha: " + i + "| coluna: " + j );
                }
            }
        }
    } 

    public static void main(String[] args) {
            Pratica P = new Pratica();

            int [] vetor = new int [21];

            int [][] matriz = new int [2][3];

            P.montar_matriz(matriz);
            P.mostrar_matriz(matriz);

            P.montar_array(vetor);
            P.mostrar_array(vetor);
    }
}
