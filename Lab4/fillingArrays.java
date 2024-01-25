import java.util.Arrays;

public class fillingArrays {
    public static void main(String[] args){
        //Array A
        int arrayA[] = new int[]{};
        for (int i = 1; i < 31; i++){
            int current = i;
            if ((i%2)==(0)){
                current = -current;
            }
            arrayA = Arrays.copyOf(arrayA, arrayA.length+1);
            arrayA[arrayA.length-1] = current;
        }
        for (int number1: arrayA){
            System.out.println(number1);
        }

        //Array B
        int arrayB[] = new int[] {};
        for (int i = 1; i < 16; i++) {
            arrayB = Arrays.copyOf(arrayB, arrayB.length + 1);
            arrayB[arrayB.length - 1] = i;
            arrayB = Arrays.copyOf(arrayB, arrayB.length + 1);
            arrayB[arrayB.length - 1] = i;
        }
        for (int number2 : arrayB) {
            System.out.println(number2);
        }

        // Array C
        int currentC = 1;
        int arrayC[] = new int[] {};
        for (int i = 1; i < 31; i++) {
            arrayC = Arrays.copyOf(arrayC, arrayC.length + 1);
            arrayC[arrayC.length - 1] = (currentC);
            currentC = currentC*2;
        }
        for (int number3 : arrayC) {
           System.out.println(number3);
        }

        // Array D
        int arrayD[] = new int[30];
        arrayD[0] = 1;
        arrayD[1] = 2;
        for (int i = 0; i < 28; i++) {
            int first = arrayD[i];
            int second = arrayD[i+1];
            arrayD[i+2] = (first+second);
        }
        for (int number4 : arrayD) {
            System.out.println(number4);
        }
    }
}
