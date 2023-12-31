
import java.util.Scanner;

public class Program extends ConfirmExit {
    private int optionInitialMenu;
    private int optionInitialMenuB;
    private int continueOption;
    private boolean exit = true;
    private CreatureSelection creatureSelection;
    private Battle battle;
    private Creature playerSelectedCreature;
    private Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
        creatureSelection = new CreatureSelection();
        battle = new Battle();
    }

    public void startProgram() {
        do {
            System.out.print("Iniciar um novo jogo [1] ou sair do programa [2]\n>> ");
            optionInitialMenu = scanner.nextInt();

            if (optionInitialMenu == 2) {
                exit = confirmExit();
            } else if (optionInitialMenu == 1) {
                creatureSelection.selectCreature();

                System.out.print("\nIniciar um novo torneio [1] ou sair do programa [2]\n>> ");
                optionInitialMenuB = scanner.nextInt();

                if (optionInitialMenuB == 2) {
                    exit = confirmExit();
                } else if (optionInitialMenuB == 1) {
                    playerSelectedCreature = creatureSelection.getPlayerSelectedCreature();
                    battle.startBattle(playerSelectedCreature, creatureSelection);

                    // funcao usada para encerrar o programa caso o usuario perca.
                    if (playerSelectedCreature.getLifePoints() < 400) {
                        break;
                    }

                    // verifica se o jogador quer continuar ou sair:
                    System.out.print("Digite 1 para comecar uma nova batalha ou 2 para sair do programa.\n>> ");
                    continueOption = scanner.nextInt();

                    if (continueOption == 2) {
                        exit = confirmExit();
                    }
                } else {
                    System.out.println(ANSI_RED + "\n[ERROR] Opção inválida. Escolha novamente.\n" + ANSI_RESET);
                }
            } else {
                System.out.println(ANSI_RED + "\n[ERROR] Opção inválida. Escolha novamente.\n" + ANSI_RESET);
            }
        } while (exit);
    } // fim do metodo startProgram
} // fim da classe programa
