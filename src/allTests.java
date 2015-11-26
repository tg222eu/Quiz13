import static org.junit.Assert.assertEquals;
import org.mockito.Mockito.*;
import org.junit.Test;

public class allTests {

    @Test
    public void shouldStoreStringInQuote(){
        Quote q = new Quote("Quote insert here", "Person who told the quote", "another person", "another person2");
        assertEquals(q.getQuote(), "Quote insert here");
    }

}
