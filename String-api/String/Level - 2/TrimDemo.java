import java.util.Scanner;

public class TrimDemo {

    static int[] trimIndex(String s) {
        int start = 0, end = s.length() - 1;

        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndex(text);
        String user = text.substring(idx[0], idx[1]);
        String built = text.trim();

        System.out.println("Comparison: " + compare(user, built));
    }
}
