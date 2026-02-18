import java.util.Scanner;

public class StudentGradeCard {

    // a) Generate random 2-digit PCM scores
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // b) Calculate total, average, percentage
    static double[][] calculateResult(int[][] scores) {
        double[][] result = new double[scores.length][3]; 
        // total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // c) Calculate grade
    static String[] calculateGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];

            if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else if (p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    // d) Display scorecard
    static void display(int[][] scores, double[][] result, String[] grade) {
        System.out.println("ID  P   C   M   Total  Avg     %     Grade");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "   " +
                scores[i][0] + "  " +
                scores[i][1] + "  " +
                scores[i][2] + "   " +
                (int)result[i][0] + "    " +
                result[i][1] + "  " +
                result[i][2] + "  " +
                grade[i]
            );
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResult(scores);
        String[] grade = calculateGrade(result);

        display(scores, result, grade);
    }
}
