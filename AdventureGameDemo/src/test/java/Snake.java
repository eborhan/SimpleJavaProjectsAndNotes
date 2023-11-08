import java.util.Random;

public class Snake extends Obstacle{
    public Snake(){
        super("Yılan",0,12,0,12);
        Random RandomNumber = new Random();
        this.setDamage(RandomNumber.nextInt(3,6));
        this.setNumber(RandomNumber.nextInt(1,6));
    }
}
