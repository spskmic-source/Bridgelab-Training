import java.util.Scanner;

public class UniqueCharacters {

    static int findLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {}
        return len;
    }

    static char[] uniqueChars(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[k++] = c;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] res = uniqueChars(text);
        for (char c : res)
            System.out.print(c + " ");
    }
}
