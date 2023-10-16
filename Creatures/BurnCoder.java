package Creatures;

public class BurnCoder extends Creatures {
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
    public void elementMethod() {
        System.out.println("Elemento Fogo ASCCI ART"); // Retorna o arte correspondente a criatura em ASCII
    }

}
