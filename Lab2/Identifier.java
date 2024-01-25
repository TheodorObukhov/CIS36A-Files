import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Identifier {
    public static void main(String[] args) throws IOException{
        System.out.println("Input a identifier: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = reader.readLine();

        for (int i = 1; i<inputStr.length(); i++){
            if (!Character.isJavaIdentifierPart(inputStr.charAt(i))){
                System.out.println("Is not a valid identifier");
            }
        }
        System.out.println("Is a valid identifier");
    }
}
