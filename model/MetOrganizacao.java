package model;
import java.util.Random;
import java.util.Scanner;

public class MetOrganizacao {
    static Scanner sc = new Scanner(System.in);
   
    
    public static class OrganizandoBolha {
        int [] v;

        public void organizar(int [] v){
            int aux = 0;
            this.v = v;

            for (int i = 0; i < v.length - 1; i++) {
                for (int j = 0; j < v.length - 1 - i; j++) {
                    if(v[j] > v[j + 1]){
                        aux = v[j + 1];
                        v[j] = v[j + 1];
                        v[j + 1] = aux;
                    }
                }
            }
        }

        public void preencher(int [] v){
            Random rd = new Random();

            for (int i = 0; i < v.length; i++){
            v[i] = rd.nextInt(0, 10000);
            }
        }

        public void exibir(int [] v){
            for (int i = 0; i < v.length; i++) {
                System.out.println("Valor no vetor " + i + ": " + v[i]);
            }
        }

        public int busca(int [] v, int valor){
            for (int i = 0; i < v.length; i++) {
                if(v[i] == valor){
                    return i;
                }
            }
            return -1;
        }

        public int buscaBinaria(int [] v, int valor){
            int esq = 0;
            int dir = v.length - 1;

            while (esq <= dir) {
               int meio = esq + (dir - esq) / 2;
               
               if (v[meio] == valor){
                return meio; //Retorna quando o valor e encontrado
               }else if(v[meio] < valor){
                esq = meio + 1; //buscando na metade direita
               }
               else{
                esq = meio - 1; //buscando na metade esquerada
               }
            }
            return - 1;
        }
    }
}
