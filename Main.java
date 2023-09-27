import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option;

        do{
            System.out.print("Iniciar um novo jogo [1] ou sair do programa [2]\n>> ");
            option = scanner.nextInt();

            do{
                System.out.print("Criaturas disponíveis: \nStoneDev (terra) - [14]\nWaveNerd (água) - [87]\nBurnCoder (fogo) - [65]\nBreezeHacker (ar) - [19]\n");

                System.out.print("Digite o código da criatura escolhida ou digite 2 para sair\n>> ");
                option = scanner.nextInt();

                switch(option){
                    case 14:
                    StoneDev stonedev = new StoneDev();
                    System.out.print("Criatura selecionada: " + stonedev);
                    break;
                    case 87:
                    WaveNerd wavenerd = new WaveNerd();
                    System.out.print("Criatura selecionada: " + wavenerd);
                    break;
                    case 65:
                    BurnCoder burncoder = new BurnCoder();
                    System.out.print("Criatura selecionada: " + burncoder);
                    break;
                    case 19:
                    BreezeHacker breezehacker = new BreezeHacker();
                    System.out.print("Criatura selecionada: " + breezehacker);
                    break;
                    default:
                    System.out.print("Codigo inválido! Por favor, selecione um codigo válido.");
                }

                do{
                    System.out.print("Iniciar um torneio [1] ou sair do programa [2]\n>> ");
                    
                } while(option != 2);

            } while(option != 2);

        } while(option != 2);

    }
}