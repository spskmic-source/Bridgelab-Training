import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency and return 2D array
    static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        // Step 1 & 2: Count frequency using ASCII
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 3: Count unique characters
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }

        // Step 4: Store characters and frequencies
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] output = findFrequency(text);

        System.out.println("Character  Frequency");
        System.out.println("--------------------");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "          " + output[i][1]);
        }
    }
}
