public class Card {

    private String suit;
    private String rank;
    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.rank = cardRank;
        this.suit = cardSuit;
        this.pointValue = cardPointValue;
    }

    public String suit() {
        return suit;
    }

    public String rank() {
        return rank;
    }

    public int pointValue() {
        return pointValue;
    }

    public boolean matches(Card otherCard) {
        return this.rank.equals(otherCard.rank) && this.suit.equals(otherCard.suit) && this.pointValue == otherCard.pointValue;
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
