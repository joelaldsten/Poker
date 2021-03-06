import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestDeck {
    Deck deck;
    @BeforeEach
    public void setup(){
        deck = new Deck();
    }
    @Test
    public void testDraw() {

        ArrayList<Card> twoCards = deck.draw(2);
        assertEquals(2, twoCards.size());
    }

    // check output manually
    @Test
    public void testToString(){
        System.out.println(deck);
    }


}
