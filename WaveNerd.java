
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
    public void elementMethod() {
        System.out.println("Elemento Água ASCCI ART"); // Retorna o arte correspondente a criatura em ASCII
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