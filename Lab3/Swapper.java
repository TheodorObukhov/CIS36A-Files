public class Swapper {
    int x;
    int y;
    public Swapper(){
        x = 5;
        y = 3;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void swap(){
        int storage = x;
        x = y;
        y = storage;
    }
}
