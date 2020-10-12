public class Main {

    public static void main (String args[]){

        Car car1 = new Car("Ford", "blå","abc123",100000,1978);
        Car car2 = new Car("Volvo", "röd","abc123",300000,1999);

        System.out.println("car1 color = " + car1.getColor());
        car1.repaint("blå");

        System.out.println("car1 color = " + car1.getColor());

        System.out.println("car2 " +car2);
        Car car3 = new Car("cde333");
        Car.printList();
    }
}
