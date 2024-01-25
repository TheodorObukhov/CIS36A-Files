public class Rational {
    int numerator;
    int denominator;
    public Rational(){
        numerator = 8;
        denominator = 1;
    }
    public void printRational(){
        System.out.println(numerator + "/" + denominator);
    }
    public void negate(){
        if ((numerator>0)&&(denominator>0)){
            denominator = 0-denominator;
        }
        if ((numerator<0)&&(denominator<0)){
            denominator = denominator-0;
        }
        else{
            if (denominator>0){
                denominator = 0-denominator;
            }
            else{
                denominator = denominator-0;
            }
        }
    }
    public void invert(){
        int storage = denominator;
        denominator = numerator;
        numerator = storage;
    }
    public double toDouble(){
        return(numerator/denominator);
    }
    public int reduce(){
        int i;
        int gcd = 1;
        for (i = 2; i <= Math.min(numerator, denominator); i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        return gcd;

    }
    
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public int[] add(int num, int den){
        int comd = denominator * den;
        int newNomAnswer = numerator * den + num * denominator;

        int d;
        d = gcd(comd, newNomAnswer);

        comd = comd / d;
        newNomAnswer = newNomAnswer / d;

        int[] newFraction = new int[2];
        newFraction[0] = newNomAnswer;
        newFraction[1] = comd;
        return newFraction;
    }
}
