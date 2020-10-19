import java.util.ArrayList;

//Subklassen MultipleChoiceCard bygger ut Card och kommer därför att ärva
//Samtliga instansvariabler och metoder från superklassen.
//
public class MultipleChoiceCard extends Card{
    //Vi behöver bara sätta de instansvariabler som är unika för MultipleChoiseCard.
    //Övriga ärvs direkt från superklassen. Eftersom de i Card är deklarerade som protected
    //kan man nå dem direkt!

    private ArrayList<String> alternatives;


    public MultipleChoiceCard(String question, String answer, ArrayList<String> alternatives){
        //Superanropetbetyder att jag vill köra superklassens konstruktor först.
        //på så sätt slipper jag sätta instansvariablerna i varje subklass.
        super(question, answer);
        this.alternatives = alternatives;

    }
    //Eftersom det i Card finns en abstrakt showExtra() så måste
    //den vara med för att koden ska kompilera!
    public void showExtra(){
        System.out.println(alternatives);

    }

}



