import java.util.function.Predicate;

public class TemperatureMain {

    public static void main(String[] args) {

        double temperature = 45.0; // current temp
        double threshold = 40.0;   // limit

        // Predicate: check if temperature exceeds threshold
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        if (isHighTemp.test(temperature)) {
            System.out.println("Alert! Temperature is too high");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}