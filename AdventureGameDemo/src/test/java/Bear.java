import java.util.Random;

public class Bear extends Obstacle{
    public Bear() {
        super( "Ayı", 7,  20, 12,20);
        Random randomobs = new Random();
        this.setNumber(randomobs.nextInt(1,3));

    }
}
