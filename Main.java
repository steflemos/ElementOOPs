import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option;
        String optionYorN;

        // do{
        //     System.out.print("Iniciar um novo jogo [1] ou sair do programa [2]\n>> ");
        //     option = scanner.nextInt();
        //     if option == 1 {
        //         do{
        //             System.out.print("Criaturas disponíveis: \nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n");

        //             System.out.print("Digite o código da criatura escolhida ou digite 2 para sair\n>> ");
        //             option = scanner.nextInt();

        //             switch(option){
        //                 case 14:
        //                 // StoneDev stonedev = new StoneDev();
        //                 System.out.print("Criatura selecionada: stoneDev");
        //                 break;
        //                 case 87:
        //                 // WaveNerd wavenerd = new WaveNerd();
        //                 System.out.print("Criatura selecionada: waveNerd");
        //                 break;
        //                 case 65:
        //                 // BurnCoder burncoder = new BurnCoder();
        //                 System.out.print("Criatura selecionada: burncoder");
        //                 break;
        //                 case 19:
        //                 // BreezeHacker breezehacker = new BreezeHacker();
        //                 System.out.print("Criatura selecionada: breezehacker");
        //                 break;
        //                 default:
        //                 System.out.print("Codigo inválido! Por favor, selecione um codigo válido.");
        //             }

        //             do{
        //                 System.out.print("Iniciar um torneio [1] ou sair do programa [2]\n>> ");
                        
        //             } while(option != 2);

        //         } while(option != 2);
        //     } elif (opion == 2){
        //         System.out.print("\nVocê tem certeza que deseja sair? Y/N\n>> ");
        //         optionYorN = scanner.nextStr();
        //         if (optionYorN == 'Y'){
        //             System.out.print("Saindo...");
        //         } elif (optionYorN == 'N'){
        //             option = 
        //         }

        //     } else{
        //         System.out.print("\n[ERROR] Digite um código válido\nIniciar um novo jogo [1] ou sair do programa [2]\n>> ");
        //         option = scanner.nextInt();
        //     }
        // } while(option != 2);

        while (True){
            System.out.print("Iniciar um novo jogo [1] ou sair do programa [2]\n>> ");
            option = scanner.nextInt();
            if (option == 1) {
                while (True){
                    System.out.print("Criaturas disponíveis: \nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n");

                    System.out.print("Digite o código da criatura escolhida ou digite 2 para sair\n>> ");
                    option = scanner.nextInt();

                    switch(option){
                        case 14:
                        // StoneDev stonedev = new StoneDev();
                        System.out.print("Criatura selecionada: stoneDev");
                        break;
                        case 87:
                        // WaveNerd wavenerd = new WaveNerd();
                        System.out.print("Criatura selecionada: waveNerd");
                        break;
                        case 65:
                        // BurnCoder burncoder = new BurnCoder();
                        System.out.print("Criatura selecionada: burncoder");
                        break;
                        case 19:
                        // BreezeHacker breezehacker = new BreezeHacker();
                        System.out.print("Criatura selecionada: breezehacker");
                        break;
                        case 2:
                            System.out.print("Saindo...");
                            break;
                        default:
                        System.out.print("Codigo inválido! Por favor, selecione um codigo válido.");
                    }

                    while (True){
                        System.out.print("Iniciar um torneio [1] ou sair do programa [2]\n>> ");
                        break;
                    }
                }
            } else if (opion == 2){
                System.out.print("\nVocê tem certeza que deseja sair? Y/N\n>> ");
                optionYorN = scanner.nextStr();
                if (optionYorN == 'Y'){
                    System.out.print("Saindo...");
                    break;
                }
            } else{
                System.out.print("\n[ERROR] Digite um código válido\nIniciar um novo jogo [1] ou sair do programa [2]\n>> ");
                option = scanner.nextInt();
            }
        }

    }
}