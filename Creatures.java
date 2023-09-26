import java.util.Random;

public class Creatures {
    
     Random aleatorio = new Random();

     int poder = aleatorio.nextInt(30 - 10) + 10;
     int ataque = aleatorio.nextInt(15 - 5) + 5;
     int defesa = aleatorio.nextInt(15 - 5) + 5;
     int velocidade = aleatorio.nextInt(10 - 1) + 1;
     int pontosDeVida = aleatorio.nextInt(400 - 200) + 200;

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
    return this.defesa;
}

public int getPontosDeVida(){
    return this.defesa;
}
    
} // fim da classe Creatures