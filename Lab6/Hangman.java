import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hangman {
    //list of words to choose from (20)
    //Random word chosen every time
    //Display the word as underscores and change to correct character when the letter is guessed
    //Have hanging man be made every mistake

    //Function to choose random word from array and returns word
    //Function that takes input of guessed characters and the correct word and returns a string of the hidden word with characters replaced accordingly
    //Function that displays the hanging man with input of wrong characters and /r prints the hanging dude
    
    static String WordGuess(String[] wordList){
        int length = wordList.length;
        int chosenIndex = (int) ((Math.random() * (length - 0)) + 0);
        return wordList[chosenIndex];
    }

    static String[] GuessedLogic(ArrayList<Character> charList, String correctWord){
        int wrongCount=0;
        StringBuilder outputString = new StringBuilder("");
        outputString.setLength(correctWord.length());
        for (int i = 0; i < correctWord.length(); i++){
            outputString.setCharAt(i, '_');
        }
        
        for (int i = 0; i < correctWord.length(); i++) {
            char ch = correctWord.charAt(i);
            for (int j = 0; j < charList.size(); j++) {
                if (charList.get(j) == ch) {
                    outputString.setCharAt(i, ch);
                }
            }
        }
        for (int i=0; i < charList.size(); i++){
            if (correctWord.indexOf(charList.get(i))==-1){
                wrongCount = wrongCount+ 1;
            }
        }
        String[] returnStringArr = {String.valueOf(wrongCount), outputString.toString()};
        return returnStringArr;
    }
    static void displayManAndWord(int wrongCount, String correctWord, String guessedLogicOutput, ArrayList<Character> charList){
        String head = " ";
        String body = " ";
        String leftArm = " "; //When activated it needs to be " /"
        String rightArm = " ";
        String leftLeg = "  "; //When activated it needs to be " /"
        String rightLeg = " ";
        if (wrongCount > 0){head = "0";}
        if (wrongCount > 1){ body = "|";}
        if (wrongCount > 2){leftArm = " /";}
        if (wrongCount > 3){rightArm = "\\";}
        if (wrongCount > 4){leftLeg = " /";}
        if (wrongCount > 5){rightLeg = "\\";}
        String lineOne = "  +---+"; //7,7,7
        String LineTwo = "  "+ head + "    |"; //8,8,8
        String LineThree = leftArm + body + rightArm + "   |"; //8,8,9
        String LineFour = leftLeg + " " + rightLeg + "   |"; //8,9,9
        String LineFive = "========";


        //Print out
        System.out.println("\r" + lineOne);
        System.out.println("\r" + LineTwo);
        System.out.println("\r" + LineThree);
        System.out.println("\r" + LineFour);
        System.out.println("\r" + LineFive);
        System.out.println("\r" + guessedLogicOutput);
        System.out.println("\r" + charList.toString());
    }

    public static void main(String[] args) throws IOException{
        String[] wordList = {"test", "abraham", "cactus", "life", "death", "daredevil", "joker", "rifle", "plane", "helicopter", "misspell", "java", "programming"};
        ArrayList<Character> charList = new ArrayList<Character>();
        String correctWord = WordGuess(wordList);
        System.out.println(correctWord);
        System.out.println("Hangman the game:");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String userInputString;
        char userInputChar = ' ';
        int wrongCount;
        String wrongCountStr;
        String guessedOutput;
        while (true){
            System.out.println("Guess a letter:");
            userInputString = scanner.readLine();
            try{
                userInputChar = userInputString.charAt(0);
            }
            catch (Exception e){
                System.out.println("You have inputted an invalid character. Please try again.");
                continue;
            }
            charList.add(userInputChar);
            String[] guessed = GuessedLogic(charList, correctWord);
            wrongCountStr = guessed[0];
            guessedOutput = guessed[1];
            wrongCount = Integer.parseInt(wrongCountStr);
            System.out.println(wrongCount);
            displayManAndWord(wrongCount, correctWord, guessedOutput, charList);
            for (int i = 0; i < guessedOutput.length(); i++){
                if (guessedOutput.indexOf('_')==-1){
                    System.out.println("You have guessed correctly. Goodbye.");
                    System.exit(0);
                }
            }
            if (wrongCount==6){
                System.out.println("You have guessed incorrectly. Goodbye.");
                System.exit(0);
            }
        }
    }
}
