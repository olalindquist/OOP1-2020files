/*
[ 2 3 4 5 6 3 3 3 3 5 6 ]

--  3 3 3 3 4 --


counter ***


 */


import java.util.Arrays;

public class P613 {

public static void printLongestRun(int[] arr) {
    int position = -1;  //Håller ordning på var i Arrayen den längsta repeterade serien finns (hamnar på näst sita värdet)
    int longest = 0;   //Håller koll på hur många värden serien består av av.
    int counter = 0;  //En temporar räknare för att hålla koll måste kompenseras uppåt med 1!

    for (int i = 0; i < arr.length - 1; i++) {
        //Tar ut värdena parvis och jämför dessa
        int v1 = arr[i];
        int v2 = arr[i + 1];

        //Varje gång vi hittar ett matchande tal
        if (v1 == v2) {
            counter += 1; // Öka räknaren så vi vet hur många tal det blir.

            // OM vi har en längre serie än rekorded hittills.
            //så sparar vi det nya rekordet i largest.
            //Och updaterar positionen med i - counter (för att hana på första värdet)
            if ((counter + 1) > longest) {
                longest = counter + 1;
                position = i - counter;
                System.out.println("counter +1:" + counter + " position: " + position);
            }

        } else { //Har vi inget rekord så nollställer vi bara räknaren och kör vidare.
            counter = 0;
        }
    }
        //Utskrift
        for (int i = 0; i < arr.length; i++) {
            if (i == position + 1) {
                System.out.print("(");
            }
            if (i == position + longest + 1) {
                System.out.print(")");

            }
            System.out.print(arr[i] + " ");
        }

    }

    //Lägger till slumpal mellan 1 och 6 i alla arrayens positioner.
    public static void addRandoms(int[] arr) {

        for (int i=0;i<arr.length;i++){
            int random = (int)(Math.random()*6)+1;
            arr[i] = random;

        }
    }

    public static void main(String args[]){

            int [] randoms = new int[20];
            addRandoms(randoms);
            System.out.println(Arrays.toString(randoms));
            printLongestRun(randoms);



    }
}
