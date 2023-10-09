package Menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Creatures.*;
import ElementsASCII.*;// Importa todas as classes da pasta ElemensASCII.

public class CreatureSelection extends Menu {
    private int optionCreature;
    private int selectedCreatureCode;
    private boolean exit;


    Scanner scanner = new Scanner(System.in);


    public Creatures getPlayerSelectedCreature() {
        return playerSelectedCreature;
    }

    public int selectCreature() {
        do {
            System.out.print(
                "\nCriaturas disponíveis: \n" +
                "\nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n" +
                ANSI_BLUE + "\nSair do programa - [2]\n" + ANSI_RESET + ">> " 
            );
            optionCreature = scanner.nextInt();

            switch (optionCreature) {
                case 14:
                    playerSelectedCreature = new StoneDev();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 14;

                     // Criando uma instância do elemento Terra e chamando elementMethod
                    Element earthElement = new Earth();
                    earthElement.elementMethod();
                    exit = false;
                    break;

                case 87:
                    playerSelectedCreature = new WaveNerd();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 87;

                      // Criando uma instância do elemento Água e chamando elementMethod
                    Element waterElement = new Water();
                    waterElement.elementMethod();
                    exit = false;
                    break;

                case 65:
                    playerSelectedCreature = new BurnCoder();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 65;

                    // Criando uma instância do elemento Fogo e chamando elementMethod
                    Element fireElement = new Fire();
                    fireElement.elementMethod();
                    exit = false;
                    break;

                case 19:
                    playerSelectedCreature = new BreezeHacker();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 19;
                    // Criando uma instância do elemento Ar e chamando elementMethod
                    Element airElement = new Air();
                    airElement.elementMethod();
                    exit = false;
                    break;

                case 2:
                    exit = confirmExit();
                    break;

                default:
                    System.out.println("\nCódigo inválido. Tente novamente.");
                    break;

            }
        } while (exit);

        return selectedCreatureCode;
    }


    private List<Creatures> availableCreatures;
    private Creatures playerSelectedCreature;
    private List<Creatures> computerAvailableCreatures;

    public CreatureSelection() {
        availableCreatures = new ArrayList<>();
        availableCreatures.add(new StoneDev());
        availableCreatures.add(new WaveNerd());
        availableCreatures.add(new BurnCoder());
        availableCreatures.add(new BreezeHacker());

        computerAvailableCreatures = new ArrayList<>(availableCreatures);
    }

    public Creatures selectRandomComputerCreature(int playerSelectedCreatureCode) {
        Random random = new Random();
        Creatures computerSelectedCreature;

        do {
            int randomIndex = random.nextInt(computerAvailableCreatures.size());
            computerSelectedCreature = computerAvailableCreatures.get(randomIndex);
        } while (computerSelectedCreature.getCode() == playerSelectedCreatureCode);

        computerAvailableCreatures.remove(computerSelectedCreature);

        return computerSelectedCreature;
    }

    public void removeComputerSelectedCreature(Creatures computerSelectedCreature) {
        computerAvailableCreatures.remove(computerSelectedCreature);
    }

    public void resetComputerAvailableCreatures() {
        computerAvailableCreatures = new ArrayList<>(availableCreatures);
    }

}
