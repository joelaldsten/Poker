import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestPlayer {
    Player player1, player2;
    Deck deck;
    Hand hand;
    @BeforeEach
    public void setup(){
        player1 = new Player("A Asson", 2000);
        player2 = new Player("B Bsson", 2000);
        deck = new Deck();
        hand = new Hand();
    }

    @Test
    public void simplehandTest(){
        ArrayList<Card> cards = new ArrayList<Card>();
        Card S10 = new Card("S", 10);
        Card H7 = new Card("H", 7);

        cards.add(S10);
        cards.add(H7);
        hand.addCard(S10);
        hand.addCard(H7);
        player1.setHand(cards);
        Assert.assertEquals(player1.getHand().getCards(), cards);
    }

    @Test
    public void testBetting(){
        Assert.assertEquals(2000, player1.getBalance());
        player1.bet(500);
        Assert.assertEquals(1500, player1.getBalance());
        player1.add(1500);
        Assert.assertEquals(3000, player1.getBalance());

    }
}
