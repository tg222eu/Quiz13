import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Totte on 2015-11-26.
 */
public class Game {

    public int score;
    public int questionCounter;
    public View view;
    public String answerGuess;
    public boolean systemRunning = true;
    public int input;

    public Game(View v){
            score = 0;
            questionCounter = 0;
            view = v;
        }

    public void askInputThenGetAlternativesAndCalculateScore(){
        Scanner s = new Scanner(System.in);
            while(systemRunning) {
                view.printWelcome();
                System.out.println("Fråga " + (questionCounter+1));
                System.out.println(view.getQuestionString(questionCounter));
                try {
                    input = s.nextInt();

                    System.out.println("This is: " + input);
                    //s.close();

                    if (input == 1 || input == 2 || input == 3 || input == 4) {
                        if (input == 1) {
                            answerGuess = view.getAlternative(0, questionCounter);
                        } else if (input == 2) {
                            answerGuess = view.getAlternative(1, questionCounter);
                        } else if (input == 3) {
                            answerGuess = view.getAlternative(2, questionCounter);
                        } else if (input == 4) {
                            loopLineBreakPrints();
                            scorePrint();
                            systemRunning = false;
                        }
                    } else {
                        System.out.println("Wrong input. Try again");
                        if(questionCounter>0) {
                            questionCounter--;
                        }
                    }
                    if (answerGuess == view.getQuestions().getQuoteObject(questionCounter).getPersonWhoQuoted()) {
                        score++;
                    }
                    questionCounter++;
                    if (allQuestionsAnswered()) {
                    } else {
                        loopLineBreakPrints();
                        scorePrint();
                        systemRunning = false;
                    }
                    if (systemRunning) {
                        loopLineBreakPrints();
                    }
                }catch(InputMismatchException e){
            System.out.println("Invalid input: Try again");
        }
            }
        s.close();
    }
    public boolean allQuestionsAnswered(){
        return view.getQuestions().quoteList.size() > questionCounter;
    }

    public void scorePrint(){
        System.out.println("You got: " + score + " points");
    }

    public void loopLineBreakPrints(){
        for(int i=0; i<16; i++){
            System.out.println("");
        }
    }
}
