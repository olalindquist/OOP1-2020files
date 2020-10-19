
//Subklassen MultipleChoiceCard bygger ut Card och kommer därför att ärva
//Samtliga instansvariabler och metoder från superklassen.
//
public class OneWordCard extends Card{

    public OneWordCard(String question,String answer){
        super(question, answer);

    }
    //Eftersom det i Card finns en abstrakt showExtra() så måste
    //den vara med för att koden ska kompilera!
    @Override
    public void showExtra() {
        System.out.println("Vänligen ange ett ord: ");
    }

}
