import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;
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
        q.addQuoteObject(new Quote("Quote", "Knatte", "Fnatte", "Tjatte"));
        q.addQuoteObject(new Quote("Quote2", "Knatte2", "Fnatte2", "Tjatte2"));
        q.addQuoteObject(new Quote("Quote3", "Knatte3", "Fnatte3", "Tjatte3"));
        assertEquals(q.getQuoteObject(0).getPerson(0), "Knatte");
        assertEquals(q.getQuoteObject(1).getPerson(1), "Fnatte2");
        assertEquals(q.getQuoteObject(2).getPerson(2), "Tjatte3");
        assertEquals(q.getQuoteObject(0).getQuote(), "Quote");
        assertEquals(q.getQuoteObject(1).getQuote(), "Quote2");
        assertEquals(q.getQuoteObject(2).getQuote(), "Quote3");
    }
    //**********************VIEW TEST********************************
    @Test
    public void shouldPrintWelcomeScreen(){
        Questions que = new Questions();
        View v = new View(que);
        assertEquals(true, v.printWelcome());
        assertEquals(false, v.printWelcome());
    }

    @Test
    public void shouldGetQuestionAndPossibleAnswers(){
        Quote q = new Quote("Vem sa detta?", "176-617", "176-716", "176-167");
        Questions que = new Questions();
        que.addQuoteObject(q);
        View v = new View(que);
        assertEquals(v.getQuestionString(0), "Vem sa detta?\n1. 176-617\n2. 176-716\n3. 176-167\nVälj alternativen '1', '2', '3'");
    }
    //***********************GAME TEST***********************
    @Test
    public void shouldPrintMessageAndStoreAlternativeFromUserAndCalculateScore(){
        Game game = Mockito.mock(Game.class);
        Mockito.verify( game ).askInputThenGetAlternativesAndCalculateScore();
    }

}
