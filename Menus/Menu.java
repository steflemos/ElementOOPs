package Menus;

import java.util.Scanner;

public class Menu {
    private int optionExit;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    Scanner scanner = new Scanner(System.in);

    public boolean confirmExit() {
        System.out.print(
                ANSI_RED + "\nVocê tem certeza que deseja sair?" + ANSI_RESET + "\n\nDigite 1 para confirmar \n>> ");
        optionExit = scanner.nextInt();

        // caso a opção for 1 ele encerra o programa
        boolean exit = !(optionExit == 1);

        System.out.println(optionExit == 1 ? "Saindo..." : "[ERROR] Opção inválida. Tente novamente.");

        return exit;

    }
}
