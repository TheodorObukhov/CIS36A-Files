public class averages{
    public static void main(String[] args){
        double[] array = new double[]{10,11,12,13,14,15,16,17,18,19,20};
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + ((int)array[i]);
        }
        double average = sum / (double)array.length;
        System.out.println(average);
    };
}