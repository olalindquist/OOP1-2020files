import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    /**
     *  Prints The Menu
     */
    public static void printMenu(){

        System.out.println("Välkommen till Berras Bilar \n" +
        "Vill du:\n" +
                "1. Lägga till en bil\n"+
                "2.  Titta på en bil\n"+
                "3.  Ta bort en bil +\n" +
                "4.  Visa Lagret +\n" +
                "0 Avsluta");


        }

    /**
     * Asks for a Integer between two values
     * @param min  the smallest accepted integer
     * @param max the largest  accepted integer
     * @return  a integeger between max and min.
     */
    public static int getVal(int min, int max){
                Scanner in = new Scanner(System.in);
            boolean correct = false;
            int val = -1;

        if (!in.hasNextInt()){
                System.out.println("AngPe ett tal mellan " +min +" och " +max);
                return getVal(min,max);
                    }

            while (!correct) {
                val = in.nextInt();
                if (val >= min && val <= max) {
                    correct = true;
                } else {

                    return getVal(min, max);
                }
            }

        return val;
    }


    /**
     * waits for user to input a Stirng
     * @return the given Stringn
     */
    public static String getString(){
        Scanner in = new Scanner(System.in);

        return in.next();

    }

    /**
     * Asks for data, creates a Carobject and adds it to carList
     * @param carList A ArrayList of
     */
public static void addCar(ArrayList<Car> carList ) {
        String model;
        String color;
        int year;
        int price;
        String id;

        System.out.println("Vilket bilnummer? ");
        id = getString();
        System.out.println("Vilken modell");
        model = getString();
        System.out.println("Vilken färg");
        color = getString();
        System.out.println("Vilken årsmodell?");
        year = getVal(1970, 2020);
        System.out.println("Vilket pris?");
        price = getVal(1000, 500000);

        carList.add (new Car(model,color,year,price,id));

        }

    /**
     * Return a car with the given id from the list. Null if the car is not in list
     * @param id the id of a cor
     * @param carList a ArrayList of cars that includes the id-car!Nn
     * @return the car with the given id.
     */
        public static Car findCar(String id, ArrayList<Car> carList){
            for (Car c:carList){
                if (c.getId().equals(id)){
                    return c;
                }
            }
            return null;

        }

    /**
     * Checks wether at car i in carList or not
     * @param id The id of a car
     * @param carList A ArrayList of Car
     * @return a boolean  true if car in List
     */
        public static boolean isThereSuchACar(String id, ArrayList<Car> carList){

            for (Car c:carList){
                if (c.getId().equals(id)){
                    return true;
                }

            }
            return false;

        }


    /**
     * Asks for a car id and prints it if it is in list
     * @param carList A ArrayList of cars
     */
    public static void lookAtCar(ArrayList<Car> carList){
        System.out.println("Registreringsnummer? ");
        String id = getString();







        if ( isThereSuchACar(id, carList)) {
            findCar(id, carList).showCar();

        }
        else{
            System.out.println("Det finns ingen bil med registreringsnummer " +id);
        }
    }

    /**
     * Asks for a id and removes car if its in carList
     * @param carList a ArrayList of Car
     */
        public static void removeCar(ArrayList<Car> carList) {
            System.out.println("Registeringnummer? ");
            String id =getString();
            if (isThereSuchACar(id, carList)){
                carList.remove(findCar(id, carList));
            } else {
                System.out.println("Det finns ingen bild med registreringnummer "+id);

            }


        }

    /**
     * Print the id of all cars in Stock
     * @param carList a ArrayList of cars
     *
     */
        public static void showStock(ArrayList<Car> carList){
            for (Car c : carList){
                System.out.println(c.getId());
            }

        }
public static void main(String args[]){
        boolean gameIsOn =true;

        ArrayList<Car> carList = new ArrayList<Car>();


        while (gameIsOn) {
            printMenu();

            int chosen = getVal(0, 44);

            switch (chosen) {
                case 1:
                    addCar(carList);
                    break;
                case 2:
                    lookAtCar(carList);
                    break;

                case 3:
                    removeCar(carList);
                    break;
                case 4:
                    showStock(carList);
                    break;
                case 0:
                    gameIsOn = false;
                    break;
            }

        }
}


}


