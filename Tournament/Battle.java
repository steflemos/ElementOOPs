package Tournament;

import java.util.Random;
import java.util.Scanner;

public class Battle {
    public void startBattle(int selectedCreatureCode) { // Adicione um parâmetro
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Informar quem começa
        System.out.println("\n--------------------------------------");
        System.out.println("|  A batalha está prestes a começar! |");
        System.out.println("--------------------------------------\n");

        // // Loop para as três batalhas
        // for (int batalha = 1; batalha <= 3; batalha++) {
        // System.out.println("Batalha " + batalha + "\n");

        // VELOCIDADE aleatória das criaturas
        int velocidadeCriatura1 = random.nextInt(10) + 1;
        int velocidadeCriatura2 = random.nextInt(10) + 1;

        // Determinar a ordem das ações com base na VELOCIDADE
        boolean criatura1AtacaPrimeiro = (selectedCreatureCode == 14 && velocidadeCriatura1 > velocidadeCriatura2) ||
                (selectedCreatureCode != 14 && velocidadeCriatura1 < velocidadeCriatura2);
        // Informar quem começa a batalha
        if (criatura1AtacaPrimeiro) {
            System.out.println(selectedCreatureCode + " 1começa!");
        } else {
            System.out.println(selectedCreatureCode + " 2começa!");
        }

        // Loop para os turnos
        while (true) {
            // Menu de opções
            System.out.println("Escolha uma ação:");
            System.out.println("1. Ataque Físico");
            System.out.println("2. Ataque Elemental");
            System.out.println("3. Sair do programa");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                // Realizar um ataque físico
                int dano = random.nextInt(10) + 1;
                System.out.println(selectedCreatureCode + " ataca fisicamente e causa " + dano + " de dano.");

                // Verificar se a criatura oponente foi derrotada
                // Neste exemplo, consideramos que a criatura 2 é derrotada quando seus pontos
                // de vida chegam a 0
                if (dano >= 10) {
                    System.out.println("Criatura 2 foi derrotada!\n");
                    break;
                }
            } else if (escolha == 2) {
                // Realizar um ataque elemental
                // Suponhamos que a criatura 1 tem um ataque de fogo
                int dano = random.nextInt(15) + 1;
                System.out.println(selectedCreatureCode + " ataca elementalmente com fogo e causa " + dano + " de dano.");

                // Verificar se a criatura oponente foi derrotada
                if (dano >= 15) {
                    System.out.println("Criatura 2 foi derrotada!\n");
                    break;
                }
            } else if (escolha == 3) {
                System.out.println("Batalha encerrada.");
                System.exit(0); // Sai do programa completamente
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }

            // Trocar a vez da criatura
            criatura1AtacaPrimeiro = !criatura1AtacaPrimeiro;
        }

        scanner.close();
    }
}