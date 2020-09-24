public class ElementSeparators {

    public static void main (String args[]){
        String[] theBeatles= {"Paul","John","Ringo","George"};

        for (int i =0; i<theBeatles.length; i++){
            if (i>0) {
                System.out.print(" | ");
            }
            System.out.print(theBeatles[i]);
        }


    }

}
