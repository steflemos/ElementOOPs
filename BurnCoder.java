public class BurnCoder extends Creature {
    @Override
    public String toString() {
        return String.format(
                "%n *****BurnCoder***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPower(), getAttack(), getDefense(), getVelocity(), getLifePoints());
    }

    @Override
    public int getCode() {
        return 65; // Retorna o código correspondente a criatura
    }

    @Override
    public String getName() {
        return "BurnCoder"; // Retorna o nome correspondente a criatura
    }

    @Override
    public void elementArtASCII() {
        System.out.println("Elemento Fogo...\n");
        System.out.println("             ##--                ");
        System.out.println("              ::##MM            ");
        System.out.println("              ##::::mm          ");
        System.out.println("              ##::::##          ");
        System.out.println("              ##::::::          ");
        System.out.println("              ##::::::          ");
        System.out.println("              ::::::::          ");
        System.out.println("            ##::::::mm          ");
        System.out.println("    ##    ##::::::::##      ##  ");
        System.out.println("    ++::::::::  ##::##      ::  ");
        System.out.println("  --::::::::::##  ::++    ##::##");
        System.out.println("  ##::::::::::MM  ::::++##::::##");
        System.out.println("  ##::::::::##    ::::::::::::##");
        System.out.println("    ::::####      ::####::::::  ");
        System.out.println("    ##::##        ######::::##  ");
        System.out.println("      ::##            ##::##    ");
        System.out.println("      @@##          ##::##      ");
        System.out.println("          ##      ######        ");
    } // Retorna a arte correspondente a criatura em ASCII

    @Override
    public String elementAttackPhrase() {
        return "Ataque elemental! Prepare-se para sentir as chamas ardentes, o calor das profundezas se manifesta como um incêndio descontrolado!"; // Retorne
                                                                                                                                                    // a
                                                                                                                                                    // frase
                                                                                                                                                    // do
                                                                                                                                                    // ataque
                                                                                                                                                    // elemental
                                                                                                                                                    // correspondente
                                                                                                                                                    // a
                                                                                                                                                    // criatura
    }

}
