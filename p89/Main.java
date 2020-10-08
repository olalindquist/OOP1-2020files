public class Main {


    public static void main(String args[]){

        ComboLock cl = new ComboLock(1,2,3);
        cl.reset();
        cl.turnRight(1);
        cl.reset();
        cl.turnLeft(37);
        cl.reset();
        cl.turnRight(3);


        System.out.println("Unlocked? " +cl.open());
    }

}
