import java.util.ArrayList;

public class Car {
    /*
    Instansvariabler. Dvs (i någon mening) de variabler som definierar vårt objekt
    Notera att de är deklarerade som private för att det inte ska gå att ändra dem utifrån
    utan vårt tillstånd.
    */
private String model;
private String color;
private int year;
private int price;
private String id;
    private static ArrayList<String> idList= new ArrayList<String>();
/*
Konstruktorn är en funktion utan returtyp och samma namn som klassen.

 */
public Car(String model, String color, int year, int price, String id){
    if (this.idList.contains(id)){
        System.out.println("Warning! Allreade created car with this id!");
        id +="(Duplicate)";
    }
    this.model = model;
    this.color = color;
    this.year = year;
    this.price = price;
    this.id = id;
    this.idList.add(id);
}

public String getId(){

    return this.id;
}
/*
Vi kan ha hur många instansmetoder vi vill.
Normal har man ett antal "getters och setters" för att kunna editera valda
 instansvariabler för objektet
 */
public String getColor(){
    return color;
}
public void setColor(String newColor){

    this.color = newColor;
}
/*
Ett exempel på en metod som tar in ett annat Car-objekt och jämför färgen mellan den
Andra bilen och det objekt som metoden åberopas på.
Vi returnerar true om det är samma färg och false i annat fall.
 */
public boolean sameColor(Car car){
    String color1 = car.getColor();
    if (this.color.equals(color1)){
        return true;
    }
    return false;
}

    /**
     * Prints the car
     */
public void showCar(){
    System.out.println("Registreringsnummer : " +this.id);
    System.out.println("Model: " +this.model+", "+this.year);
    System.out.println("Color:" +this.color);
    System.out.println("Pris " + this.price);

}

}
