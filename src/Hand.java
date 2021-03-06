import java.util.ArrayList;
import java.util.List;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<>();
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public ArrayList<Card> getCards(){
        return new ArrayList<>(List.copyOf(hand));
    }

    public void reset(){
        hand.clear();
    }

    @Override
    public String toString() {
        return hand.toString();
    }
}
