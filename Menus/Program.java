package Menus;

import java.util.Scanner;


public class Program extends Menu{
    int optionMenuInicial;
    int optionExit;
    boolean exit;

    Scanner scanner = new Scanner(System.in);
    CreatureSelection creatureSelection = new CreatureSelection();


    public void startProgram(){
        do{
            exit = true;
            System.out.println("\n--------------------------------------");
            System.out.println("|             ElementOOPS             |");
            System.out.println("--------------------------------------\n");
            System.out.print("[1] Iniciar novo jogo\n[999] Sair do jogo\n>>> ");
            optionMenuInicial = scanner.nextInt();

            if (optionMenuInicial == 999){
                exit = confirmExit();

            } else if (optionMenuInicial == 1){
                exit = creatureSelection.selectCreature();
            
            } else {
                System.out.println("\n[ERROR] Opção inválida. Tente novamente.");

            }

        } while (exit);
    }
}
