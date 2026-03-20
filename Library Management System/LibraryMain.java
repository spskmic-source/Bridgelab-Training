// Interface
interface Reservable {
    void reserveItem(String userName);
    boolean checkAvailability();
}

// Abstract Class
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true; // encapsulated

    // Constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation (Getters)
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Abstract Method
    public abstract int getLoanDuration();

    // Concrete Method
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}

// Book Class
class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14; // 14 days
    }

    public void reserveItem(String userName) {
        if (isAvailable()) {
            setAvailability(false);
            System.out.println("Book reserved by " + userName);
        } else {
            System.out.println("Book not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Magazine Class
class Magazine extends LibraryItem implements Reservable {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7; // 7 days
    }

    public void reserveItem(String userName) {
        if (isAvailable()) {
            setAvailability(false);
            System.out.println("Magazine reserved by " + userName);
        } else {
            System.out.println("Magazine not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

// DVD Class
class DVD extends LibraryItem implements Reservable {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 3; // 3 days
    }

    public void reserveItem(String userName) {
        if (isAvailable()) {
            setAvailability(false);
            System.out.println("DVD reserved by " + userName);
        } else {
            System.out.println("DVD not available");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Main Class
public class LibraryMain {

    // Polymorphism Method
    public static void processItem(LibraryItem item) {
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        if (item instanceof Reservable) {
            Reservable r = (Reservable) item;

            if (r.checkAvailability()) {
                r.reserveItem("User1");
            } else {
                System.out.println("Already reserved");
            }
        }

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        LibraryItem i1 = new Book(1, "Java Basics", "Author A");
        LibraryItem i2 = new Magazine(2, "Tech Monthly", "Author B");
        LibraryItem i3 = new DVD(3, "Movie X", "Director C");

        LibraryItem[] items = {i1, i2, i3};

        for (LibraryItem item : items) {
            processItem(item); // polymorphism
        }
    }
}