import java.util.Scanner;

public class Teste{

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int optionMenuInicial;
    int optionExit;
    boolean exit;
    int optionCreature;

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
                do {
                    System.out.println("teste inicio do jogo");

                    System.out.println("criaturas disponiveis 1 e 2 999 para sair");
                    optionCreature = scanner.nextInt();

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
                            System.out.println("saindo...");
                            exit = false;
                            break;
                            //implementar a opção se o usuário tem certeza
                        default:
                            System.out.println("código inválido");
                            break;
                    }


                } while (exit);

                //Uma vez escolhida a criatura, 
                //um menu deve ser apresentado com as opções de iniciar o torneio ou sair do programa

                // break;
            } else {
                System.out.println("opção inválida");
            }

        } while (exit);
    }
}