import static org.junit.Assert.assertEquals;
import org.mockito.Mockito.*;
import org.junit.Test;

public class allTests {

    @Test
    public void shouldStoreStringInQuote(){
        Quote q = new Quote("Quote insert here", "", "",
                 "");
        assertEquals(q.getQuote(), "Quote insert here");
    }

    @Test
    public void getAllPeopleFromQuote(){
        Quote q = new Quote("", "Person who told the quote", "A person who did not quote", "An another person who did not quote");
        assertEquals(q.getPerson(0), "Person who told the quote");
        assertEquals(q.getPerson(1), "A person who did not quote");
        assertEquals(q.getPerson(2), "An another person who did not quote");
    }

    @Test
    public void shouldGetThePersonWhoQuoted(){
        Quote q = new Quote("", "Person who told the quote", "A person who did not quote", "An another person who did not quote");
        assertEquals(q.getPersonWhoQuoted(), "Person who told the quote");
    }
}
