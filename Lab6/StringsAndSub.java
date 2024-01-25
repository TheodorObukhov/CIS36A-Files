import java.util.*;;
public class StringsAndSub {

    public static void main(String[] args){
        // For loop iterates through the string
        // Adds all the characters into another string until it hits a comma
        // After hitting comma, adds that string as an element into array, wipes temp string and continues until end of string

        String baseString = "abc,def";
        String tempString = "";
        List<String> SubArray = new ArrayList<String>();
        char current;

        for (int i=0; i<baseString.length()+1; i++){
            if (i == baseString.length()){
                SubArray.add(tempString);
                break;
            }
            
            current = baseString.charAt(i);
            if (current == ','){
                SubArray.add(tempString);
                tempString = "";
            }
            else{
                tempString = tempString + current;
            }
        }
        System.out.println(SubArray);
    }
}
