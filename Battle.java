

import java.util.Scanner;

public class Battle extends Menu {
    private Scanner scanner;
    private int dano;
    private int escolha;
    private Creatures computerSelectedCreature;
    private boolean playerFirstAttack;
    private boolean exit;

    public Battle() {
        scanner = new Scanner(System.in);
        exit = true;
    }

    //metodo usado para o computador atacar aleatoriamente entre ataque elemental ou ataque fisico
    private void computerAttack(Creatures playerSelectedCreature, Creatures computerSelectedCreature) {
        int escolhaComputador = (int) (Math.random() * 2) + 1;
        if (escolhaComputador == 1) {
            int dano = (int) (computerSelectedCreature.getPower() * computerSelectedCreature.getAttack()
                    / playerSelectedCreature.getDefense());
            System.out.println(computerSelectedCreature.getName() + " lança um ataque físico e diminui " + dano
                    + " pontos de vida de " + playerSelectedCreature.getName() + "\n");
            playerSelectedCreature.setLifePoints(playerSelectedCreature.getLifePoints() - dano);
        } else {
            int dano = (int) (computerSelectedCreature.getPower() * computerSelectedCreature.getAttack()
                    / playerSelectedCreature.getDefense()
                    * getFactor(computerSelectedCreature, playerSelectedCreature));
            System.out.println("\n" + computerSelectedCreature.elementAttackPhrase() + "\n"
                    + computerSelectedCreature.getName() + " ataca elementalmente e causa " + dano
                    + " de dano em " + playerSelectedCreature.getName() + "\n");
            playerSelectedCreature.setLifePoints(playerSelectedCreature.getLifePoints() - dano);
        }
    }

    public boolean startBattle(Creatures playerSelectedCreature, CreatureSelection creatureSelection) {
        System.out.println("\n--------------------------------------");
        System.out.println("|  A batalha está prestes a começar! |");
        System.out.println("--------------------------------------\n");

        // Loop para as três batalhas
        for (int batalha = 1; batalha <= 3; batalha++) {
            System.out.println(" ===== Batalha " + batalha + " =====\n");

            //escolhe uma criatura para ser jogada pelo computador
            computerSelectedCreature = creatureSelection
                    .selectRandomComputerCreature(playerSelectedCreature.getCode());

            //printa o nome da creatura do player e do computador
            System.out.println(playerSelectedCreature.getName() + " VS " + computerSelectedCreature.getName());

            //a criatura com maior velocidade começa. se o player for maior retorna true
            playerFirstAttack = (playerSelectedCreature.getVelocity() > computerSelectedCreature
                    .getVelocity());

            System.out.println("\nA criatura com a maior valocidade ataca primeiro!\n");
            System.out.println(
                playerSelectedCreature.getName() + " velocidade: " + playerSelectedCreature.getVelocity());
            System.out.println(
                    computerSelectedCreature.getName() + " velocidade: " + computerSelectedCreature.getVelocity());

            System.out.println(playerFirstAttack ? playerSelectedCreature.getName() + " ataca primeiro!" : computerSelectedCreature.getName() + " ataca primeiro!");

            System.out.println("\n== Placar inicial ==\n" + "\n" +
                    playerSelectedCreature.getName() + " \nPontos de vida: "
                    + playerSelectedCreature.getLifePoints() + "\n" +
                    computerSelectedCreature.getName() + " \nPontos de vida: "
                    + computerSelectedCreature.getLifePoints() + "\n");

                    // Menu de opções
                System.out.println("--------------------------------------");
                System.out.println("|          Escolha uma ação          |");
                System.out.println("--------------------------------------");
                System.out.println("|        1. Ataque Físico            |");
                System.out.println("|        2. Ataque Elemental         |");
                System.out.println("|        3. Sair do programa         |");
                System.out.print("--------------------------------------\n >>");

            while (exit) {
                //computador ataca
                if (!playerFirstAttack) {
                    System.out.println(computerSelectedCreature.getName() + " ataca!\n");
                    computerAttack(playerSelectedCreature, computerSelectedCreature);
                    System.out.println("\n == Placar == \n" +
                            playerSelectedCreature.getName() + " \nPontos de vida: "
                            + playerSelectedCreature.getLifePoints() + "\n" +
                            computerSelectedCreature.getName() + " \nPontos de vida: "
                            + computerSelectedCreature.getLifePoints() + "\n" +
                            "------------------------------------------------------------");
                }
                
                if (playerSelectedCreature.getLifePoints() <= 1) {
                    System.out.println("GAME OVER! Você foi derrotado!");
                    break;
                }
                
                //usuario ataca
                if (playerFirstAttack){
                    System.out.println(playerSelectedCreature.getName() + " ataca!\n >>");
                    escolha = scanner.nextInt();
                    if (escolha == 1) {
                        dano = (int) (playerSelectedCreature.getPower() * playerSelectedCreature.getAttack()
                                / computerSelectedCreature.getDefense());
                        System.out.println(
                                playerSelectedCreature.getName() + " lança um ataque físico e diminui "
                                        + dano + " pontos de vida de " + computerSelectedCreature.getName() + "\n");
    
                        computerSelectedCreature.setLifePoints(computerSelectedCreature.getLifePoints() - dano);
    
                        System.out.println("\n == Placar == \n" +
                                playerSelectedCreature.getName() + " \nPontos de vida: "
                                + playerSelectedCreature.getLifePoints() + "\n" +
                                computerSelectedCreature.getName() + " \nPontos de vida: "
                                + computerSelectedCreature.getLifePoints() + "\n" + 
                                "------------------------------------------------------------");
    
                        if (computerSelectedCreature.getLifePoints() <= 1) {
                            System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n" +
                                    "\nParabés! Voce foi o vencedor da batalha " + batalha + "\n Vencedor: "
                                    + playerSelectedCreature.getName());
                            break;
                        }
    
                    } else if (escolha == 2) {
                        dano = (int) (playerSelectedCreature.getPower() * playerSelectedCreature.getAttack()
                                / computerSelectedCreature.getDefense()
                                * getFactor(playerSelectedCreature, computerSelectedCreature));
                        System.out.println("\n" + playerSelectedCreature.elementAttackPhrase() + "\n"
                                + playerSelectedCreature.getName() + " ataca elementalmente com fogo e causa "
                                + dano + " de dano em " + computerSelectedCreature.getName() + "\n");
    
                        computerSelectedCreature.setLifePoints(computerSelectedCreature.getLifePoints() - dano);
    
                        System.out.println("\n == Placar == \n" +
                                playerSelectedCreature.getName() + " \nPontos de vida: "
                                + playerSelectedCreature.getLifePoints() + "\n" +
                                computerSelectedCreature.getName() + " \nPontos de vida: "
                                + computerSelectedCreature.getLifePoints() + "\n" + 
                                "------------------------------------------------------------");
    
                        if (computerSelectedCreature.getLifePoints() <= 1) {
                            System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n" +
                                    "\nParabéns! Você foi o vencedor da batalha " + batalha + "\n Vencedor: "
                                    + playerSelectedCreature.getName());
                            break;
                        }
    
                    } else if (escolha == 3) {
                        System.out.println("Batalha encerrada.");
                        System.out.println("\n == Placar final == \n" +
                                playerSelectedCreature.getName() + " \nPontos de vida: "
                                + playerSelectedCreature.getLifePoints() + "\n" +
                                computerSelectedCreature.getName() + " \nPontos de vida: "
                                + computerSelectedCreature.getLifePoints() + "\n");
                        System.exit(0);
                    } else {
                        System.out.println("Opção inválida. Escolha novamente.");
                    }
                }
                playerFirstAttack = !playerFirstAttack;
            }

