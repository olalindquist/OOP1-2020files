//Exempel på en abstrakt klass

public abstract class Card {

    //Genom att använda protected istället för private så kommer alla
    //subklasser att kunna nå respektive instansvariabler direkt.
    // Det försämrar inkapslingen något med gör att vi slipper ha getters och setters bara för
    //subklasserna. (Ska vi däremot ändra dem utifrån måste vi ändå ha getters och setters.
    //Här finns inget rätt/fel utan det är smaksak om man vill använda protected eller inte.
 protected String question;
 protected String answer;
 protected boolean marked;

 //Trots att vi inte kommer att kunna göra någon instans av Card så har vi en konstruktor:

 public Card (String question,String answer){
     this.question = question;
      this.marked = false;
     this.answer = answer;
 }
//Metoderna i superklassen kommer att kunna nås från samtliga subklasser
 public void ask(){
     System.out.println(this.question);
     showExtra();

 }

public void mark(){
     this.marked = true;
}

//En abstrakt metod betyder att metoden MÅSTE finnas i alla subklasser.
public abstract void showExtra();

 public boolean checkAnswer(String answer){
     if (answer.equals(this.answer)){
         return true;
     }
     return false;
 }

 //För att kunna skriva ut ett kort behöver vi en toStringMetod
   @Override
 public String toString (){
     return this.question;


 }

}
