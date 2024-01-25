public class PowersOfThree {
    public static void main(String[] args){
        int base = 3;
        for(int ex=0;ex<10;ex++){
            System.out.println(base + " to the power of " + ex + " equals " + (int)Math.pow(base, ex));
        }
    }
}
