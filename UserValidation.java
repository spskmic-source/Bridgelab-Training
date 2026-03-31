public class UserValidation {

    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);

            if (age >= 18) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidAge("20"));   // true
        System.out.println(isValidAge("15"));   // false
        System.out.println(isValidAge("abc"));  // false
    }
}