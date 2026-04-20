import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + year;
    }
}

public class MovieDemo {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("A", 4.5, 2023),
                new Movie("B", 4.8, 2024),
                new Movie("C", 4.2, 2022),
                new Movie("D", 4.9, 2024),
                new Movie("E", 4.1, 2021),
                new Movie("F", 4.7, 2023)
        );

        movies.stream()
              .sorted((m1, m2) -> {
                  if (m2.rating != m1.rating)
                      return Double.compare(m2.rating, m1.rating);
                  return m2.year - m1.year;
              })
              .limit(5)
              .forEach(System.out::println);
    }
}