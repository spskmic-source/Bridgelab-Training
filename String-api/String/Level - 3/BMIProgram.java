import java.util.Scanner;

public class BMIProgram {

    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    static String[][] calculateBMI(double[][] hw) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = hw[i][0];
            double heightM = hw[i][1] / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            result[i][0] = hw[i][1] + "";
            result[i][1] = weight + "";
            result[i][2] = bmi + "";
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Height  Weight  BMI   Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                data[i][0] + "    " +
                data[i][1] + "    " +
                data[i][2] + "   " +
                data[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Weight: ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Height(cm): ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] res = calculateBMI(hw);
        display(res);
    }
}
