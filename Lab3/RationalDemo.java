import java.util.Arrays;

public class RationalDemo {
    public static void main(String[] args){
        Rational rational = new Rational();
        rational.denominator = 8;
        rational.numerator = 4;
        rational.printRational();
        rational.invert();
        rational.printRational();
        System.out.println(rational.toDouble());
        System.out.println(rational.reduce());
        System.out.println(Arrays.toString(rational.add(3, 7)));
    }
}
