
import java.util.Scanner;

public class ConfirmExit {
    private int optionExit;
    private boolean exit;
    private Scanner scanner;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public ConfirmExit() {
        scanner = new Scanner(System.in);
    }

    public boolean confirmExit() {
        System.out.print(
                ANSI_RED +
                        "--------------------------------------" +
                        "\n| Você tem certeza que deseja sair?  |" +
                        "\n--------------------------------------"
                        + ANSI_RESET + "\n\nDigite 1 para confirmar \n>> ");
        optionExit = scanner.nextInt();

        // caso a opção for 1 ele encerra o programa
        exit = !(optionExit == 1);

        System.out.println(optionExit == 1 ? "Saindo..." : "[ERROR] Opção inválida. Tente novamente.");

        return exit;

    }
}
