/**
 * Created by Totte on 2015-11-26.
 */
public class Game {

    public int score;
    public int questionCounter;

    public Game(View v){
            score = 0;
            questionCounter = 0;
        }

    public void askInputThenGetAlternativesAndCalculateScore(){
        try{
            int input = System.in.read();

            if(input == '1'){

            }else if(input == '2'){

            }else if(input == '3'){

            }

        }catch(Exception e){
            System.out.println("Somthing when apeshit with input");
        }

    }
}
