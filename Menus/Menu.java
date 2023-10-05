package Menus;

import java.util.Scanner;


public class Menu {
    private int optionExit;

    Scanner scanner = new Scanner(System.in);


    public boolean confirmExit(){
        System.out.println("tem certeza? digite 1 para sair");
        optionExit = scanner.nextInt();

        if (optionExit == 1){
            System.out.println("saindo...");
            return false;
        }

        return true;
    }

}
