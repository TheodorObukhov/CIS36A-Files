import java.util.Arrays;

public class addArrays{
    int[] addAtEnd(int[] data,int x){
        int array[] = new int[]{};    
        array = Arrays.copyOf(array, array.length + 1); // create new array from old array and allocate one more element
        array[array.length - 1] = x;
        return array;
    }
}