package Creatures;

public class StoneDev extends Creatures {

    @Override
    public String toString() {
        return String.format(
                "%n *****StoneDev***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPoder(), getAtaque(), getDefesa(), getVelocidade(), getPontosDeVida());
    }

}