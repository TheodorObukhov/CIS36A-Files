public class mathRandom {
    public static void main(String[] args)
    {
        double y;
        int counter = 0;
        for(int x=0;x<=1000;x++)
        {
            y = Math.random();
            if (y>0.5)
            {
                counter +=1;
            }
        }
        System.out.println(counter);
    }
}
