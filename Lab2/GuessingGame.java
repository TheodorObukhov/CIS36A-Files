import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GuessingGame {
    public static void main(String[] args) throws IOException{
        int counterGuesses = 0;
        double durationGuessing = 0;
        int target = ((int)((Math.random()) * 100));
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Are you ready to start the game? If not, press F to exit the game at any time.");
        String userInputString;
        while(true){
            System.out.println("Guess a number from 1 to 100: ");
            
            long startTimer = System.currentTimeMillis();
            userInputString = scanner.readLine();
            
            long endTimer = System.currentTimeMillis();
            durationGuessing = ((double)(endTimer-startTimer)+durationGuessing);
            int userInputInt = 4;
            counterGuesses += 1;
            try{
                userInputInt = Integer.parseInt(userInputString);
            }
            catch(Exception e){
                System.out.println("You inputted something besides a integer in. To leave, press f. To try again, press e");
                String userInputStr = scanner.readLine();
                char inputChar = userInputStr.charAt(0);
                if (inputChar == 'f'){
                    System.out.println("You have selected to leave. Goodbye.");
                    System.exit(0);
                }
                if (inputChar == 'e'){
                    System.out.println("You have selected to try again.");
                    continue;
                }
                if ((userInputStr != "f")||(userInputStr != "e")){
                    System.out.println("You inputted something besides f or e. Please try again.");
                }
            }
            if (userInputInt != target){
                if (userInputInt > target){
                    System.out.println("Too high");
                    continue;
                }
                if (userInputInt < target){
                    System.out.println("Too low");
                    continue;
                }
            }
            else{
                break;
            }  
        }
        int durationGuessingInt = (int)(durationGuessing/1000);
        int negativeScoreModifier = 0;
        if (counterGuesses > 10){                
            int MoreThan10 = 0;
            MoreThan10 = (counterGuesses - 10);
            negativeScoreModifier = (0-MoreThan10);
        }
        int points = (100 - (durationGuessingInt + counterGuesses)+negativeScoreModifier);
        System.out.println("You have guessed correctly! Your score was: " + points + " out of 100.");
        System.out.println("Total Guesses: " + counterGuesses);
        System.out.println("Total time spent guessing: " + durationGuessingInt + " seconds.");
    }
}