public class LinnearSearch {

    public static void main(String args[]){
        int[] values = {3,5,99,100,13,25,26,77,88,12,2,3,4,56,66,789,2344,54,100,123};
        int pos  = 0;
        int findValue = 56;
        boolean found = false;

        while (pos< values.length && !found){

            if( values[pos] == findValue){
                found = true;
            } else {

                pos ++;
            }

        }

        if (found){
            System.out.println("Found "+ findValue + " at values[" +pos+"]");
        } else {
            System.out.println(findValue +" is not in values");
        }

    }
}
