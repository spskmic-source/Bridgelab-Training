public class DayOfWeek {
    public static void main(String[] args) {
        // Checking if three arguments are provided
        if (args.length < 3) {
            System.out.println("Please provide month, day, and year as arguments.");
            return;
        }

        // Parsing command-line arguments: m (month), d (day), y (year)
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Formulas provided in the image (using integer division)
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the result (0 for Sunday, 1 for Monday, etc.)
        System.out.println(d0);
    }
}