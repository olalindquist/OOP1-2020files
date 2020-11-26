import java.util.ArrayList;

/**
 * A very limited and weid version av
 */
public class Car {
    private static ArrayList<String> carList= new ArrayList <String>();
    private String registration;
    private String color;
    private int year;
    private int price;




    public Car(String registration, String color, int year, int price) {
        if (registration.length()>5){
            registration = registration.substring(0,6);
        }
        this.registration = registration;
        this.color = color;
        this.year = year;
        this.price = price;

        if (carList.contains(registration)) {
            throw new IllegalArgumentException("This car is already registered!  ");

        } else if (this.year<1930||this.year>2020){
            throw new IllegalArgumentException("No cars older than 1930 or from the future  ");
        }else if(this.price>1000000){
        throw new IllegalArgumentException( "Too expensive! ");
        }
            else{
            carList.add(registration);
        }
    }

    /**
     * @return the registration
     */
    public String getRegistration() {
        return registration;
    }



    /**
     * Lowers the price with the given disocunt in percent
     * @param percent
     */
    public void setDiscount(int percent){
        double f = (double)(percent);
        f = 1- f/100;
        this.price = (int)(price* f) ;

    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the year
     */
    public int getYear() {

        return year;
    }


    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Calculates the price adding VAT
     * @param vat The vat i percent
     * @return
     */
    public double getPriceAndVAT(int vat){
        double f = (double)(vat);
        f = f/100 +1;

        System.out.println(f);
        return (double)this.price*f;

    }



    /**
     * Change the price of a Car
     * @param newPrice The new price
     */
    public void changePrice(int newPrice) {
        this.price = newPrice;
    }


    /**
     * Change the color of a car.
     * @param newColor  the new color.
     */
    public void rePaint(String newColor){
        if (newColor.equals(this.color)) {
            System.out.println("The car is already " + newColor);
            this.color = "black";
            return;
        }
        this.color = newColor;
    }

    /**
     * Removes the cars registration
     */
    public void sellCar(){
     carList.remove(this.registration);
     System.out.println("ok. car with registration" +this.registration +"is removed");

    }

    /**
     * Prints the car!
     */
    public void showCar(){
        System.out.println("Registration: " + this.registration);
        System.out.println("Color: " +this.color);
        System.out.println("Year: " +this.year);
        System.out.println("Price " +this.price+1000);
    }

    /**
     * Prints a list of the registrated cars
     */
    public static void showRegister(){
        for (String s: carList){

            System.out.print( s +" : ");

        }
        System.out.println();

    }



}
