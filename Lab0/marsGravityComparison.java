public class marsGravityComparison {
    public static void main(String[] args) 
    {
    double weightEarth;
    double weightMars;
    double conversionRate = 0.37;
    for (weightEarth = 100; weightEarth <= 600; weightEarth++)
    {
        weightMars = (weightEarth*conversionRate);
        System.out.println("Weight on Earth: " + weightEarth);
        System.out.println( "Weight on Mars: "+ weightMars);
        System.out.println();
    }
    }
}
