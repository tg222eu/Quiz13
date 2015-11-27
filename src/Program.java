/**
 * Created by Totte on 2015-11-27.
 */
public class Program {

    public static void main(String[] args){

        Questions q = new Questions();
        q.fillQuotes();
        Game g = new Game(new View(q));
        g.askInputThenGetAlternativesAndCalculateScore();
    }

}
