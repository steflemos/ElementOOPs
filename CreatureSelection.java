
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CreatureSelection extends ConfirmExit {
    private int optionCreature;
    private boolean exit;
    private Creature playerSelectedCreature;
    private List<Creature> availableCreatures;
    private Creature computerSelectedCreature;
    private int randomIndex;
    private Scanner scanner;
    private Random random;

    // construtor
    public CreatureSelection() {
        scanner = new Scanner(System.in);
    }

    // Metodo usado para criar a lista de criaturas que estarao disponiveis para o
    // computador e para armazenar na variavel playerSelectedCreature a criatura
    // escolhida pela usuario
    public int selectCreature() {

        // Array que armazena as criaturas que serao sorteadas para ser a criatura
        // player do computador:
        availableCreatures = new ArrayList<>();
        availableCreatures.add(new StoneDev());
        availableCreatures.add(new WaveNerd());
        availableCreatures.add(new BurnCoder());
        availableCreatures.add(new BreezeHacker());

        do {
            System.out.print(
                    "\n--------------------------------------" +
                            "\n|       Criaturas disponiveis        |" +
                            "\n--------------------------------------" +
                            "\n|       StoneDev (terra) - [14]      |" +
                            "\n|       WaveNerd (água)  - [87]      |" +
                            "\n|       BurnCoder (fogo) - [65]      |" +
                            "\n|      BreezeHacker (ar) - [19]      |" +
                            "\n--------------------------------------"
                            +
                            ANSI_BLUE +
                            "\n--------------------------------------" +
                            "\n|        Sair do programa - [2]      |" +
                            "\n--------------------------------------"
                            + ANSI_RESET + "\n>> ");

            optionCreature = scanner.nextInt();

            switch (optionCreature) {
                case 14:
                    playerSelectedCreature = new StoneDev();
                    exit = false;
                    break;

                case 87:
                    playerSelectedCreature = new WaveNerd();
                    exit = false;
                    break;

                case 65:
                    playerSelectedCreature = new BurnCoder();
                    exit = false;
                    break;

                case 19:
                    playerSelectedCreature = new BreezeHacker();
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
        playerSelectedCreature.elementArtASCII();
        System.out.print("\nCriatura selecionada:\n" + playerSelectedCreature);
        return playerSelectedCreature.getCode();
    }

    // Metodo usado para selecionar uma criatura para o computador garantindo nao
    // ser a mesma ja escolhida pelo usuario
    public Creature selectRandomCreature(int playerSelectedCreatureCode) {
        random = new Random();
        do {
            randomIndex = random.nextInt(availableCreatures.size());
            computerSelectedCreature = availableCreatures.get(randomIndex);
        } while (computerSelectedCreature.getCode() == playerSelectedCreatureCode);
        availableCreatures.remove(computerSelectedCreature);
        return computerSelectedCreature;
    }

    // Metodo usado para retornar a criatura selecionada pelo usuario:
    public Creature getPlayerSelectedCreature() {
        return playerSelectedCreature;
    }

}
