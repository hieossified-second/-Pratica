
import java.util.Random;

public class Ordenacoes {
    public static class Ordenar{
        //1- ESTE METODO empurra o numero maior a para o final
        //trocando os vizinhos de lugar toda a hora

        void bubblesort(int [] vetor){
            int temp;

            //for de fora que controla as passagens (varredura)
            for(int i = 0; i < vetor.length - 1; i++){
                
                //For de dentro que compara os vizinhos
                for(int j = 0; j < vetor.length - 1 - i; j++){

                    // Se o cara da ESQUERDA for maior que o da DIREITA
                    if(vetor[j] > vetor[j + 1]){ // i+1: e o vizinho

                        //TROCA ELES DE LUGAR!
                        temp = vetor[j]; //Guarda o valor da Esquerda
                        vetor[j] = vetor[j + 1]; //poe o da direita na esquerda
                        vetor[j + 1] = temp; // poe temp na direita
                    }
                }
            }
        }

        void selectionSort(int[] v){
            int temp;

            for (int j = 0; j < v.length - 1; j++) {
                int menor = j;

                for (int i = j + 1; i < v.length; i++) {
                    if(v[menor] > v[i]){
                        menor = i;
                    }
                }

                temp = v[menor];
                v[menor] = v[j];
                v[j] = temp;

            }
        }

        void insertionSort(int[] v){
            // comeca do indice 1, porque imaginamos que o indice 0
            //ja esta "na mao"

            for (int i = 0; i < v.length; i++) {
                int temp = v[i];
                int j = i;

                //enquanto estivermos olhando para a esquerda e a carta
                //da esquerda foi MAIOR que a nossa
                
                while(j > 0 && v[j - 1] > temp){
                    v[j] = v[j - 1]; // Empurra a carta maior para direita
                    j--;// da um passo para esquerda
                }

                v[j] = temp; //Encaixa a nossa carta no buraco que sobrou
            }

           
        } 

        void preencher(int[]v){
            Random rd = new Random();
            for (int i = 0; i < v.length; i++) {
                v[i] = rd.nextInt(10); 
            }
        }
        
        void mostrar_vetor(int[] v){
            for (int i = 0; i < v.length; i++) {
                System.out.println("Valor ordenado: " + v[i]);
            }
        }
    }

    public static void main(String[] args) {
        
        Ordenar od = new Ordenar();

        int v[] = new int[5];

        od.preencher(v);

        System.out.println("Nao ordenado");
        od.mostrar_vetor(v);

        System.out.println("Bubble");
        od.bubblesort(v);
        od.mostrar_vetor(v);

        System.out.println("Selection");
        od.selectionSort(v);
        od.mostrar_vetor(v);

        System.out.println("Insertion");
        od.insertionSort(v);
        od.mostrar_vetor(v);



    }   
}
