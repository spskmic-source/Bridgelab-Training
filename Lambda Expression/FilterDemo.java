import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class FilterDemo {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("High BP detected", "CRITICAL"),
                new Alert("Medicine reminder", "NORMAL"),
                new Alert("Heart rate abnormal", "CRITICAL")
        );


        Predicate<Alert> isCritical = a -> a.type.equals("CRITICAL");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(isCritical)
              .forEach(System.out::println);
    }
}