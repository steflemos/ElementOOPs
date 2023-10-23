
public class StoneDev extends Creature {
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
    public void elementArtASCII() {
        System.out.println("Elemento Terra... +");
        System.out.println("        --####            ");
        System.out.println("        ##########          ");
        System.out.println("      ####  ##  MM##        ");
        System.out.println("      ##    ##    ####      ");
        System.out.println("    ##      ##      ##      ");
        System.out.println("  ########  ##  ####@@##    ");
        System.out.println("  ##    --########    ##    ");
        System.out.println("  ##        ##        @@##  ");
        System.out.println("  ##        ##        ####  ");
        System.out.println("MM######    ##      ######  ");
        System.out.println("MM##  ####@@##  ####    ##  ");
        System.out.println("  ##      ######      ..##  ");
        System.out.println("  ##        ##        ##    ");
        System.out.println("    ##      ##      ####    ");
        System.out.println("    ..##mm  ##    ####      ");
        System.out.println("        ##########          ");
        System.out.println("            ##              ");
        System.out.println("            ##              ");
    } // Retorna a arte correspondente a criatura em ASCII

    @Override
    public String elementAttackPhrase() {
        return "Ataque elemental! Prepara-se para sentir a força da terra se manifestando das mais profundezas do solo!"; // Retorne
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