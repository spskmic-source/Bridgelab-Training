import java.util.Scanner;

public class SplitCompare {

    static int findLength(String s) {
        int i = 0;
        try {
            while (true) { s.charAt(i); i++; }
        } catch (Exception e) {
            return i;
        }
    }

    static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        int start = 0, index = 0;

        for (int i = 0; i <= findLength(text); i++) {
            if (i == findLength(text) || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] user = splitWords(text);
        String[] built = text.split(" ");

        System.out.println("Comparison Result: " + compareArrays(user, built));
    }
}
