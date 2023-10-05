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

            System.out.print("Iniciar um novo jogo [1] ou sair do programa [999]\n>> ");
            optionMenuInicial = scanner.nextInt();

            if (optionMenuInicial == 999){
                exit = confirmExit();

            } else if (optionMenuInicial == 1){
                exit = creatureSelection.selectCreature();
            
            } else {
                System.out.println("opção inválida");

            }

        } while (exit);
    }
}
