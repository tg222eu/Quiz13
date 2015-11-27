/**
 * Created by Totte on 2015-11-26.
 */
public class Game {

    public int score;
    public int questionCounter;
    public View view;
    public String answerGuess;
    public boolean systemRunning = true;

    public Game(View v){
            score = 0;
            questionCounter = 0;
            view = v;
        }

    public void askInputThenGetAlternativesAndCalculateScore(){
        try{
            while(systemRunning){
                view.printWelcome();
                System.out.println("Vem sa det? '1', '2', '3', 'q'(quit)");
                int input = System.in.read();

                if (input == '1') {
                    answerGuess = view.getAlternative(0, questionCounter);
                } else if (input == '2') {
                    answerGuess = view.getAlternative(1, questionCounter);
                } else if (input == '3') {
                    answerGuess = view.getAlternative(2, questionCounter);
                }else if(input == 'q'){
                    systemRunning = false;
                }else{
                    System.out.println("Wrong input. Try again");
                    questionCounter--;
                }
                if (answerGuess == view.getQuestions().getQuoteObject(questionCounter).getPersonWhoQuoted()) {
                    score++;
                }

                if(allQuestionsAnswered()){
                    questionCounter++;
                }else{
                    systemRunning = false;
                }
            }
        }catch(Exception e){
            System.out.println("Somthing when apeshit with input");
        }
    }
    public boolean allQuestionsAnswered(){
        return view.getQuestions().quoteList.size() < questionCounter;
    }
}
