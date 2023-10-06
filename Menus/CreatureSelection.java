package Menus;

import java.util.Scanner;

import Creatures.BreezeHacker;
import Creatures.BurnCoder;
import Creatures.Creatures;
import Creatures.StoneDev;
import Creatures.WaveNerd;


public class CreatureSelection extends Menu{
    int optionCreature;
    boolean exit;
    int selectedCreatureCode;

    Scanner scanner = new Scanner(System.in);

    
    public boolean selectCreature(){
        System.out.println(
            "\nCriaturas disponíveis: \n\nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n\n[999] Sair do programa \n"
        );
              
        optionCreature = scanner.nextInt();

        do{
            switch (optionCreature){
                case 14:
                    Creatures stonedev = new StoneDev();
                    System.out.print("Criatura selecionada:\n" + stonedev);
                    selectedCreatureCode = 14;

                    System.out.println("aqui começa a batalha");
                    
                    exit = false;

                    break;

                case 87:
                    Creatures wavenerd = new WaveNerd();
                    System.out.print("Criatura selecionada:\n" + wavenerd);
                    selectedCreatureCode = 87;
                    
                    System.out.println("aqui começa a batalha");
                    
                    exit = false;

                    break;

                case 65:
                    Creatures burncoder = new BurnCoder();
                    System.out.print("Criatura selecionada:\n" + burncoder);
                    selectedCreatureCode = 65;

                    System.out.println("aqui começa a batalha");

                    break;
                case 19:
                    Creatures breezehacker = new BreezeHacker();
                    System.out.print("Criatura selecionada:\n" + breezehacker);
                    selectedCreatureCode = 19;

                    System.out.println("aqui começa a batalha");

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

        return exit;
    }
}   
