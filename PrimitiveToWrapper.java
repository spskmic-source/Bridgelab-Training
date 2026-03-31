import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        Integer obj = Integer.valueOf(num);
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper value: " + obj);
    }
}