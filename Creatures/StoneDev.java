package Creatures;

public class StoneDev extends Creatures {
    @Override
    public String toString() {
        return String.format(
            "%n *****StoneDev***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
            getPower(), getAttack(), getDefense(), getVelocity(), getLifePoints());
    }

    @Override
    public int getCode() {
        return 14; // Retorne o código correspondente a criatura
    }

    @Override
    public String getName() {
        return "StoneDev"; // Retorne o nome correspondente a criatura
    }

    @Override
    public void elementMethod() {
        System.out.println("Elemento Terra...");
        System.out.println("                    ##::::::##                    ");
        System.out.println("                    ##mm++::::++                  ");
        System.out.println("                      ::::##mm++  ##MM::::####    ");
        System.out.println("                      @@++mmmmMM##::##::::::mmMM  ");
        System.out.println("            ########            ::::++MM++mm++##  ");
        System.out.println("        ##::::::mm::++      mm##::mmmmmm++++MM    ");
        System.out.println("      ##::::++++mmmmMM##mm  ####mmmmmmmmmmMM##    ");
        System.out.println("      ::++++MMmmmm@@mm##  --##  ##mmmmMMMM##      ");
        System.out.println("    ::::mmmmmmmmmm##MM    ..MM      ::..          ");
        System.out.println("      mmmmmmmmmmmmmm##  ....--##                  ");
        System.out.println("        ##mmmmmmMM####....--------##              ");
        System.out.println("                  ##    ####  ------++            ");
        System.out.println("                ##              ------++          ");
        System.out.println("                                --------##        ");
        System.out.println("              ##                  ------++        ");
        System.out.println("                MM..              ------MM        ");
        System.out.println("                  ####        ####  ----mm##      ");
        System.out.println("                  --          ----  ----mm##      ");
        System.out.println("            --  ----      ..  ----  ----++##      ");
        System.out.println("              ##::                ----++mm##      ");
        System.out.println("                  @@----------------mmmm##        ");
        System.out.println("                  --##------------mmmm##          ");
        System.out.println("                    ##++mmmmmmmmmmmm              ");
        System.out.println("                    ::##      mm::              ");

    } // Retorna o arte correspondente a criatura em ASCII

}