            if (batalha == 3 && computerSelectedCreature.getLifePoints() <= 1) {
                System.out.println("Parabéns! Você ganhou as três batalhas e é campeão do torneio ElementOOPs.");
                break;
            } else if (playerSelectedCreature.getLifePoints() <= 1) {
                System.out.println("Usuário derrotado! Batalha encerrada!");
                break;
            } else {
                System.out.println(
                    "Batalha " + batalha
                            + " Encerrada! Deseja continuar para a proxima batalha? Digite 1 para continuar ou 2 para encerrar.");
            }

            escolha = scanner.nextInt();

            if (escolha == 2) {
                System.out.println("...Encerrando a batalha!");
                System.out.println("Fim da batalha! Até a próxima ;) ");
                break;
            }
              
        }

        return exit;                
    }

    private float getFactor(Creatures player, Creatures eneemy) {

        // se o jogador escolher terra
        if (player.getCode() == 14 && eneemy.getCode() == 87) {
            return 2.0F;

        } else if (player.getCode() == 14 && eneemy.getCode() == 65) {
            return 1.0F;

        } else if (player.getCode() == 14 && eneemy.getCode() == 19) {
            return 1.0F;

        }

        // se o jogador escolher agua
        if (player.getCode() == 87 && eneemy.getCode() == 14) {
            return 1.0F;

        } else if (player.getCode() == 87 && eneemy.getCode() == 65) {
            return 2.0F;

        } else if (player.getCode() == 87 && eneemy.getCode() == 19) {
            return 1.0F;

        }

        // se o jogador escolher fogo
        if (player.getCode() == 65 && eneemy.getCode() == 14) {
            return 1.0F;

        } else if (player.getCode() == 65 && eneemy.getCode() == 87) {
            return 1.0F;

        } else if (player.getCode() == 65 && eneemy.getCode() == 19) {
            return 2.0F;
        }

        // se o jogador escolher ar
        if (player.getCode() == 19 && eneemy.getCode() == 14) {
            return 2.0F;

        } else if (player.getCode() == 19 && eneemy.getCode() == 87) {
            return 1.0F;

        } else if (player.getCode() == 19 && eneemy.getCode() == 65) {
            return 1.0F;

        } else {
            return 0.0F;
        }
    }
}
