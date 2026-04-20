import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating;
    }
}

public class SortDemo {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000, 4.5));
        products.add(new Product("Mobile", 20000, 4.8));
        products.add(new Product("Tablet", 30000, 4.2));


        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);


        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));

        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);
    }
}