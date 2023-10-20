
public class WaveNerd extends Creatures {
    @Override
    public String toString() {
        return String.format(
                "%n *****WaveNerd***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPower(), getAttack(), getDefense(), getVelocity(), getLifePoints());
    }

    @Override
    public int getCode() {
        return 87; // Retorna o código correspondente a criatura
    }

    @Override
    public String getName() {
        return "WaveNerd"; // Retorna o nome correspondente a criatura
    }

    @Override
    public void elementArtASCII() {
        System.out.println("Elemento Água...\n"); // Retorna o arte correspondente a criatura em ASCII                             
System.out.println("               ##             ");
System.out.println("              ####            ");
System.out.println("            ######--          ");
System.out.println("           ########          ");
System.out.println("          ############        ");
System.out.println("        ##############++      ");
System.out.println("        ################      ");
System.out.println("      ####################    ");
System.out.println("    ######################MM  ");
System.out.println("    ########################  ");
System.out.println("  ############################");
System.out.println("  ############################");
System.out.println("  ######################  ####");
System.out.println("  ####################    ####");
System.out.println("  ####################  ######");
System.out.println("  ################      ######");
System.out.println("    ##########      ########  ");
System.out.println("      ####################    ");
System.out.println("        ################      ");
System.out.println("            ########          ");
                              
    }

    public String elementAttackPhrase() {
        return "Ataque elemental! Prepare-se para ser submergido por uma força incontrolável da água, uma corrente de água pura e cristalina desce como uma cascata devastadora!"; // Retorne
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