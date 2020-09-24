public class SumAndAverage {

    public static void main(String arg[]) {
        double[] values = {1.2, 7.3, 3.14, 42.0,};
        double total = 0;

        for (double value : values ){
            total += value;

        }
        double average = total / values.length;

        System.out.println("Medelvärdet: " + average + " och summan: " + total);
    }
}
