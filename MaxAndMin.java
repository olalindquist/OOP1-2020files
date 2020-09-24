public class MaxAndMin {

    public static void main (String args[]){
        double[] values = {3.14, 42.0, 99.5,9};
        double largest = values[0];
        double smallest = values[0];

        for (int i = 1; i< values.length;i++ ){
            double value = values[i];
            if (value > largest){
                largest = value;
            }

            if (smallest<smallest){
                smallest =value;
            }

        }

        System.out.println("Largest = " + largest +" Smallest = " +smallest);
    }

}
