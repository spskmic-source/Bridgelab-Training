// Class implementing Cloneable
class Student implements Cloneable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override clone()
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main Class
public class CloneMain {

    public static void main(String[] args) {

        try {
            Student s1 = new Student("Rahul", 20);

            // Clone object
            Student s2 = (Student) s1.clone();

            System.out.println("Original Object:");
            s1.display();

            System.out.println("Cloned Object:");
            s2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed");
        }
    }
}