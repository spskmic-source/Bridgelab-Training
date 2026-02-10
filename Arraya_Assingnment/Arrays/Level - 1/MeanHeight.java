import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Double array of size 11
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for heights
        System.out.println("Enter height of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }

        // c. Find sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        // d. Calculate mean
        double mean = sum / 11;

        // Display result
        System.out.println("Mean height of the football team = " + mean);

        sc.close();
    }
}
