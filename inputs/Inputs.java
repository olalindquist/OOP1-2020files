import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {

/* Bestäm ett skräpsvar och returnera det. I main (eller var frågan ställs) Kan man sedan köra
 while (answer == -1) etc.
 */
    private static Scanner in =  new Scanner(System.in);


    public static int getInteger1(){
        if (in.hasNextInt()){
            return in.nextInt();
        }
        return -1;
    }
    //Vänta i en while till rätt input är given.
    public static int getInteger2(){
        while (!in.hasNextInt()){
            System.out.println("Not an integer!");
            in.next();
        }
        return in.nextInt();

    }

    //Notera att Scanner kastar ett Inputmissmatchexception vi felaktig input och utnyttja det.

    public static int getInteger3(){

        int returnValue = 0;
        boolean valid = false;
        in.next();
        try {
             returnValue = in.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Try again! ");
            return getInteger3();
        }

            return returnValue;

    }

    //Sätt en flagga isValid och loopa till vi får den input vi vill ha. Sätt då isValid true och
    // returnera värdet.
    public static int getInteger4() {
        int validated = 0;
        boolean isValid;
        do {
            if (!in.hasNextInt()) {
                System.out.println("Not an integer ");
                isValid = false;
                in.next();
            } else {
                isValid = true;
                validated = in.nextInt();
            }
        } while (!isValid);

        return validated;
    }

    /* Gör inputen som en sträng och kontrollera om strängen har önskat format (En utmärk metod
    om vi tillexempel vill kolla upp om ens sträng har formen av ett bilnummer etc.
     */

    public static int getInteger5(){
        int returnValue = 0;
        boolean valid = false;
        //Fråga på tills vi fått ett giltigt svar!
        do {
        String input = in.next();
        //Börjar med att kolla längden (under förutsättning att vi söker ett ensiffrigt tal).
        if (input.length()> 1) {
            System.out.println("Input ska vara EN siffra");
        }
        /*
            Kolla sedan om det är ett tal med Character.isDigit().
            Och om så är fallet lagrar vi siffervärdet i returnValue och sätter valid till true.
         */

        else if(Character.isDigit(input.charAt(0))){
                 returnValue = Integer.valueOf(input);
                valid = true;
            }
        else {
            System.out.println("Input ska vara en SIFFRA!");
        }

        } while (!valid);
        return returnValue;



    }









}
