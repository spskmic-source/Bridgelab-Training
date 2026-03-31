import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {

        int[] ages = {22, 35, 19, 40, 28};

        ArrayList<Integer> list = new ArrayList<>();

        // convert int[] to ArrayList<Integer>
        for (int i = 0; i < ages.length; i++) {
            list.add(ages[i]); // auto-boxing
        }

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Youngest age = " + youngest);
        System.out.println("Oldest age = " + oldest);
    }
}