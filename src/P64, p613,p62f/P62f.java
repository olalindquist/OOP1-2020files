import java.util.Arrays;

public class P62f {

    public static void evenSort(int[] arr) {

        int[] array2 = new int[arr.length]; //En temporär Array av samma längd som den vi vill manipulera
        int arr2pos =0;                     // En håller koll på VAR i var array2 nästa nummer ska skrivas

        //Första loopen hittar alla jämna tal och placerar dem i array2.
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val%2 == 0){
                array2[arr2pos] = val;
                arr2pos +=1;
            }
        }
        //Andra loopen hittar alla udda tal och placerar dem i array2.
        // Observera att vi arr2pos INTE nollställs!
        for (int i = 0; i<arr.length;i++){
            int val = arr[i];
            if (val%2 != 0){
                array2[arr2pos] = val;
                arr2pos +=1;

            }
        }
        // När metoden är slut kommer array2 att förloras ur minnet.
        // Alltså måste vi först kopiera över array2 till arr.

        for (int i=0; i<array2.length;i++){
            arr[i] =array2[i];
        }
        System.out.println("Array 2: " + Arrays.toString(array2));
    }


    public static void main(String args[]){

        int[] array1 ={1,2,3,4,5,6,7,8,9};
        evenSort(array1);
        System.out.println("Array 1 : " +Arrays.toString(array1));

        }

    }

