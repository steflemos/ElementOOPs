public class WaveNerd extends Creatures {
    
    @Override
    public String toString() {
        return String.format("%n *****WaveNerd***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n", 
        getPoder(), getAtaque(), getDefesa(), getVelocidade(), getPontosDeVida());
    }
    
}