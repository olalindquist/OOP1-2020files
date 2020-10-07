public class P64 {

    public static int sumWithoutSmallest(int[] array){
        int sum = 0;
        int smallest = array[0];
        //Räkna igenom Arrayex och lägg ihop alla värden!
        //Håll samtidigt reda på det minsta värde som passeras.
        for (int i = 0; i<array.length;i++){
            int val = array[i];
            sum += val;

            if (val < smallest){
                smallest = val;

            }
        }

        return (sum-smallest); //Returnerar det totalsumman med de minsta värdet subtraherat.


    }

    public static void main(String args[]){
    int[] array = {5,4,4,2,1,2,3,4,5};
    int sum = sumWithoutSmallest (array);
        System.out.println("sumWithourSmallest: " +sum );
    }
}
