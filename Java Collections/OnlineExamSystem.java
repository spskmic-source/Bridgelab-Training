import java.util.*;

// Question Class
class Question {
    int id;
    String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Q" + id + ": " + text;
    }
}

// Student Class
class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return studentId + " - " + name;
    }
}

// Main System
public class OnlineExamSystem {
    public static void main(String[] args) {

        // 1. List for questions
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question(1, "What is Java?"));
        questionList.add(new Question(2, "Explain OOP concepts"));
        questionList.add(new Question(3, "What is inheritance?"));

        // Randomize questions
        Collections.shuffle(questionList);

        System.out.println("Exam Questions:");
        for (Question q : questionList) {
            System.out.println(q);
        }

        // 2. Set for unique student IDs
        Set<String> studentIds = new HashSet<>();

        studentIds.add("S101");
        studentIds.add("S102");
        studentIds.add("S101"); // Duplicate

        System.out.println("\nRegistered Student IDs:");
        for (String id : studentIds) {
            System.out.println(id);
        }

        // 3. Queue for students
        Queue<Student> studentQueue = new LinkedList<>();
        studentQueue.add(new Student("S101", "Rahul"));
        studentQueue.add(new Student("S102", "Priya"));

        System.out.println("\nServing Students:");

        while (!studentQueue.isEmpty()) {
            Student current = studentQueue.poll();
            System.out.println("Now Examining: " + current);

            // 4. Stack for navigation
            Stack<Question> history = new Stack<>();

            for (Question q : questionList) {
                System.out.println("Displaying: " + q);
                history.push(q);
            }

            // Simulate "back" functionality
            System.out.println("Going Back:");
            while (!history.isEmpty()) {
                System.out.println("Previous: " + history.pop());
            }
        }
    }
}