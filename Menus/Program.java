package Menus;

import java.util.Scanner;

import Creatures.Creatures;
import Tournament.Battle;

public class Program extends Menu {
    private int optionInitialMenu;
    private boolean exit = true;


    Scanner scanner = new Scanner(System.in);

    CreatureSelection creatureSelection = new CreatureSelection();


    public void startProgram() {
        do {
            System.out.print("Iniciar um novo jogo [1] ou sair do programa [2]\n>> ");
            optionInitialMenu = scanner.nextInt();

            if (optionInitialMenu == 2) {
                exit = confirmExit();

            } else if (optionInitialMenu == 1) {
                int playerSelectedCreatureCode = creatureSelection.selectCreature();

                if (playerSelectedCreatureCode != 1) {
                    Creatures playerSelectedCreature = creatureSelection.getPlayerSelectedCreature();

                    Battle battle = new Battle();
                    battle.startBattle(playerSelectedCreature, creatureSelection);
                } else {
                    System.out.println(ANSI_RED + "\n[ERROR] Opção inválida. Escolha novamente.\n" + ANSI_RESET);
                }

            } else {
                System.out.println(ANSI_RED + "\n[ERROR] Opção inválida. Escolha novamente.\n" + ANSI_RESET);
            }

        } while (exit);
    }
}