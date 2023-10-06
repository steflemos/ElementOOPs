package Tournament;

import java.util.Random;
import java.util.Scanner;
import Creatures.Creatures;
import Menus.CreatureSelection;

public class Battle {
    public void startBattle(Creatures playerSelectedCreature, CreatureSelection creatureSelection) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Informar quem começa
        System.out.println("\n--------------------------------------");
        System.out.println("|  A batalha está prestes a começar! |");
        System.out.println("--------------------------------------\n");

        // Loop para as três batalhas
        for (int batalha = 1; batalha <= 3; batalha++) {
            System.out.println("Batalha " + batalha + "\n");

            int velocidadePlayer = random.nextInt(10) + 1;
            int velocidadeComputer = random.nextInt(10) + 1;

            boolean playerAtacaPrimeiro = (velocidadePlayer > velocidadeComputer);

            // Escolher aleatoriamente uma criatura disponível para o computador, garantindo
            // que seja diferente da escolhida pelo jogador
            Creatures computerSelectedCreature = creatureSelection
                    .selectRandomComputerCreature(playerSelectedCreature.getCode());

            System.out.println(playerSelectedCreature.getName() + " começa!");
            System.out.println(computerSelectedCreature.getName() + " responde!\n");

            while (true) {
                // Menu de opções
                System.out.println("Escolha uma ação:");
                System.out.println("1. Ataque Físico");
                System.out.println("2. Ataque Elemental");
                System.out.println("3. Sair do programa");

                int escolha = scanner.nextInt();

                if (escolha == 1) {
                    int dano = random.nextInt(10) + 1;
                    System.out.println(
                            playerSelectedCreature.getName() + " ataca fisicamente e causa " + dano + " de dano.");

                    if (dano >= 10) {
                        System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n");
                        break;
                    }
                } else if (escolha == 2) {
                    int dano = random.nextInt(15) + 1;
                    System.out.println(playerSelectedCreature.getName() + " ataca elementalmente com fogo e causa "
                            + dano + " de dano.");

                    if (dano >= 15) {
                        System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n");
                        break;
                    }
                } else if (escolha == 3) {
                    System.out.println("Batalha encerrada.");
                    System.exit(0);
                } else {
                    System.out.println("Opção inválida. Escolha novamente.");
                }

                playerAtacaPrimeiro = !playerAtacaPrimeiro;
            }
        }

        scanner.close();
    }
}
