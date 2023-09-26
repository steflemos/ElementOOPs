public class BurnCoder extends Creatures {
    public BurnCoder(){
        getPoder();
        getAtaque();
        getDefesa();
        getVelocidade();
        getPontosDeVida();
    }
    
    @Override
    public String toString() {
        return String.format("%s %n %s: %d %n %s: %d %n %s: %d %n %s: %d %n %s: %d %n",
         "*****BurnCoder*****",
                "Poder", getPoder(), 
                "Ataque", getAtaque(),
                "Defesa", getDefesa(), 
                "Velocidade", getVelocidade(),
                "Pontos de Vida", getPontosDeVida());
    }
    
}
