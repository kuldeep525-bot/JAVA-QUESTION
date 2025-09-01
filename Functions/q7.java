// 7. Write a Java method to check whether a string is a valid password.

 class ValidPassword {
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String digits = "0123456789";
    String special = "!@#$%^&*()_+-=[]{}|;':\",.<>?/";
    String ALL_CHARS = lower + upper + digits + special;

    void checkPassword(String password) {
        int length = password.length();

        if (length < 12) {
            System.out.println("Password must be at least 12 characters long.");
            return;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if (lower.indexOf(c) != -1) {
                hasLower = true;
            }
             else if (upper.indexOf(c) != -1) {
                hasUpper = true;
            }
             else if (digits.indexOf(c) != -1) {
                hasDigit = true;
            }
             else if (special.indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        if (hasLower && hasUpper && hasDigit && hasSpecial) {
            System.out.println("Password is valid and secure.");
        } 
        else {
            System.out.println("Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character.");
        }
    }
}

 class main {
    public static void main(String st[]) {
        ValidPassword valid = new ValidPassword();
        valid.checkPassword("kuldeepkumar");//not secure
        valid.checkPassword("A1!bC2@deF3#");//secure
    }
}