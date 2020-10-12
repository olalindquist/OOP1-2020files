import java.util.ArrayList;

public class Car {

    private static ArrayList<String> idList = new ArrayList<String>(); //Static alltså tillgänglig för ALLA carsobjekt.
    private String model;
    private String color;
    private String id;
    private int price;
    private int year;

    public Car(String model, String color, String id, int price, int year){
        this.model = model;
        this.color =  color;
        this.price = price;
        this.year = year;

        //Kollar varje ny id mot idList och lägger till en (*) om det redan finns!
        if (idList.contains(id)){
            System.out.println("Id finns i listan! Gör rätt!");
            this.id = (id +"(*)");
            idList.add(id);
        }else{
            this.id = id;
            idList.add(id);
        }

    }

    //Flera konstruktorer är möjligt!
    public Car (String id){
        this("not set", "no color", id, 0,0); //Åberopar en anna konstuktor för det här objektet.

    }


    public String getColor(){
        return this.color;
    }
public void repaint(String newColor){
        if (!sameColor(newColor)) {
            this.color = newColor;
        }
        else {

            System.out.println("Bilen är redan "+newColor+" IDIOT!");
        }
}

//Exempel på en private metod. Går ej att nå från utanför klassen/filen
private boolean sameColor(String newColor) {
if (newColor.equals(this.color)){
    return true;
} else{
    return false;
}
    }

    //För att kunna skriva ut något vettigt måste vi overrida metoden toString
    @Override
    public String toString (){
        String returnString = this.id + " "+ this.model + " " + this.color + " "+ this.year;
        return returnString;

    }
    //Exempel på en Static metod Behöver inte åberopas på ett objekt.
    public static void printList(){

        System.out.println(idList);
    }




}
