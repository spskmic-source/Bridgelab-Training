import java.util.Scanner;

public class FrequencyNested {

    static String[] findFrequency(String text) {
        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1;
            if (arr[i] == '0') continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }

        int count = 0;
        for (char c : arr)
            if (c != '0') count++;

        String[] result = new String[count];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0') {
                result[k++] = arr[i] + " : " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] res = findFrequency(text);
        for (String s : res)
            System.out.println(s);
    }
}
