import java.util.Random;

public class Die {
    int sideUp;
    public Die(){
        Random rand = new Random();
        sideUp = rand.nextInt(6);
    }
    int getSideUp(){
        return sideUp;
    }
    void roll(){
        Random rand = new Random();
        sideUp = rand.nextInt(6);
    }
}
