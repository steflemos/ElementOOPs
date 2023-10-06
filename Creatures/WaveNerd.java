// package Creatures;

// public class WaveNerd extends Creatures {
    
//     @Override
//     public String toString() {
//         return String.format("%n *****WaveNerd***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n", 
//         getPoder(), getAtaque(), getDefesa(), getVelocidade(), getPontosDeVida());
//     }
    
// }

package Creatures;

public class WaveNerd extends Creatures {
    
    @Override
   public String toString() {
        return String.format(
                "%n *****WaveNerd***** %n Poder: %d %n Ataque: %d %n Defesa: %d %n Velocidade: %d %n Pontos de vida: %d %n",
                getPoder(), getAtaque(), getDefesa(), getVelocidade(), getPontosDeVida());
    }

    public int getCode() {
        return 87; // Retorne o código correspondente a criatura
    }

    public String getName() {
        return "WaveNerd";  // Retorne o nome correspondente a criatura
    }
    
}