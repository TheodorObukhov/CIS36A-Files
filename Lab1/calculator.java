import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class calculator {
    public static void main(String[] args) 
    throws IOException{
        System.out.println("Enter a dollar amount: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dollarsStr = reader.readLine();
        double dollarAmount = Double.parseDouble(dollarsStr);

        int quarters, dimes, nickels, pennies;
        double remainder=0;

        quarters = (int)(Math.floor(dollarAmount/0.25));
        System.out.println(quarters + " quarters");
        remainder = (dollarAmount%0.25);

        dimes = (int)(Math.floor(remainder/0.10));
        System.out.println(dimes + " dimes");
        remainder = (remainder%0.10);

        nickels = (int)(Math.floor(remainder / 0.05));
        System.out.println(nickels + " nickels");
        remainder = (remainder % 0.05);

        pennies = (int)(Math.floor(remainder / 0.01));
        System.out.println(pennies + " pennies");
    }
}