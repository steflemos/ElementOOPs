package Menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Creatures.*;

public class CreatureSelection extends Menu {
    private int optionCreature;
    private boolean exit;
    private Creatures playerSelectedCreature;
    private List<Creatures> availableCreatures;
    private List<Creatures> computerAvailableCreatures;

    Scanner scanner = new Scanner(System.in);

    // Metodo usado para criar a lista de criaturas que estarao disponiveis para o
    // computador e para armazenar na variavel playerSelectedCreature a criatura
    // escolhida pela usuario
    public int selectCreature() {
        availableCreatures = new ArrayList<>();
        availableCreatures.add(new StoneDev());
        availableCreatures.add(new WaveNerd());
        availableCreatures.add(new BurnCoder());
        availableCreatures.add(new BreezeHacker());

        computerAvailableCreatures = new ArrayList<>(availableCreatures);
        do {
            System.out.print(
                    "\nCriaturas disponíveis: \n" +
                            "\nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n"
                            +
                            ANSI_BLUE + "\nSair do programa - [2]\n" + ANSI_RESET + ">> ");
            optionCreature = scanner.nextInt();

            switch (optionCreature) {
                case 14:
                    playerSelectedCreature = new StoneDev();
                    playerSelectedCreature.elementMethod();
                    System.out.print("\nCriatura selecionada:\n" + playerSelectedCreature);
                    exit = false;
                    break;

                case 87:
                    playerSelectedCreature = new WaveNerd();
                    playerSelectedCreature.elementMethod();
                    System.out.print("\nCriatura selecionada:\n" + playerSelectedCreature);
                    exit = false;
                    break;

                case 65:
                    playerSelectedCreature = new BurnCoder();
                    playerSelectedCreature.elementMethod();
                    System.out.print("\nCriatura selecionada:\n" + playerSelectedCreature);
                    exit = false;
                    break;

                case 19:
                    playerSelectedCreature = new BreezeHacker();
                    playerSelectedCreature.elementMethod();
                    System.out.print("\nCriatura selecionada:\n" + playerSelectedCreature);
                    exit = false;
                    break;

                case 2:
                    exit = confirmExit();
                    break;

                default:
                    System.out.println("\nCódigo inválido! Tente novamente.");
                    break;

            }
        } while (exit);

        return playerSelectedCreature.getCode();
    }

    // Metodo usado para selecionar uma criatura para o computador garantindo nao
    // ser a mesma ja escolhida pelo usuario
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

    // Metodo usado para remover a criatura ja selecionada para ser a criatura do
    // computador em uma rodada, garantindo o rodizio de criaturas por batalha
    public void removeComputerSelectedCreature(Creatures computerSelectedCreature) {
        computerAvailableCreatures.remove(computerSelectedCreature);
    }

    // Metodo usado para reiniciar a lista possibilitando reiniciar o jogo
    public void resetComputerAvailableCreatures() {
        computerAvailableCreatures = new ArrayList<>(availableCreatures);
    }

    // Metodo usado para passar o codigo da criatura selecionada para a variavel que
    // comecara a batalha.
    public Creatures getPlayerSelectedCreature() {
        return playerSelectedCreature;
    }

}
