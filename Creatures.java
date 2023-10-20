
import java.util.Random;

public abstract class Creatures {

    private Random random = new Random();

    // lógica usada para sortear um número inteiro de acordo com as especificações
    // do enunciado da atividade:
    private int power;
    private int attack;
    private int defense;
    private int velocity;
    private int lifepoints;

    public Creatures() {
        power = random.nextInt((30 - 10) + 1) + 10;
        attack = random.nextInt((15 - 5) + 1) + 5;
        defense = random.nextInt((15 - 5) + 1) + 5;
        velocity = random.nextInt((10 - 1) + 1) + 1;
        lifepoints = random.nextInt((400 - 200) + 1) + 200;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getVelocity() {
        return this.velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getLifePoints() {
        return this.lifepoints;
    }

    public void setLifePoints(int lifepoints) {
        this.lifepoints = lifepoints;
    }

    // metodos abstratos usados nas subclasses:
    public abstract int getCode();

    public abstract String getName();

    public abstract void elementArtASCII();

    public abstract String elementAttackPhrase();

} // fim da classe Creatures