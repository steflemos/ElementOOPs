import java.util.Scanner;

import Creatures.BreezeHacker;
import Creatures.BurnCoder;
import Creatures.Creatures;
import Creatures.StoneDev;
import Creatures.WaveNerd;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String optionYorN;

        while (true) {
            System.out.print("Iniciar um novo jogo [1] ou sair do programa [2]\n>> ");
            option = scanner.nextInt();

            if (option == 1) {
                while (true) {
                    System.out.print(
                            "Criaturas disponíveis: \nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n");
                    System.out.print("Digite o código da criatura escolhida ou digite 2 para sair\n>> ");
                    option = scanner.nextInt();

                    int selectedCreatureCode = 0;
                    switch (option) {
                        case 14:
                            Creatures stonedev = new StoneDev();
                            System.out.print("Criatura selecionada: " + stonedev);
                            selectedCreatureCode = 14; // Armazena o código da criatura
                            break;
                        case 87:
                            Creatures wavenerd = new WaveNerd();
                            System.out.print("Criatura selecionada: " + wavenerd);
                            selectedCreatureCode = 87;
                            break;
                        case 65:
                            Creatures burncoder = new BurnCoder();
                            System.out.print("Criatura selecionada: " + burncoder);
                            selectedCreatureCode = 65;
                            break;
                        case 19:
                            Creatures breezehacker = new BreezeHacker();
                            System.out.print("Criatura selecionada: " + breezehacker);
                            selectedCreatureCode = 19;
                            break;
                        case 2:
                            System.out.println("Saindo...");
                            return; // Sai do programa completamente
                        case 3:
                            System.out.println("Saindo...");
                            return; // Sai do programa completamente
                        default:
                            System.out.println("Código inválido! Por favor, selecione um código válido.");
                    }

                    while (true) {
                        System.out.print("\nIniciar um torneio [1] ou sair do programa [2]\n>> ");
                        option = scanner.nextInt();

                        if (option == 1 || option == 2) {
                            break;
                        }
                    }

                    if (option == 2) {
                        System.out.println("Saindo...");
                        return; // Sai do programa completamente
                    } else {
                        // Iniciar a batalha
                        Battle battle = new Battle();
                        battle.startBattle(selectedCreatureCode); // Passa o código da criatura escolhida
                    }
                }
            } else if (option == 2) {
                System.out.print("\nVocê tem certeza que deseja sair? Y/N\n>> ");
                optionYorN = scanner.next();
                if (optionYorN.equalsIgnoreCase("Y")) {
                    System.out.println("Saindo...");
                    return; // Sai do programa completamente
                }
            } else {
                System.out.println("\n[ERRO] Digite um código válido\n");
            }
        }
    }
}
