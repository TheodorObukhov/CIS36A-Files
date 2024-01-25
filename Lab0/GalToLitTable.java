/*
 Try This 1-2
 This program displays a conversion
 table of gallons to liters.
 Call this program "GalToLitTable.java".
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GalToLitTable {
    public static void main(String[] args) 
            throws IOException{
        double liters;
        double conversionRate = 3.7854;

        System.out.println("Gallons: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String gallonsStr = reader.readLine();
        double gallons = Double.parseDouble(gallonsStr);

        liters = (gallons*conversionRate);
        System.out.println("Liters: "+liters);
    }
}