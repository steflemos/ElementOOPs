package Creatures;

public class BurnCoder extends Creatures {
    
    @Override
    public String toString() {
        return String.format("%n *****BurnCoder***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n", 
        getPoder(), getAtaque(), getDefesa(), getVelocidade(), getPontosDeVida());
    }
    
}
