import java.util.ArrayList;

public class Questions {

    public ArrayList<Quote> quoteList;

    public Questions(){
        quoteList = new ArrayList<Quote>();
    }

    public void addQuoteObject(Quote q){
        quoteList.add(q);
    }

    public Quote getQuoteObject(int i){
        return quoteList.get(i);
    }

}
