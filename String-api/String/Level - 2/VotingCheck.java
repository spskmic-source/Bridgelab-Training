public class VotingCheck {

    static int[] generateAges(int n) {
        int[] age = new int[n];
        for (int i = 0; i < n; i++)
            age[i] = (int)(Math.random() * 90) + 10;
        return age;
    }

    static String[][] checkVote(int[] age) {
        String[][] res = new String[age.length][2];
        for (int i = 0; i < age.length; i++) {
            res[i][0] = String.valueOf(age[i]);
            res[i][1] = age[i] >= 18 ? "true" : "false";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] res = checkVote(ages);

        System.out.println("Age\tCan Vote");
        for (String[] r : res)
            System.out.println(r[0] + "\t" + r[1]);
    }
}
