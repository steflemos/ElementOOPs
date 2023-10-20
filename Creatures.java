
import java.util.Random;

public abstract class Creatures {

    private Random random = new Random();

    // lógica usada para sortear um número inteiro de acordo com as especificações
    // do enunciado da atividade:
    private int power = random.nextInt((30 - 10) + 1) + 10;
    private int attack = random.nextInt((15 - 5) + 1) + 5;
    private int defense = random.nextInt((15 - 5) + 1) + 5;
    private int velocity = random.nextInt((10 - 1) + 1) + 1;
    private int lifepoints = random.nextInt((400 - 200) + 1) + 200;

    public Creatures() {
        // setPower(power);
        // setAttack(attack);
        // setDefense(defense);
        // setVelocity(velocity);
        // setLifePoints(lifepoints);
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