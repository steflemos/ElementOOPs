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
            System.out.println(" == Batalha " + batalha + " ==\n");

            // Escolher aleatoriamente uma criatura disponível para o computador, garantindo
            // que seja diferente da escolhida pelo jogador
            Creatures computerSelectedCreature = creatureSelection
                    .selectRandomComputerCreature(playerSelectedCreature.getCode());

            System.out.println(playerSelectedCreature.getName() + " VS " + computerSelectedCreature.getName());

            boolean playerFirstAttack = (playerSelectedCreature.getVelocity() > computerSelectedCreature
                    .getVelocity());

            System.out.println("\nA criatura com a maior valocidade ataca primeiro!\n");
            System.out
                    .println(playerSelectedCreature.getName() + " Velocidade: " + playerSelectedCreature.getVelocity());
            System.out.println(
                    computerSelectedCreature.getName() + " Velocidade: " + computerSelectedCreature.getVelocity());

            System.out.println("\n█░░░░░░░░░░░░░░░░░░░░░░░░\n");
            System.out.println("████████░░░░░░░░░░░░░░░░░\n");
            System.out.println("█████████████░░░░░░░░░░░░\n");
            System.out.println("████████████████████░░░░░\n");
            System.out.println("█████████████████████████\n");

            System.out.println("\nImprimir quem ataca primeiro\n");

            System.out.println("\n== Placar inicial ==\n" + "\n" +
                    playerSelectedCreature.getName() + " \nPontos de vida: "
                    + playerSelectedCreature.getLifePoints() +
                    computerSelectedCreature.getName() + " \nPontos de vida: "
                    + computerSelectedCreature.getLifePoints() + "\n");

            while (true) {
                // Menu de opções
                System.out.println("--------------------------------------");
                System.out.println("|          Escolha uma ação          |");
                System.out.println("--------------------------------------");
                System.out.println("|        1. Ataque Físico            |");
                System.out.println("|        2. Ataque Elemental         |");
                System.out.println("|        3. Sair do programa         |");
                System.out.println("--------------------------------------");

                int escolha = scanner.nextInt();

                if (escolha == 1) {
                    int dano = playerSelectedCreature.getPower() * playerSelectedCreature.getAttack()
                            / playerSelectedCreature.getDefense();
                    int prejuizo = computerSelectedCreature.getLifePoints() - dano;
                    System.out.println(
                            playerSelectedCreature.getName() + " lança um ataque físico e diminui "
                                    + prejuizo + " pontos de vida de " + computerSelectedCreature.getName() + "\n");
                    System.out.println("\n == Placar == \n" +
                            playerSelectedCreature.getName() + " \nPontos de vida: "
                            + playerSelectedCreature.getLifePoints() + "\n" +
                            computerSelectedCreature.getName() + " \nPontos de vida: "
                            + computerSelectedCreature.getLifePoints() + "\n");

                    if (computerSelectedCreature.getLifePoints() > playerSelectedCreature.getLifePoints()) {
                        System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n");
                        break;
                    }
                } else if (escolha == 2) {
                    int dano = (int) (playerSelectedCreature.getPower() * playerSelectedCreature.getAttack() / computerSelectedCreature.getDefense() * getFactor(playerSelectedCreature, computerSelectedCreature));
                    //int dano = random.nextInt(15) + 1;
                    System.out.println(playerSelectedCreature.getName() + " ataca elementalmente com fogo e causa "
                            + dano + " de dano em " + computerSelectedCreature.getName() + "\n");

                    computerSelectedCreature.setLifePoints(computerSelectedCreature.getLifePoints() - dano);

                    System.out.println("\n == Placar == \n" +
                            playerSelectedCreature.getName() + " \nPontos de vida: "
                            + playerSelectedCreature.getLifePoints() + "\n" +
                            computerSelectedCreature.getName() + " \nPontos de vida: "
                            + computerSelectedCreature.getLifePoints() + "\n");

                    if (playerSelectedCreature.getLifePoints() <= 0 ) {
                        System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n");
                        break;
                    }
                } else if (escolha == 3) {
                    System.out.println("Batalha encerrada.");
                    System.exit(0);
                } else {
                    System.out.println("Opção inválida. Escolha novamente.");
                }

                playerFirstAttack = !playerFirstAttack;

                // logica de saida
                // System.out.println("Você ganhou a batalha! Digite 1 para continuar a batalha
                // ou digite 2 para Sair do programa.");
            }

            // //logica de saida
            System.out.println(
                    "Você ganhou a batalha! Digite 1 para continuar a batalha ou digite 2 para Sair do programa.");

        }

        scanner.close();
    }

    private float getFactor(Creatures player, Creatures eneemy) {
        if (player.getCode() == 14 && eneemy.getCode() == 87) {
            return 2.0F;

        } else if (player.getCode() == 14 && eneemy.getCode() == 65) {
            return 1.0F;

        } else if (player.getCode() == 14 && eneemy.getCode() == 19) {
            return 1.0F;

        }
        if (player.getCode() == 87 && eneemy.getCode() == 14) {
            return 1.0F;

        } else if (player.getCode() == 87 && eneemy.getCode() == 65) {
            return 2.0F;

        } else if (player.getCode() == 87 && eneemy.getCode() == 19) {
            return 1.0F;

        }
        if (player.getCode() == 65 && eneemy.getCode() == 14) {
            return 1.0F;

        } else if (player.getCode() == 65 && eneemy.getCode() == 87) {
            return 1.0F;

        } else if (player.getCode() == 65 && eneemy.getCode() == 19) {
            return 2.0F;
        }

        if (player.getCode() == 19 && eneemy.getCode() == 14) {
            return 2.0F;

        } else if (player.getCode() == 19 && eneemy.getCode() == 87) {
            return 1.0F;

        } else if (player.getCode() == 19 && eneemy.getCode() == 65) {
            return 1.0F;

        }else{
            return 0.0F;
        }
    }
}
