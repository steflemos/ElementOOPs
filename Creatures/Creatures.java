package Creatures;

import java.util.Random;

public class Creatures {

    Random aleatorio = new Random();

    private int poder = aleatorio.nextInt((30 - 10) + 1) + 10;
    private int ataque = aleatorio.nextInt((15 - 5) + 1) + 5;
    private int defesa = aleatorio.nextInt((15 - 5) + 1) + 5;
    private int velocidade = aleatorio.nextInt((10 - 1) + 1) + 1;
    private int pontosDeVida = aleatorio.nextInt((400 - 200) + 1) + 200;

    public Creatures() {
        setPoder(poder);
        setAtaque(ataque);
        setDefesa(defesa);
        setVelocidade(velocidade);
        setPontosDeVida(pontosDeVida);
    }

    public int getPoder() {
        return this.poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getPontosDeVida() {
        return this.pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

} // fim da classe Creatures