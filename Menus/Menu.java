package Menus;

import java.util.Scanner;


public class Menu {
    private int optionExit;

    Scanner scanner = new Scanner(System.in);

    public boolean confirmExit(){
        System.out.print("Você tem certeza que deseja sair?\nDigite 1 para confirmar \n>>> ");
        optionExit = scanner.nextInt();

        //caso a opção for 1 ele encerra o programa
        boolean exit = !(optionExit == 1);

        System.out.println(optionExit == 1 ? "Saindo..." : "[ERROR] Opção inválida. Tente novamente.");

        return exit;

    }

}
