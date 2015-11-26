
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

}
