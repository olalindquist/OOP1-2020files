import java.util.Arrays;

public class ArrayCopy {

    public static void main (String[] args){

                int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int[] copy = Arrays.copyOf(myArray, myArray.length);

        System.out.println(Arrays.toString(myArray));
                System.out.println(Arrays.toString(copy));

                copy[0] = 1000;
                myArray[1] = 2000;

                System.out.println(Arrays.toString(myArray));
                System.out.println(Arrays.toString(copy));



    }
}
