public class OneByTwo {
    public static void main(String[] args) {
        int currentNum = 1; 
        int counter = 1;
        while (currentNum>1){
            currentNum = currentNum/2;
            counter++;
        }
        System.out.println(counter);
    }
}