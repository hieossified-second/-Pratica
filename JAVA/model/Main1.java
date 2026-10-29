import java.util.Scanner;
import java.util.Random;
public class Main1 {

    // Digitar Lento

    public static void digitar(String texto) throws InterruptedException {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Thread.sleep(20);
        }
        System.out.println();
    }


    public static void Titulo_BlooDivine() {

        String[] titulo_BlooDivine = {

                "██████╗ ██╗      ██████╗  ██████╗ ██████╗ ██╗██╗   ██╗██╗███╗   ██╗███████╗",
                "██╔══██╗██║     ██╔═══██╗██╔═══██╗██╔══██╗██║██║   ██║██║████╗  ██║██╔════╝",
                "██████╔╝██║     ██║   ██║██║   ██║██║  ██║██║██║   ██║██║██╔██╗ ██║█████╗  ",
                "██╔══██╗██║     ██║   ██║██║   ██║██║  ██║██║╚██╗ ██╔╝██║██║╚██╗██║██╔══╝  ",
                "██████╔╝███████╗╚██████╔╝╚██████╔╝██████╔╝██║ ╚████╔╝ ██║██║ ╚████║███████╗",
                "╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝  ╚═╝╚═╝  ╚═══╝╚══════╝"

        };

        int[][] cores = {

                {255, 0, 0},
                {220, 0, 20},
                {190, 0, 40},
                {160, 0, 60},
                {130, 0, 80},
                {100, 0, 100}

        };

        for (int i = 0; i < titulo_BlooDivine.length; i++) {

            int r = cores[i][0];
            int g = cores[i][1];
            int b = cores[i][2];

            System.out.println(
                    "\u001B[38;2;" + r + ";" + g + ";" + b + "m"
                            + titulo_BlooDivine[i]
            );
        }

        System.out.println("\u001B[0m");
    }





    //Escolha de Classes
    public static Player escolhaClasse() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Player player = Player.criarPlayer(rpgClasses.GUERREIRO);

        digitar("Bem - Vindo a história de   " );
        System.out.println();
        Thread.sleep(1000);
        Titulo_BlooDivine();

        Thread.sleep(1500);
        limparTela();

        while (true) {

            digitar("Digite 1, 2 ou 3 para escolher sua classe no RPG de " + cores.vermelhoForte + "BLOODVINE" + cores.reset);
            System.out.println("1) ⚔️" + rpgClasses.GUERREIRO);
            System.out.println("2) 🗡️" + rpgClasses.ASSASSINO);
            System.out.println("3) 🛡️" + rpgClasses.TANK);

            if (!sc.hasNextInt()) {
                limparTela();
                digitar("❌Escolha Inválida. Digite um número de 1 a 3.");
                sc.next();
                Thread.sleep(1000);
                limparTela();
                continue;
            }

            int numClasse = sc.nextInt();

            if (numClasse == 1) {
                player = Player.criarPlayer(rpgClasses.GUERREIRO);
                digitar("Sua escolha foi a classe " + rpgClasses.GUERREIRO);
                Thread.sleep(2000);
                limparTela();
                return player;

            } else if (numClasse == 2) {
                player = Player.criarPlayer(rpgClasses.ASSASSINO);
                digitar("Sua escolha foi a classe " + rpgClasses.ASSASSINO);
                Thread.sleep(2000);
                limparTela();
                return player;

            } else if (numClasse == 3) {
                player = Player.criarPlayer(rpgClasses.TANK);
                digitar("Sua escolha foi a classe " + rpgClasses.TANK);
                Thread.sleep(2000);
                limparTela();
                return player;
            }


            if (numClasse > 3 || numClasse < 1) {
                limparTela();
                digitar("❌Escolha Inválida. Digite um número de 1 a 3.");
                Thread.sleep(1000);
                limparTela();
            }
        }
    }

    public static void mostrarMenu(Inimigo inimigo, Player player, int quantidadeCura, int round) {
        System.out.println("Round: " + round);
        System.out.println("========================");
        System.out.println(cores.verde + "❤️ Sua Vida: " + player.vida + "/" + player.vidaMax + cores.reset);
        System.out.println(cores.vermelho + "👾 Vida " + inimigo.nome + ": " + inimigo.vida + cores.reset);
        System.out.println(cores.azul + "📦 Curas disponiveis: " + quantidadeCura + "\033[0m" + cores.reset);
        System.out.println("========================");
        System.out.println("Escolha sua ação:");
        System.out.println("1) ⚔️ Atacar");
        System.out.println("2) 🧪 Curar");
        System.out.println("3) 📊 Status");
        System.out.print("Opção:");
    }

    public static void mostrarMenu2(Inimigo inimigo, int quantidadeCura, int round, Player player) {
        System.out.println("Round: " + round);
        System.out.println("========================");
        System.out.println(cores.verde + "❤️ Sua Vida: " + player.vida + "/" + player.vidaMax + cores.vermelho + " -" + inimigo.dano + cores.reset);
        System.out.println(cores.vermelho + "👾 Vida " + inimigo.nome + ": " + inimigo.vida + cores.reset);
        System.out.println(cores.azul + "📦 Curas disponiveis: " + quantidadeCura + "\033[0m" + cores.reset);
        System.out.println("========================");
        System.out.println("Escolha sua ação:");
        System.out.println("1) ⚔️ Atacar");
        System.out.println("2) 🧪 Curar");
        System.out.println("3) 📊 Status");
        System.out.print("Opção:");
    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static class cores {
        static final String verde = "\033[32m";
        static final String verdeBrilhante = "\033[1;32m";
        static final String vermelho = "\033[31m";
        static final String azul = "\033[34m";
        static final String azulBrilhante = "\033[1;34m";
        static final String roxo = "\033[35m";
        static final String amareloForte = "\033[1;33m";
        static final String cianoForte = "\033[1;36m";
        static final String vermelhoForte = "\033[1;31m";
        static final String negrito = "\033[1m";
        static final String reset = "\033[0m";
    }

    public static class Player {
        int vida;
        int vidaMax;
        int dano;
        int cura;
        int quantidadeCura;
        String classe;

        //FUNÇÃO RESET DE VIDA
        public void ResetVida (){
            vida = vidaMax;
        }

        // BUFFERS
        public void aplicarBuff(int tipoBuff, int nivel) {
            Random rd = new Random();
            int vidaBonus = rd.nextInt();
            int danoBonus = rd.nextInt();
            int curaBonus = rd.nextInt();

            switch (nivel) {
                case 1:
                    vidaBonus = rd.nextInt(10) + 15;
                    danoBonus = rd.nextInt(4) + 4;
                    curaBonus = rd.nextInt(1) + 1;
                    break;
                case 2:
                    vidaBonus = rd.nextInt(11) + 25;
                    danoBonus = rd.nextInt(6) + 7;
                    curaBonus = rd.nextInt(1) + 1;
                    break;
                case 3:
                    vidaBonus = rd.nextInt(6) + 35;
                    danoBonus = rd.nextInt(5) + 10;;
                    curaBonus = rd.nextInt(1) + 1;
                    break;
                case 4:
                    vidaBonus = rd.nextInt(16) + 30;
                    danoBonus = rd.nextInt(5) + 13;
                    curaBonus = rd.nextInt(1) + 1;
                    break;
                case 5:
                    vidaBonus = rd.nextInt(8) + 43;
                    danoBonus = rd.nextInt(5) + 16;;
                    curaBonus = rd.nextInt(1) + 2;;
                    break;
            }

            switch (tipoBuff) {
                case 1: // Buff de Vida
                    vidaMax += vidaBonus;
                    vida = vidaMax; // Cura o jogador completamente ao receber buff de vida
                    System.out.printf(cores.vermelho + "❤️ Vida máxima aumentada em %d! " + cores.reset + " Vida atual: %d/%d\n", vidaBonus, vida, vidaMax );
                    break;
                case 2: // Buff de Dano
                    dano += danoBonus;
                    System.out.printf(cores.amareloForte + "⚔️ Dano aumentado em %d! " + cores.reset + " Dano atual: %d\n",  danoBonus,  dano  );
                    break;
                case 3: // Buff de Cura
                    quantidadeCura += curaBonus;
                    System.out.printf( cores.verde + "🧪 Quantidade de curas aumentada em %d!" + cores.reset + " Curas disponíveis: %d\n",  curaBonus, quantidadeCura);
                    break;
            }
        }


        public void atacar(Inimigo inimigo) {
            inimigo.vida -= dano;
        }

        public void curar() {
            if (quantidadeCura > 0) {
                vida += cura;

                if (vida > vidaMax)
                    vida = vidaMax;

                quantidadeCura--;

                System.out.println("✨ Você se curou! Vida atual: " + cores.verde + vida + "/" + vidaMax + cores.reset);
            } else {
                System.out.println(cores.amareloForte + "❌Você não tem mais curas disponíveis!" + cores.reset);
            }
        }

        public void receberDano(int dano) {
            vida -= dano;
        }


        public static Player criarPlayer(String classeEscolhida) {

            if (classeEscolhida.equals(rpgClasses.GUERREIRO)) {
                Player p = new Player();
                p.vida = 100;
                p.vidaMax = 100;
                p.dano = 20;
                p.cura = 30;
                p.quantidadeCura = 4;
                p.classe = rpgClasses.GUERREIRO;
                return p;

            } else if (classeEscolhida.equals(rpgClasses.ASSASSINO)) {
                Player p = new Player();
                p.vida = 90;
                p.vidaMax = 90;
                p.dano = 15;
                p.cura = 30;
                p.quantidadeCura = 3;
                p.classe = rpgClasses.ASSASSINO;
                return p;

            } else if (classeEscolhida.equals(rpgClasses.TANK)) {
                Player p = new Player();
                p.vida = 150;
                p.vidaMax = 150;
                p.dano = 15;
                p.cura = 40;
                p.quantidadeCura = 5;
                p.classe = rpgClasses.TANK;
                return p;
            }

            return null;
        }
    }

    public static void inimigoErrou(){
        System.out.println("Inimigo Errou o Ataque ❌");
    }
    public static void playerErrou(){
        System.out.println("Voce errou o Ataque ❌");
    }

    public static class rpgClasses {
        public static final String GUERREIRO = cores.negrito + cores.vermelhoForte + "GUERREIRO" + cores.reset;
        public static final String ASSASSINO = cores.negrito + cores.roxo + "ASSASSINO" + cores.reset;
        public static final String TANK = cores.negrito + cores.azul + "TANK" + cores.reset;
    }

    public static class Inimigos {
        public static final String ESQUELETO = "ESQUELETO";
        public static final String GOBLIN = "GOBLIN";
        public static final String DEMONIO = "DEMONIO";
        public static final String CAVALEIRONEGRO = "CAVALEIRO-NEGRO";
        public static final String REIDemonio = "REI-DEMONIO";
    }

    public static class Inimigo {
        int vida;
        int dano;
        String nome;

        public void atacar(Player player) {
            player.vida -= dano;
        }

        public static Inimigo gerarInimigo(String nomeInimigo) {
            Random rd = new Random();

            if (nomeInimigo.equals(Inimigos.ESQUELETO)) {
                Inimigo i = new Inimigo();
                i.vida = 50;
                i.dano = rd.nextInt(10);
                i.nome = Inimigos.ESQUELETO;

                if (i.dano < 5){
                    i.dano = 0;
                }
                return i;

            } else if (nomeInimigo.equals(Inimigos.GOBLIN)) {
                Inimigo i = new Inimigo();
                i.vida = 50;
                i.dano = rd.nextInt(15);
                i.nome = Inimigos.GOBLIN;

                return i;

            } else if (nomeInimigo.equals(Inimigos.DEMONIO)){
                Inimigo i = new Inimigo();
                i.vida = 90;
                i.dano = 22;
                i.nome = Inimigos.DEMONIO;
                return i;

            } else if (nomeInimigo.equals(Inimigos.CAVALEIRONEGRO)){

                Inimigo i = new Inimigo();
                i.vida = 130;
                i.dano = 30;
                i.nome = Inimigos.CAVALEIRONEGRO;
                return i;

            } else if (nomeInimigo.equals(Inimigos.REIDemonio)){
                Inimigo i = new Inimigo();
                i.vida = 220;
                i.dano = 45;
                i.nome = Inimigos.REIDemonio;
                return i;
            }

            return null;
        }
    }

    public static boolean combate(Player player, Inimigo enemy, Scanner sc) throws InterruptedException {

        Random rd = new Random();

        int round = 1;
        boolean tomouDano = false;
        int danoAcumulado = 0;
        int chanceAtaque = rd.nextInt(100);

        digitar("\nApareceu um " + cores.vermelho + enemy.nome + cores.reset + "!!");

        while (player.vida > 0 && enemy.vida > 0) {

            if (tomouDano) {
                mostrarMenu2(enemy, player.quantidadeCura, round, player);
            } else {
                mostrarMenu(enemy, player, player.quantidadeCura, round);
            }

            if (!sc.hasNextInt()) {
                limparTela();
                digitar("❌Escolha Inválida. Digite um número de 1 a 3.");
                sc.next();
                Thread.sleep(1000);
                limparTela();
                continue;
            }

            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                     chanceAtaque = rd.nextInt(100);

                    if (chanceAtaque > 30) {

                        player.atacar(enemy);
                        digitar("⚔️ Você atacou o " + cores.vermelho + enemy.nome + cores.reset + "!");

                        if (enemy.vida > 0) {
                            enemy.atacar(player);
                            danoAcumulado += enemy.dano;
                            tomouDano = true;

                            digitar("💥 O " + enemy.nome + " contra-atacou!");
                            digitar("🩸Dano recebido: " + cores.vermelho + " -" + enemy.dano + cores.reset);
                        }

                    } else {
                        playerErrou();
                    }

                    Thread.sleep(2500);
                    round++;
                    limparTela();
                    break;

                case 2:
                    player.curar();
                    enemy.atacar(player);
                    danoAcumulado += enemy.dano;
                    tomouDano = true;

                    digitar("💥O " + enemy.nome + " te atacou!");
                    digitar("🩸Dano recebido: " + cores.vermelho + " -" + enemy.dano + cores.reset);

                    Thread.sleep(2500);
                    round++;
                    limparTela();
                    break;

                case 3:
                    if (tomouDano) {
                        limparTela();
                        System.out.println("======Status======");
                        System.out.println("Dano básico: " + cores.vermelhoForte + player.dano + cores.reset);
                        System.out.println("Vida: " + cores.verde + player.vida + "/" + player.vidaMax + cores.reset);
                        System.out.println("Total dano recebido: " + cores.vermelho + "-" + danoAcumulado + cores.reset);
                        Thread.sleep(3000);

                    } else {
                        limparTela();
                        System.out.println("======Status======");
                        System.out.println("Dano básico: " + cores.vermelhoForte + player.dano + cores.reset);
                        System.out.println("Vida: " + cores.verde + player.vida + "/" + player.vidaMax + cores.reset);
                        Thread.sleep(3000);
                        limparTela();
                    }
                    break;
            }

            limparTela();
        }

        if (player.vida <= 0) {
            digitar("☠️Você morreu");
            return false;
        } else {
            System.out.println("==========================");
            digitar("=======🎖️Você venceu ======" + enemy.nome);
            return true;
        }
    }

    public static void escolherEAplicarBuff(Player player, Scanner sc, int nivelBuff) throws InterruptedException {

        limparTela();
        digitar("Parabéns! Você derrotou o inimigo e ganhou um buff de Nível " + nivelBuff + "!");
        Thread.sleep(1500);

        while (true) {
            limparTela();
            digitar("Escolha o tipo de buff que você deseja aplicar (Nível " + nivelBuff + "):");
            System.out.println("1) ❤️ Aumentar Vida: " + cores.vermelho + "Ganha mais vida máxima." + cores.reset);
            System.out.println("2) ⚔️ Aumentar Dano: " +  cores.azulBrilhante + "Causa mais dano nos ataques." + cores.reset);
            System.out.println("3) 🧪 Aumentar Curas: " + cores.verdeBrilhante+ "Recebe mais poções de cura." + cores.reset);
            System.out.print("Opção: ");

            if (!sc.hasNextInt()) {
                limparTela();
                digitar("❌ Escolha Inválida. Digite um número de 1 a 3.");
                sc.next();
                Thread.sleep(1000);
                continue;
            }

            int escolhaBuff = sc.nextInt();

            if (escolhaBuff >= 1 && escolhaBuff <= 3) {
                player.aplicarBuff(escolhaBuff, nivelBuff);
                Thread.sleep(2000);
                break;
            } else {
                limparTela();
                digitar("❌ Escolha Inválida. Digite um número de 1 a 3.");
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        Player player = escolhaClasse();
        Inimigo inimigo_Esqueleto = Inimigo.gerarInimigo(Inimigos.ESQUELETO);
        Inimigo inimigo_Goblin = Inimigo.gerarInimigo(Inimigos.GOBLIN);
        Inimigo inimigo_Demonio = Inimigo.gerarInimigo(Inimigos.DEMONIO);
        Inimigo inimigo_CavaleiroNegro = Inimigo.gerarInimigo(Inimigos.CAVALEIRONEGRO);
        Inimigo inimigo_ReiDemonio = Inimigo.gerarInimigo(Inimigos.REIDemonio);


        digitar("🎮⚔️ " + cores.negrito + cores.vermelhoForte + "BLOODIVINE " + cores.amareloForte + "INICIANDO... " + cores.cianoForte + "Prepare-se para a batalha! 🎮⚔️" + cores.reset);

        Thread.sleep(3000);




        combate(player, inimigo_Esqueleto, sc);
        player.ResetVida();
        escolherEAplicarBuff(player, sc, 1);

        if (combate(player , inimigo_Goblin, sc)) {
            player.ResetVida();
            escolherEAplicarBuff(player, sc, 2);
        } else {
            return;
        }
        if (combate(player , inimigo_Demonio, sc)) {
            player.ResetVida();
            escolherEAplicarBuff(player, sc, 3);
        } else {
            return;
        }

        if (combate(player , inimigo_CavaleiroNegro, sc)) {
            player.ResetVida();
            escolherEAplicarBuff(player, sc, 4);
        } else {
            return;
        }
        if (combate(player , inimigo_ReiDemonio, sc)) {
            player.ResetVida();
            escolherEAplicarBuff(player, sc, 5);
        } else {
            return;
        }

        sc.close();
    }
}