import java.util.Arrays;

public class Filling {

    public static void main(String args[]){
        int[] values = new int[100];

        for (int i = 0; i<values.length;i++ ){
            values[i] = -1;
        }
        System.out.println(Arrays.toString(values));

    }
}
