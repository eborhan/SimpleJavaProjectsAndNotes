import java.util.Random;

public class Vampire extends Obstacle{
    public Vampire() {
        super("Vampir",4,14,7,14);
        Random randomobs = new Random();
        this.setNumber(randomobs.nextInt(1,4));
    }
}
