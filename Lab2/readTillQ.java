import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class readTillQ {
    public static void main(String[] args) throws IOException{
        int foundA = 0;
        while (true){
            System.out.println("Insert a character: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputStr = reader.readLine();
            if ((inputStr.length())>1){
                System.out.println("You have input too many characters. Please enter only one.");
                continue;
            }
            char inputChar = inputStr.charAt(0);
            if ((inputChar == 'Q')||(inputChar == 'q')){
                break;
            }
            else{
                if ((inputChar == 'A')||(inputChar == 'a')){
                    foundA += 1;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println("Found A's: " + foundA);
    }
}
