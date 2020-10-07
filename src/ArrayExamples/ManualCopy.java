import java.util.Arrays;

public class ManualCopy {

    public static void main(String args[]){

            int[] myArray = {1,2,3,4,5,6,7,8,9,10};
            int[] copy = new int[myArray.length];


        for (int i = 0; i<myArray.length;i++){
                copy[i] = myArray[i];

            }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(copy));
        myArray[0] = 1000;
        copy[1] = 2000;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(copy));

    }
}
