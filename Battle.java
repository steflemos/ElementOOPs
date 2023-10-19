
import java.util.Scanner;

public class Battle extends Menu {
    private Scanner scanner;
    private int userAction;
    private int userActionExit;
    private Creatures computerSelectedCreature;
    private boolean playerFirstAttack;
    private boolean exit = true;
    private BattleAttacks attacks;

    public Battle() {
    }

    public boolean startBattle(Creatures playerSelectedCreature, CreatureSelection creatureSelection) {
        scanner = new Scanner(System.in);

        System.out.println("\n--------------------------------------");
        System.out.println("|  A batalha está prestes a começar! |");
        System.out.println("--------------------------------------\n");

        // Loop para as três batalhas
        for (int batalha = 1; batalha <= 3; batalha++) {
            System.out.println(" ====== Batalha " + batalha + " ======\n");

            // escolhe uma criatura para ser jogada pelo computador
            computerSelectedCreature = creatureSelection
                    .selectRandomCreature(playerSelectedCreature.getCode());

            // printa o nome da creatura do player e do computador
            System.out.println(playerSelectedCreature.getName() + " VS " + computerSelectedCreature.getName());

            // a criatura com maior velocidade começa. se o player for maior retorna true
            playerFirstAttack = (playerSelectedCreature.getVelocity() > computerSelectedCreature
                    .getVelocity());

            System.out.println("\nA criatura com a maior valocidade ataca primeiro!\n");
            System.out.println(
                    playerSelectedCreature.getName() + " velocidade: " + playerSelectedCreature.getVelocity());
            System.out.println(
                    computerSelectedCreature.getName() + " velocidade: " + computerSelectedCreature.getVelocity());

            System.out.println(playerFirstAttack ? "\n" + playerSelectedCreature.getName() + " ataca primeiro!"
                    : "\n" + computerSelectedCreature.getName() + " ataca primeiro!");

            System.out.println("\n== Placar inicial ==\n" + "\n" +
                    playerSelectedCreature.getName() + " \nPontos de vida: "
                    + playerSelectedCreature.getLifePoints() + "\n" +
                    computerSelectedCreature.getName() + " \nPontos de vida: "
                    + computerSelectedCreature.getLifePoints() + "\n");

            // Menu de opções
            System.out.println("--------------------------------------");
            System.out.println("|          Escolha uma ação:         |");
            System.out.println("--------------------------------------");
            System.out.println("|        1. Ataque Físico            |");
            System.out.println("|        2. Ataque Elemental         |");
            System.out.println("|        3. Sair do programa         |");
            System.out.print("--------------------------------------\n");

            // instanciando um objeto da classe Battle Attacks para comecar a batalha:
            attacks = new BattleAttacks();

            while (exit) {
                // computador ataca
                if (!playerFirstAttack) {
                    System.out.println(computerSelectedCreature.getName() + " ataca!\n");
                    attacks.computerAttack(playerSelectedCreature, computerSelectedCreature);
                    System.out.println("====== Placar ====== \n" +
                            "\n" + playerSelectedCreature.getName() + " - Pontos de vida: "
                            + playerSelectedCreature.getLifePoints() +
                            "\n" + computerSelectedCreature.getName() + " - Pontos de vida: "
                            + computerSelectedCreature.getLifePoints() + "\n" +
                            "----------------------------------------------------------------------\n");
                }

                // condicional para verificar os pontos de vida do usuario apos o ataque do
                // computador:
                if (playerSelectedCreature.getLifePoints() <= 1) {
                    System.out.println("GAME OVER! Você foi derrotado!");
                    break;
                }

                // usuario ataca
                if (playerFirstAttack) {
                    System.out.print(playerSelectedCreature.getName() + " ataca!\n >>");
                    userAction = scanner.nextInt();
                    if (userAction == 1) {
                        // metodo de ataque fisico:
                        attacks.playerAttackFisical(playerSelectedCreature, computerSelectedCreature);
                        System.out.println("====== Placar ====== \n" +
                                "\n" + playerSelectedCreature.getName() + " - Pontos de vida: "
                                + playerSelectedCreature.getLifePoints() +
                                "\n" + computerSelectedCreature.getName() + " - Pontos de vida: "
                                + computerSelectedCreature.getLifePoints() + "\n" +
                                "----------------------------------------------------------------------\n");

                        // condicional para verificar os pontos de vida do computador apos o ataque do
                        // usuario:
                        if (computerSelectedCreature.getLifePoints() <= 1) {
                            System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n" +
                                    "\nParabés! Voce foi o vencedor da batalha " + batalha + "\n Vencedor: "
                                    + playerSelectedCreature.getName());
                            break;
                        }

                    } else if (userAction == 2) {
                        // metodo de ataque elemental:
                        attacks.playerAttackElemental(playerSelectedCreature, computerSelectedCreature);
                        System.out.println("====== Placar ====== \n" +
                                "\n" + playerSelectedCreature.getName() + " - Pontos de vida: "
                                + playerSelectedCreature.getLifePoints() +
                                "\n" + computerSelectedCreature.getName() + " - Pontos de vida: "
                                + computerSelectedCreature.getLifePoints() + "\n" +
                                "----------------------------------------------------------------------\n");

                        // condicional para verificar os pontos de vida do computador apos o ataque do
                        // usuario:
                        if (computerSelectedCreature.getLifePoints() <= 1) {
                            System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n" +
                                    "\nParabéns! Você foi o vencedor da batalha " + batalha + "\n Vencedor: "
                                    + playerSelectedCreature.getName());
                            break;
                        }

                    } else if (userAction == 3) {
                        System.out.println("Batalha encerrada.");
                        System.out.println("\n ====== Placar final ====== \n" +
                                playerSelectedCreature.getName() + " \nPontos de vida: "
                                + playerSelectedCreature.getLifePoints() + "\n" +
                                computerSelectedCreature.getName() + " \nPontos de vida: "
                                + computerSelectedCreature.getLifePoints() + "\n");
                        System.exit(0);
                    } else {
                        System.out.println("Opção inválida. Escolha novamente.");
                    }
                }
                // boleano usado para alternar a vez de atacar entre o computador e o usuario:
                playerFirstAttack = !playerFirstAttack;
            }

            // condicional para exibir uma mensagem especial caso o usuario venca as tres
            // batalhas:
            if (batalha == 3 && computerSelectedCreature.getLifePoints() <= 1) {
                System.out.println("Parabéns! Você ganhou as três batalhas e é campeão do torneio ElementOOPs.");
                break;
                // elif usado para exibir uma mensagem caso o usuario seja derrotado:
            } else if (playerSelectedCreature.getLifePoints() <= 1) {
                System.out.println("Usuário derrotado! Batalha encerrada!");
                break;
            } else {
                // condicional usado para exibir uma mensagem entre uma batalha e outra e
                // perguntar se o usuario deseja continuar a batalha:
                System.out.println(
                        "Batalha " + batalha
                                + " encerrada! Deseja continuar para a proxima batalha? Digite 1 para continuar ou 2 para encerrar.");
            }

            userActionExit = scanner.nextInt();

            if (userActionExit == 2) {
                System.out.println("...Encerrando a batalha!");
                System.out.println("Fim da batalha! Até a próxima ;) ");
                break;
            } 
        } // fim do laco das tres batalhas

        return exit; // retorno boleano do metodo startBattle usado para encerrar o metodo

    } // fim do metodo startBattle
} // fim da classe batalha
