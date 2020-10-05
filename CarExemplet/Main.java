public class Main {

    public static void main(String args[]){
        /*
        För att skapa en ny instans av bilar använder vi new och åberopar vår konstruktor.

         */
        Car car1 = new Car("volvo","blå",1987,400000);
        Car car2 = new Car("ford", "röd",1955,20000);

        /*
        Här åberopar vi getColor() för respektive bil och får tillbaka det värde
        som vi har i respektive bils instansvariabel color.
         */
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());

        /*
         Att skapa en array av referenstypen Car är inget problem.
         ArrayLists skulle också fungera utmärkt.
         */

        Car[] cars = new Car[100];
        cars[0] = car1;
        cars[1] = car2;

        System.out.println("Färg från bilen i cars[0] = " +cars[0].getColor());


/*
Och här testar vi instansmetoden SameColor.

 */
        if (car1.sameColor(car2)){
            System.out.println("same color");

        } else{
            System.out.println("Not same color");
        }

    }
}
