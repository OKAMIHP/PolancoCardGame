/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     * @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        Deck deck1 = new Deck(ranks, suits, values);
        Deck deck2 = new Deck(ranks, suits, values);
        Deck deck3 = new Deck(ranks, suits, values);

        System.out.println("Deck 1 before shuffle:");
        System.out.println(deck1);

        deck1.shuffle();
        System.out.println("Deck 1 after shuffle:");
        System.out.println(deck1);

        System.out.println("Deck 2 size: " + deck2.size());
        System.out.println("Deck 2 is empty: " + deck2.isEmpty());

        System.out.println("Dealing cards from deck 2:");
        while (!deck2.isEmpty()) {
            Card dealtCard = deck2.deal();
            System.out.println("Dealt card: " + dealtCard);
        }

        System.out.println("Deck 2 size after dealing: " + deck2.size());
        System.out.println("Deck 2 is empty after dealing: " + deck2.isEmpty());

        System.out.println("Deck 3 after shuffle:");
        deck3.shuffle();
        System.out.println(deck3);
    }
}