import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        populateDeck();
    }


    private void populateDeck(){
        for (String suit : new String[]{"S", "H", "C", "D"}) {
            for (int i = 2; i < 15; i++) {
                cards.add(new Card(suit, i));
            }
        }
        Collections.shuffle(cards);
    }

    public ArrayList<Card> draw(int i) {
        ArrayList<Card> drawn = new ArrayList<>(cards.subList(0, i));
        cards = new ArrayList<>(cards.subList(i, cards.size()));
        return drawn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Card card : cards) {
            sb.append(card).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
