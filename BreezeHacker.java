public class BreezeHacker extends Creatures {
    public BreezeHacker(){
        getPoder();
        getAtaque();
        getDefesa();
        getVelocidade();
        getPontosDeVida();
    }
    
    @Override
    public String toString() {
        return String.format("%s %n %s: %d %n %s: %d %n %s: %d %n %s: %d %n %s: %d %n",
         "*****BreezeHacker*****",
                "Poder", getPoder(), 
                "Ataque", getAtaque(),
                "Defesa", getDefesa(), 
                "Velocidade", getVelocidade(),
                "Pontos de Vida", getPontosDeVida());
    }
    
}
