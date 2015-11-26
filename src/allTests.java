import static org.junit.Assert.assertEquals;
import org.mockito.Mockito.*;
import org.junit.Test;

public class allTests {

    //************************QUOTE TESTS***************************

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

    //*************************QUESTIONS TEST*****************************
    @Test
    public void storeQuotesInQuestionList(){
        Questions q = new Questions();
        Questions().addQuote(new Quote("Quote", "Knatte", "Fnatte", "Tjatte"));
        Questions().addQuote(new Quote("Quote2", "Knatte2", "Fnatte2", "Tjatte2"));
        Questions().addQuote(new Quote("Quote3", "Knatte3", "Fnatte3", "Tjatte3"));
        assertEquals(Questions.getQuoteObject(0).getPerson(0), "Knatte");
        assertEquals(Questions.getQuoteObject(1).getPerson(1), "Fnatte2");
        assertEquals(Questions.getQuoteObject(2).getPerson(2), "Tjatte3");
        assertEquals(Questions.getQuoteObject(0).getQuote(), "Quote");
        assertEquals(Questions.getQuoteObject(1).getQuote(), "Quote2");
        assertEquals(Questions.getQuoteObject(2).getQuote(), "Quote3");
    }
}
