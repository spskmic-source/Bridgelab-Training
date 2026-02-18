import java.util.Scanner;

public class ShortLongWord {

    static int len(String s) {
        int i = 0;
        try { while (true) { s.charAt(i); i++; } }
        catch (Exception e) { return i; }
    }

    static String[] split(String t) {
        int c = 1;
        for (int i = 0; i < len(t); i++)
            if (t.charAt(i) == ' ') c++;

        String[] w = new String[c];
        int s = 0, k = 0;

        for (int i = 0; i <= len(t); i++) {
            if (i == len(t) || t.charAt(i) == ' ') {
                w[k++] = t.substring(s, i);
                s = i + 1;
            }
        }
        return w;
    }

    static void findShortLong(String[] w) {
        String small = w[0], big = w[0];
        for (String x : w) {
            if (len(x) < len(small)) small = x;
            if (len(x) > len(big)) big = x;
        }
        System.out.println("Shortest: " + small);
        System.out.println("Longest: " + big);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findShortLong(split(sc.nextLine()));
    }
}
