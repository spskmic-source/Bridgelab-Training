// Interface
interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

// Abstract Class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation (Getters)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract Method
    public abstract double calculateTotalPrice();

    // Concrete Method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Veg Item
class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    public void getDiscountDetails() {
        System.out.println("Veg Discount: 10%");
    }
}

// Non-Veg Item
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra charge
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    public void getDiscountDetails() {
        System.out.println("Non-Veg Discount: 5%");
    }
}

// Main Class
public class FoodMain {

    // Polymorphism Method
    public static void processOrder(FoodItem item) {
        item.getItemDetails();

        double total = item.calculateTotalPrice();
        double discount = 0;

        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            discount = d.applyDiscount();
            d.getDiscountDetails();
        }

        double finalPrice = total - discount;

        System.out.println("Total Price: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken", 300, 2);

        FoodItem[] items = {f1, f2};

        for (FoodItem item : items) {
            processOrder(item); // polymorphism
        }
    }
}