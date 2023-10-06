package Menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Creatures.BreezeHacker;
import Creatures.BurnCoder;
import Creatures.Creatures;
import Creatures.StoneDev;
import Creatures.WaveNerd;

public class CreatureSelection extends Menu {
    int optionCreature;
    boolean exit;
    int selectedCreatureCode;
    int computerCreature;

    public Creatures getPlayerSelectedCreature() {
        return playerSelectedCreature;
    }

    public int selectCreature() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "\nCriaturas disponíveis: \n\nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n\n[999] Sair do programa \n");

        optionCreature = scanner.nextInt();

        do {
            switch (optionCreature) {
                case 14:
                    playerSelectedCreature = new StoneDev();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 14;
                    System.out.println("Aqui começa a batalha");
                    exit = false;
                    break;

                case 87:
                    playerSelectedCreature = new WaveNerd();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 87;
                    System.out.println("Aqui começa a batalha");
                    exit = false;
                    break;

                case 65:
                    playerSelectedCreature = new BurnCoder();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 65;
                    System.out.println("Aqui começa a batalha");
                    exit = false;
                    break;
                case 19:
                    playerSelectedCreature = new BreezeHacker();
                    System.out.print("Criatura selecionada:\n" + playerSelectedCreature);
                    selectedCreatureCode = 19;
                    System.out.println("Aqui começa a batalha");
                    exit = false;
                    break;

                case 999:
                    exit = confirmExit();
                    break;

                default:
                    System.out.println("Código inválido. Tente novamente.");
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
