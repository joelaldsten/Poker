import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestHand {
    Hand hand;
    @BeforeEach
    public void setup(){
        hand = new Hand();
        hand.addCard(new Card("S",10));
        hand.addCard(new Card("H",10));
    }

    @Test
    public void simpleTest(){
        assertEquals("[S10, H10]", hand.toString());
    }

    @Test
    public void arrayTest(){
        ArrayList<Card> oldHand = hand.getCards();
        hand.addCard(new Card("C", 7));
        assertNotEquals(hand.getCards(), oldHand);
    }

    @Test
    public void clearHand(){
        ArrayList<Card> oldHand = hand.getCards();
        assertEquals(2, oldHand.size());
        hand.reset();
        assertEquals(0, hand.getCards().size());
    }
}
