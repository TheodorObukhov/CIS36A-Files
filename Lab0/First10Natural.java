public class First10Natural {
    public static void main(String[] args) {
        int accumulator=0;
        int sum =0;
        while(accumulator <= 10)
        {
            accumulator = (accumulator+1);
            sum = (accumulator + sum);
            System.out.println(sum);
        }
    }
}
