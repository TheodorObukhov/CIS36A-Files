public class DivisionCalculation {
    public static void main(String[] args){
        double Divisor = 2;
        double Dividend = 1;
        int counter = 0;
        while (Dividend >= 0.0001){
            Dividend = (Dividend/Divisor);
            counter += 1;
        }
        System.out.println(counter);
    }
}
