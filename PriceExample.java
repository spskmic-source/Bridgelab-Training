import java.util.ArrayList;

public class PriceExample {
    public static void main(String[] args) {

        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            list.add(prices[i]);
        }

        double max = list.get(0);
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            double val = list.get(i);

            if (val > max) {
                max = val;
            }

            sum += val;
        }

        double avg = sum / list.size();

        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + avg);
    }
}