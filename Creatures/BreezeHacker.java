package Creatures;

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
    public void elementMethod() {
        System.out.println("Elemento Ar ASCCI ART"); // Retorna o arte correspondente a criatura em ASCII
    }

}
