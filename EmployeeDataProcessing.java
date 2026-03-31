import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {
    public static void main(String[] args) {

        int[] ages = {25, 30, 19, 42, 28};

        // create ArrayList
        ArrayList<Integer> ageList = new ArrayList<>();

        // convert int[] to ArrayList<Integer>
        for (int i = 0; i < ages.length; i++) {
            ageList.add(ages[i]); // auto-boxing happens here
        }

        // find youngest and oldest
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest age = " + youngest);
        System.out.println("Oldest age = " + oldest);
    }
}