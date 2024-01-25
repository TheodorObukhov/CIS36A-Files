public class SwapperDemo {
    public static void main(String[] args){
        Swapper Swap1 = new Swapper();
        System.out.println(Swap1.getX());
        System.out.println(Swap1.getY());
        Swap1.swap();
        System.out.println(Swap1.getX());
        System.out.println(Swap1.getY());
    }
}
