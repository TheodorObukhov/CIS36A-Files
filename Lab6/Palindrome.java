public class Palindrome {
    public static void main(String[] args){
        String str = "racecar";
        System.out.println("String: " + str);
        Boolean a = true;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                a = false;
                System.out.println("Is not a palindrome");
            }
            left++;
            right--;
        }
        if (a==true){System.out.println("Is a palindrome");}
    }
}
// "Inspiration" has been taken from this link
// https://www.educative.io/answers/how-to-check-if-a-string-is-a-palindrome-in-java
