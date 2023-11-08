import java.util.Random;

public class Zombie extends Obstacle{
    public Zombie() {
        super("Zombi",3,10,4,10);
        Random randomobs = new Random();
        this.setNumber(randomobs.nextInt(1,4));

    }
}
