import java.util.*;

// Base class
class Fruit {
    public void show() {
        System.out.println("This is a fruit");
    }
}

// Subclass Apple
class Apple extends Fruit {
    public void show() {
        System.out.println("This is an Apple");
    }
}

// Subclass Mango
class Mango extends Fruit {
    public void show() {
        System.out.println("This is a Mango");
    }
}

// Generic class with bounded type
class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    // Add fruit
    public void add(T fruit) {
        fruits.add(fruit);
    }

    // Display fruits
    public void display() {
        for (T f : fruits) {
            f.show();
        }
    }
}

// Main class
public class FruitDemo {
    public static void main(String[] args) {

        FruitBox<Fruit> box = new FruitBox<>();

        box.add(new Apple());
        box.add(new Mango());

        System.out.println("Fruits in the box:");
        box.display();

        // ❌ This will give compile-time error
        // FruitBox<Car> carBox = new FruitBox<>();
    }
}