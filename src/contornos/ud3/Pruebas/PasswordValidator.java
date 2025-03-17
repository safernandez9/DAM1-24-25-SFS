package contornos.ud3.Pruebas;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password.length() <= 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = false;
            }
        }
        return hasUpperCase || hasDigit;
    }
}