
import java.util.Scanner;

public class Battle extends ConfirmExit {
    private Scanner scanner;
    private int userAction;
    private int userActionExit;
    private Creature computerSelectedCreature;
    private boolean playerFirstAttack;
    private boolean exit;
    private BattleAttacks attacks;
    private ConfirmExit exitConfirm;

    public Battle() {
        exitConfirm = new ConfirmExit();
        exit = true;
        attacks = new BattleAttacks();
        scanner = new Scanner(System.in);
    }

    public boolean startBattle(Creature playerSelectedCreature, CreatureSelection creatureSelection) {

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
                    + "\n----------------------------------------------------------"
                    : "\n" + computerSelectedCreature.getName() + " ataca primeiro!" +
                            "\n----------------------------------------------------------");

            // MOSTRA O PLACAR INICIAL - METODO displayInitialScore É CHAMADO
            System.out.println("\n== Placar inicial ==\n");
            BattleMenu.displayScore(playerSelectedCreature, computerSelectedCreature);

            // Menu de opções
            BattleMenu.displayMenuOptions();

            // instanciando um objeto da classe Battle Attacks para comecar a batalha:

            while (exit) {
                // computador ataca
                if (!playerFirstAttack) {
                    System.out.println(computerSelectedCreature.getName() + " ataca!\n");
                    attacks.computerAttack(playerSelectedCreature, computerSelectedCreature);

                    // MOSTRA O PLACAR - METODO displayInitialScore É CHAMADO
                    System.out.println("====== Placar ======\n");
                    BattleMenu.displayScore(playerSelectedCreature, computerSelectedCreature);
                    System.out.println("----------------------------------------------------------------------\n");

                }

                // condicional para verificar os pontos de vida do usuario apos o ataque do
                // computador:
                if (playerSelectedCreature.getLifePoints() < 1) {
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
                        // MOSTRA O PLACAR - METODO displayInitialScore É CHAMADO
                        System.out.println("====== Placar ======\n");
                        BattleMenu.displayScore(playerSelectedCreature, computerSelectedCreature);
                        System.out.println("----------------------------------------------------------------------\n");

                        // condicional para verificar os pontos de vida do computador apos o ataque do
                        // usuario:
                        if (computerSelectedCreature.getLifePoints() < 1) {
                            System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n" +
                                    "\nParabéns! Você foi o vencedor da batalha " + batalha + "\n Vencedor: "
                                    + playerSelectedCreature.getName());
                            break;
                        }

                    } else if (userAction == 2) {
                        // metodo de ataque elemental:
                        attacks.playerAttackElemental(playerSelectedCreature, computerSelectedCreature);
                        // MOSTRA O PLACAR - METODO displayInitialScore É CHAMADO
                        System.out.println("====== Placar ======\n");
                        BattleMenu.displayScore(playerSelectedCreature, computerSelectedCreature);
                        System.out.println("----------------------------------------------------------------------\n");

                        // condicional para verificar os pontos de vida do computador apos o ataque do
                        // usuario:
                        if (computerSelectedCreature.getLifePoints() < 1) {
                            System.out.println(computerSelectedCreature.getName() + " foi derrotada!\n" +
                                    "\nParabéns! Você foi o vencedor da batalha " + batalha + "\n Vencedor: "
                                    + playerSelectedCreature.getName());
                            break;
                        }

                    } else if (userAction == 3) {
                        System.out.println("\nBatalha encerrada.");
                        // MOSTRA O PLACAR FINAL - METODO displayInitialScore É CHAMADO
                        System.out.println("\n====== Placar final ======\n");
                        BattleMenu.displayScore(playerSelectedCreature, computerSelectedCreature);
                        System.out.println("----------------------------------------------------------------------\n");
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
            if (batalha == 3 && computerSelectedCreature.getLifePoints() < 1) {
                System.out.println("PARABÉNS! VOCÊ GANHOU AS TRÊS BATALHAS E É CAMPEÃO DO TORNEIO ELEMENTOOPS");
                break;
                // elif usado para exibir uma mensagem caso o usuario seja derrotado:
            } else if (playerSelectedCreature.getLifePoints() < 1) {
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
                exitConfirm.confirmExit();
                System.out.println("...Encerrando a batalha!");
                System.out.println("Fim da batalha! Até a próxima ;) ");
                break;
            }
        } // fim do laco das tres batalhas

        return exit; // retorno boleano do metodo startBattle usado para encerrar o metodo

    } // fim do metodo startBattle
} // fim da classe batalha
