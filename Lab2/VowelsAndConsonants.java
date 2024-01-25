//Because I didn't know what a vowel or consonant is, I used 
//this website and thus their code to do the work. Hopefully
//this doesn't count as plaigarism.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class VowelsAndConsonants {
    public static void main(String[] args) throws IOException{
        String str = "";
        int VowelCount = 0;
        int ConCount = 0;
        int NumberCount = 0;
        while (true) {
            System.out.println("Insert a character: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputStr = reader.readLine();
            if ((inputStr.length()) > 1) {
                System.out.println("You have input too many characters. Please enter only one.");
                continue;
            }

            char inputChar = inputStr.charAt(0);
            if ((inputChar == '/')) { //Couldn't seem to get it to work with \n so I elected with '/' to just get it done.
                break;
            }
            else{
                str = str + inputChar;
                if ((Character.isDigit(inputChar))){
                    NumberCount++;
                }
                continue;
            }
        }
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {       
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                VowelCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {        
                ConCount++;    
            } 
        }
        
        System.out.println(str);
        System.out.println("Vowel Count: " + VowelCount);
        System.out.println("Consonant Count: " + ConCount);
        System.out.println("Number Count: " + NumberCount);
        System.out.println("Other characters Count: " + ((str.length())-VowelCount-ConCount-NumberCount));
    }
}
