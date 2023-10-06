package Menus;

import java.util.Scanner;

import Creatures.Creatures;
import Tournament.Battle;

public class Program extends Menu {
    int optionMenuInicial;
    int optionExit;
    boolean exit;

    Scanner scanner = new Scanner(System.in);
    CreatureSelection creatureSelection = new CreatureSelection();

    public void startProgram() {
        do {
            exit = true;

            System.out.print("Iniciar um novo jogo [1] ou sair do programa [2]\n>> ");
            optionMenuInicial = scanner.nextInt();

            if (optionMenuInicial == 2) {
                exit = confirmExit();

            } else if (optionMenuInicial == 1) {
                int playerSelectedCreatureCode = creatureSelection.selectCreature();

                if (playerSelectedCreatureCode != 1) {
                    Creatures playerSelectedCreature = creatureSelection.getPlayerSelectedCreature();

                    Battle battle = new Battle();
                    battle.startBattle(playerSelectedCreature, creatureSelection);
                } else {
                    System.out.println("Opção inválida. Escolha novamente.");
                }

            } else {
                System.out.println("Opção inválida");
            }

        } while (exit);
    }
}