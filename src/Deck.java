import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private List<Card> cards;
    private int size;

    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(ranks[i], suit, values[i]));
            }
        }
        size = cards.size();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if (isEmpty()) {
            return null;
        }
        size--;
        return cards.get(size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size = ").append(size).append("\nUndealt cards:\n");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(cards.get(i));
            if (i != 0) {
                sb.append(", ");
            }
            if ((size - i) % 2 == 0) {
                sb.append("\n");
            }
        }
        sb.append("\nDealt cards:\n");
        for (int i = cards.size() - 1; i >= size; i--) {
            sb.append(cards.get(i));
            if (i != size) {
                sb.append(", ");
            }
            if ((i - cards.size()) % 2 == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
