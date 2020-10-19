
//Subklassen MultipleChoiceCard bygger ut Card och kommer därför att ärva
//Samtliga instansvariabler och metoder från superklassen.
//

public class NumberQuestionCard extends Card{

    //Eftersom vi har inte har någon eller några extra instansvariabler
    //Så räcker det med att åberopa superklassens konstruktor.
    // NumberQuestionCard kommer då automatiskt ärva samtliga instansvariabler och metoder från Card

    public NumberQuestionCard(String question, String answer){
        super(question, answer);

    }
    //Eftersom det i Card finns en abstrakt showExtra() så måste
    //den vara med för att koden ska kompilera!
    @Override
    public void showExtra() {
        System.out.println("Vänligen ange en siffra");
    }
}
