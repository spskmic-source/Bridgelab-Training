import java.util.Scanner;

public class Calendar {

    static boolean isLeap(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    static int getFirstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeap(year)) days[1] = 29;

        int firstDay = getFirstDay(month, year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        for (int d = 1; d <= days[month - 1]; d++) {
            System.out.printf("%3d ", d);
            if ((d + firstDay) % 7 == 0)
                System.out.println();
        }
    }
}
