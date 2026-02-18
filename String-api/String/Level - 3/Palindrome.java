import java.util.Scanner;

public class Palindrome {

    static boolean logic1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean logic2(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return logic2(s, start + 1, end - 1);
    }

    static char[] reverse(String s) {
        char[] rev = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            rev[i] = s.charAt(s.length() - 1 - i);
        return rev;
    }

    static boolean logic3(String s) {
        char[] orig = s.toCharArray();
        char[] rev = reverse(s);

        for (int i = 0; i < orig.length; i++)
            if (orig[i] != rev[i]) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Logic 1: " + logic1(text));
        System.out.println("Logic 2: " + logic2(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + logic3(text));
    }
}
