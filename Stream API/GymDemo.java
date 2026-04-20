import java.util.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiry;

    public Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return name + " expires on " + expiry;
    }
}

public class GymDemo {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(10)),
                new Member("Ravi", LocalDate.now().plusDays(40)),
                new Member("Neha", LocalDate.now().plusDays(20))
        );

        LocalDate today = LocalDate.now();

        members.stream()
               .filter(m -> m.expiry.isBefore(today.plusDays(30)))
               .forEach(System.out::println);
    }
}