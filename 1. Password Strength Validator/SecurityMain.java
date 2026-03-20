// Interface with static method
interface SecurityUtils {

    // Static method to check password strength
    static boolean isStrongPassword(String password) {

        // Conditions
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }
}

// Main Class
public class SecurityMain {

    public static void main(String[] args) {

        String password = "Abc12345";

        // Calling static method using interface name
        boolean result = SecurityUtils.isStrongPassword(password);

        if (result) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}