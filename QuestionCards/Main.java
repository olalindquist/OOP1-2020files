import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static String getAnswer(){
        Scanner in = new Scanner(System.in);
        String ans = in.next();
        return ans;
    }

    public static void main(String args[]){
        ArrayList<Card> deck = new ArrayList<Card>();
        // Vi kan inte instansiera ett Card eftersom det är en abstract!
        //Card myCard = new Card("vad väger ett kilo?", "1 kilo");

        ArrayList<String> alt = new ArrayList<String>();
        alt.add("a) 1 kg");
        alt.add("b) 2kg");
        alt.add("c) 3 kg");

       MultipleChoiceCard mcc = new MultipleChoiceCard("Vad väger ett kilo?", "a", alt);
       Card mcc2 = new MultipleChoiceCard("fråga2","svar2", alt);
        mcc.ask();
        NumberQuestionCard nqc = new NumberQuestionCard("vad är 1+1?","2");
        nqc.ask();
        System.out.println(nqc.checkAnswer("2"));

        OneWordCard owc = new OneWordCard("Hur stavas hej?","hej");
        deck.add(mcc);
        deck.add(mcc2);
        deck.add(nqc);
        deck.add(owc);
        System.out.println(deck);
        boolean gameIsOn = true;

        //Ett exempel på en gameloop som:
        //1. slumpar en fråga
        //2. skör instansmetoden ask på frågan
        //3. kollar om svaret är rätt
        //4. Börjar om
        //


        while (gameIsOn){
            int rand = (int)(Math.random()*(deck.size()-1));
            Card active = deck.get(rand);
            active.ask();
            String answer = getAnswer();
            if (active.checkAnswer(answer)){
                System.out.println("Rätt!");
            } else {
                System.out.println("Fel!");
            }


        }


    }
}
