import java.util.Scanner;

public class WordLength2D {

    static int length(String s) {
        int i = 0;
        try { while (true) { s.charAt(i); i++; } }
        catch (Exception e) { return i; }
    }

    static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < length(text); i++)
            if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        int start = 0, k = 0;

        for (int i = 0; i <= length(text); i++) {
            if (i == length(text) || text.charAt(i) == ' ') {
                words[k++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(length(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = wordLengthTable(splitWords(text));

        System.out.println("Word\tLength");
        for (String[] row : data)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
