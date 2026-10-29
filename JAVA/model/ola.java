import java.util.Scanner;
import java.util.Random;

public class ola {
     public static int[] player(){
        Random rd = new Random();
        
        int player_vida = 100;
        int player_ataque = rd.nextInt(20);

        return new int[]{player_vida, player_ataque};
    }

    public static int[] inimigo(){
        Random rd = new Random();
        
        int inimigo_vida = 50;
        int inimigo_ataque = rd.nextInt(10);

        return new int[]{inimigo_vida, inimigo_ataque};
    }

    public static void espaco(){
        System.out.println("  ");
    }

    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[] valores_player = player();
        int[] valores_inimigo = inimigo();

        int player_vida = valores_player[0];
        int player_ataque = valores_player[1];

        int inimigo_vida = valores_inimigo[0];
        int inimigo_ataque = valores_inimigo[1];
        

        System.out.println("A batalha comecou");
        Thread.sleep(1000);

       
        while(player_vida > 0 &&  inimigo_vida > 0){
            System.out.println("O que voce faz?");
            espaco();

            System.out.println("1 - ataca");
            System.out.println("2 - se cura");
            System.out.println("3 - defende");
            Thread.sleep(1000);

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Voce resolve atacar");
                    espaco();
                    Thread.sleep(1500);
                    ////////////////////////////////////////////////////////////
                    // player

                    if(inimigo_vida > 0){
                        int novo_ataque = rd.nextInt(20);
                        player_ataque = novo_ataque;

                      
                    }    
                    else {
                        break;
                    }

                    ///////////////////////////////////////////////////////////
                    // Batalha

                    if (player_ataque >= 15){
                        System.out.println("Dano critico");
                    }

                    System.out.println("Voce deu: " + player_ataque + " de DMG");
                    espaco();
                    Thread.sleep(1500);

                    if (inimigo_vida > 0){
                        System.out.println("Agora e a vez do inimigo");
                        espaco();
                        Thread.sleep(500);

                        ////////////////////////////////////////////////////////////
                        // inimigo
                        
                        int vida_nova_i = inimigo_vida - player_ataque;
                        inimigo_vida = vida_nova_i;

                        int novo_ataque_i = rd.nextInt(20);
                        inimigo_ataque = novo_ataque_i;

                        if (inimigo_vida < 0){
                            inimigo_vida = 0;
                        } 

                        if (inimigo_vida > 0) {
                            int vida_nova_p = player_vida - inimigo_ataque;
                            player_vida = vida_nova_p;}
                        ///////////////////////////////////////////////////////////

                        System.out.println("Inimigo usa seu ataque basico");
                        espaco();
                        Thread.sleep(1500);

                        if (inimigo_ataque > 15){
                            System.out.println("Voce levou dano critico");
                            System.out.println("Voce perdeu: " + inimigo_ataque + " de Vida");
                            espaco();
                            Thread.sleep(1500);
                        }
                        else {
                            System.out.println("Voce perdeu: " + inimigo_ataque + " de Vida");
                            Thread.sleep(1500);
                        }
                    }
                    espaco();
                    System.out.println("Sua vida atual: " + player_vida);
                    System.out.println("Vida do inimigo: " + inimigo_vida);
                    espaco();
                    Thread.sleep(1500);
                    
                    if (player_vida < 0) {
                        player_vida = 0;
                    }
                
                    break;
            
                default:
                    break;
            }
            
        }
        if(player_vida <= 0){
            System.out.println("Voce perdeu");
            System.out.println("Nao desista, tente denovo");
        }
        if(inimigo_vida <= 0){
            System.out.println("Voce venceu, parabens nobre guerreiro");
     
        }

        
        sc.close();
    }
   
} 