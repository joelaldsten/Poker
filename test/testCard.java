import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class testCard {

    @Test
    public void testACard(){
        Card s10 = new Card("S", 10);
        assertEquals("S", s10.getSuit());
        assertEquals(10, s10.getValue());
        assertEquals("S10", s10.toString());
    }
}
