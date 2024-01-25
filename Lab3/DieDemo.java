public class DieDemo {
    public static void main(String[] args){
        Die Die1 = new Die();
        Die Die2 = new Die();
        Die1.roll();
        System.out.println(Die1.getSideUp());
        Die2.roll();
        System.out.println(Die2.getSideUp());

    }
}
