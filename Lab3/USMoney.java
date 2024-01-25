public class USMoney {
    int dollars;
    int cents;
    public USMoney(){
        dollars = 4;
        cents = 25;
        if ((cents>99)){
            int transferAmount = (cents-99);
            cents = cents-transferAmount;
            dollars++;
        }
    }
}
