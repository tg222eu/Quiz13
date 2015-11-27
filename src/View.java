
public class View {

    public boolean welcome = true;
    public Questions questions;

    public View(Questions q){
        questions = q;
    }

    public boolean printWelcome(){
        if(welcome){
            System.out.println("Welcome to quiz");
            welcome = false;
            return true;
        }
        return welcome;
    }

    public String getQuestionString(int i){
        return questions.getQuoteObject(i).getQuote() + "\n1. " + questions.getQuoteObject(i).getPerson(0) + "\n2. " +
                questions.getQuoteObject(i).getPerson(1) + "\n3. " + questions.getQuoteObject(i).getPerson(2) +
                "\nVälj alternativen '1', '2', '3'";
    }
    public String getAlternative(int i, int q){
        return questions.getQuoteObject(q).getPerson(i);
    }
    public Questions getQuestions(){
        return questions;
    }
}
