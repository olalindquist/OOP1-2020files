import java.util.Arrays;

public class RemovingElement {
    public static void main(String args[]){

        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,0,0,0,0,0,0};
        int currentSize = 15;
        int removeValueAt= 4;
        System.out.println(Arrays.toString(values));
        for (int i = 0; i<currentSize-1;i++) {
            if (i > removeValueAt) {
                values[i] = values[i + 1];

            }

        }
        currentSize -=currentSize;
        System.out.println(Arrays.toString(values));


    }

}
