/* This program converts Fahrenheit to Celsius. */
class converter {
    public static void main(String[] args) {
        double x, xx;
        x = 3.5;
        xx = (x - 32) * 5.0 / 9.0;
        System.out.print(x + " degrees Fahrenheit is ");
        System.out.println(xx + " degrees Celsius.");
    }
}