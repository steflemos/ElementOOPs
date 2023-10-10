package Creatures;

public class StoneDev extends Creatures {

    @Override
    public String toString() {
        return String.format(
                "%n *****StoneDev***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPower(), getAttack(), getDefense(), getVelocity(), getLifePoints());
    }

    public int getCode() {
        return 14; // Retorne o código correspondente a criatura
    }

    public String getName() {
        return "StoneDev"; // Retorne o nome correspondente a criatura
    }

    @Override
    public void elementMethod() {
        System.out.println("Elemento Terra...");
        System.out.println("                            ####@@                          ");
        System.out.println("                    ::##################                    ");
        System.out.println("                  ########################--                ");
        System.out.println("                ############    MM############              ");
        System.out.println("              ############          ##########--            ");
        System.out.println("            ############  --##  ##  ::##########            ");
        System.out.println("            ##########      ##  ####  ############          ");
        System.out.println("          ############  ##      ####    ##########          ");
        System.out.println("          ############  ####    ##  MM  ##########          ");
        System.out.println("          ############  ######    ##    ##########          ");
        System.out.println("          ############  mm####  ####  ############::        ");
        System.out.println("          ##############  ####  ##    ############..        ");
        System.out.println("          ##############@@  ##      ##############          ");
        System.out.println("          ##################      ################          ");
        System.out.println("            ##################  ################            ");
        System.out.println("            ######          ##  ##########--                ");
        System.out.println("                    ######        ::--      ##MM            ");
        System.out.println("                ################      ::######              ");
        System.out.println("                  ##########################                ");
        System.out.println("                    @@##################                    ");
        System.out.println("                          ########                          ");

    } // Retorna o arte correspondente a criatura em ASCII

}