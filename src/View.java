
public class View {

    boolean welcome = true;

    public View(){

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
