import Menus.Program;

public class Main {
    public static void main(String[] args){

        Program program = new Program();

        System.out.println(
        "\n" + //
                "  ______ _                           _    ____   ____  _____   _____ \n" + //
                " |  ____| |                         | |  / __ \\ / __ \\|  __ \\ / ____|\n" + //
                " | |__  | | ___ _ __ ___   ___ _ __ | |_| |  | | |  | | |__) | (___  \n" + //
                " |  __| | |/ _ \\ '_ ` _ \\ / _ \\ '_ \\| __| |  | | |  | |  ___/ \\___ \\ \n" + //
                " | |____| |  __/ | | | | |  __/ | | | |_| |__| | |__| | |     ____) |\n" + //
                " |______|_|\\___|_| |_| |_|\\___|_| |_|\\__|\\____/ \\____/|_|    |_____/ \n" + //
                "                                                                     \n" + //
                "                                                                     \n" + //
                ""
        );
        
        program.startProgram();
    }
}
