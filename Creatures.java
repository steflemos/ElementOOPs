import java.util.Random;

public class Creatures {
    
     Random aleatorio = new Random();

     protected int poder = aleatorio.nextInt((30 - 10) +1) + 10;
     protected int ataque = aleatorio.nextInt((15 - 5) + 1) + 5;
     protected int defesa = aleatorio.nextInt((15 - 5) + 1) + 5;
     protected int velocidade = aleatorio.nextInt((10 - 1) + 1) + 1;
     protected int pontosDeVida = aleatorio.nextInt((400 - 200) + 1) + 200;

public Creatures(){
    getPoder();
    getAtaque();
    getDefesa();
    getVelocidade();
    getPontosDeVida();

}

public int getPoder(){
    return this.poder;
}

public int getAtaque(){
    return this.ataque;
}

public int getDefesa(){
    return this.defesa;
}

public int getVelocidade(){
    return this.velocidade;
}

public int getPontosDeVida(){
    return this.pontosDeVida;
}
    
} // fim da classe Creatures