public class Card {
    public Card(){
        rank = 3;
        suit = 'R';
    }
    int rank;
    char suit;
    char getSuit(){
        return suit;
    }
    int getRank(){
        return rank;
    }
}
