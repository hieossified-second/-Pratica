package service;
import java.util.Scanner;

import model.MetOrganizacao;
import model.MetOrganizacao.OrganizandoBolha;


public class chamandoOrg {
    public static void main(String[] args) {
        OrganizandoBolha org = new OrganizandoBolha();
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[100];

        org.preencher(vetor);
        org.organizar(vetor);
        org.exibir(vetor);

        System.out.println("Digite o valor desejado");
        int valor = sc.nextInt();

        int resultado = org.busca(vetor, valor);

        if (resultado != -1){
            System.out.println("Valor encontrado no indice: " + resultado);
        }
        else{
            System.out.println("Valor nao encontrado");
        }

    }
}

