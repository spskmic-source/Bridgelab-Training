import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class ClaimDemo {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Health", 7000),
                new Claim("Vehicle", 3000),
                new Claim("Vehicle", 4000)
        );

        Map<String, Double> avg = claims.stream()
                .collect(Collectors.groupingBy(
                        c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)
                ));

        System.out.println(avg);
    }
}