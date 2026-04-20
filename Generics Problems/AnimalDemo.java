import java.util.*;

// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalDemo {

    // Method using wildcard
    public static void printAnimals(List<? extends Animal> animals) {

        for (Animal a : animals) {
            a.sound();
        }
    }

    public static void main(String[] args) {

        // List of Dogs
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());

        // List of Cats
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        System.out.println("Dogs:");
        printAnimals(dogs);

        System.out.println("Cats:");
        printAnimals(cats);
    }
}