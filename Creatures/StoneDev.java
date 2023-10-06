package Creatures;

public class StoneDev extends Creatures {

    @Override
    public String toString() {
        return String.format(
                "%n *****StoneDev***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPoder(), getAtaque(), getDefesa(), getVelocidade(), getPontosDeVida());
    }

    public int getCode() {
        return 14; // Retorne o código correspondente a criatura
    }

    public String getName() {
        return "StoneDev";  // Retorne o nome correspondente a criatura
    }

}