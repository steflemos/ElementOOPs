public class BreezeHacker extends Creatures {
    @Override
    public String toString() {
        return String.format(
                "%n *****BreezeHacker***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPower(), getAttack(), getDefense(), getVelocity(), getLifePoints());
    }

    @Override
    public int getCode() {
        return 19; // Retorna o código correspondente a criatura
    }

    @Override
    public String getName() {
        return "BreezeHacker"; // Retorna o nome correspondente a criatura
    }

    @Override
    public void elementArtASCII() {
        System.out.println("Elemento Ar...\n"); // Retorna o arte correspondente a criatura em ASCII

 System.out.println("                        ##############                      ");
 System.out.println("                    ####              @@##                  ");
 System.out.println("                  ##    ####MMmm####      ##                ");
 System.out.println("                ##    ##            ::##    ##              ");
 System.out.println("                    ##    ########++    ##    ##            ");
 System.out.println("              ##  ##  mm            ##    ##  ##            ");
 System.out.println("              ##  ::  MM              ##  ##    ##          ");
 System.out.println("        ++####  ####::                  ..  ##  ##          ");
 System.out.println("        ##############                  ##  ######  ####    ");
 System.out.println("    MM################                ####################  ");
 System.out.println("    ####################              ####################  ");
 System.out.println("    ######################        ########################  ");
 System.out.println("        ##################        ######################    ");
 System.out.println("        ##############..            ################        ");
 System.out.println("              ####                      ##########          ");
    }

    public String elementAttackPhrase() {
        return "Ataque elemental! Prepare-se para ser envolto pela fúria dos ventos, uma tempestade de poder se forma!"; // Retorne
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
