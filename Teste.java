import java.util.Scanner;

public class Teste{

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int optionMenuInicial;
    int optionExit;
    boolean exit;

        //O jogo inicia apresentando um menu para o jogador, oferecendo as opções de iniciar um novo jogo ou sair do programa. o programa deve exibir uma mensagem e solicitar a confirmação da ação.

        do{
            exit = true;

            System.out.print("Iniciar um novo jogo [1] ou sair do programa [999]\n>> ");
            optionMenuInicial = scanner.nextInt();

            if (optionMenuInicial == 999){
                System.out.println("tem certeza? digite 1 para sair");
                optionExit = scanner.nextInt();

                if (optionExit == 1){
                    System.out.println("saindo...");
                    exit = false;
                } 
            } else if (optionMenuInicial == 1){
                System.out.println("iniciando jogo");

                break;
            } else {
                System.out.println("opção inválida");
            }

        } while (exit);
    }
}