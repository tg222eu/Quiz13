/**
 * Created by Totte on 2015-11-26.
 */
public class Game {

    public int score;
    public int questionCounter;
    public View view;
    public String answerGuess;

    public Game(View v){
            score = 0;
            questionCounter = 0;
            view = v;
        }

    public void askInputThenGetAlternativesAndCalculateScore(){
        try{
            int input = System.in.read();

            if(input == '1'){
                answerGuess = view.getAlternative(0, questionCounter);
            }else if(input == '2'){
                answerGuess = view.getAlternative(1, questionCounter);
            }else if(input == '3'){
                answerGuess = view.getAlternative(2, questionCounter);
            }

        }catch(Exception e){
            System.out.println("Somthing when apeshit with input");
        }

    }
}
