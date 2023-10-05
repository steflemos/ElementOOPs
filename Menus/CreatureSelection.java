package Menus;

import java.util.Scanner;


public class CreatureSelection extends Menu{
    int optionCreature;
    boolean exit;

    Scanner scanner = new Scanner(System.in);

    
    public boolean selectCreature(){
        System.out.println("criaturas disponiveis 1 e 2 999 para sair");
        optionCreature = scanner.nextInt();

        do{
            switch (optionCreature){
                case 1:
                    System.out.println("escolheu 1");
                    System.out.println("aqui começa a batalha");
                    exit = false;

                    break;

                case 2:
                    System.out.println("escolheu 2");
                    System.out.println("aqui começa a batalha");
                    exit = false;

                    break;

                case 999:
                    exit = confirmExit();

                    break;

                default:
                    System.out.println("código inválido");

                    break;
            }
        } while (exit);

        return exit;
    }
}   
