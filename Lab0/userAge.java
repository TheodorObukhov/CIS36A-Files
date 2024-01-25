import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class userAge {
    public static void main(String[] args)
            throws IOException {
        System.out.println("Age: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String age = reader.readLine();
        int AgeInt = Integer.parseInt(age);
        if (AgeInt >= 18)
        {
            System.out.println("Eligible to vote.");
        }
        else
        {
            System.out.println("Not eligible to vote.");
        }
    }
}
