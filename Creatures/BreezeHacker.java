package Creatures;

public class BreezeHacker extends Creatures {

    @Override
    public String toString() {
        return String.format(
                "%n *****BreezeHacker***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPoder(), getAtaque(), getDefesa(), getVelocidade(), getPontosDeVida());
    }

    public int getCode() {
        return 19; // Retorne o código correspondente a criatura
    }

    public String getName() {
        return "BreezeHacker";  // Retorne o nome correspondente a criatura
    }

}
