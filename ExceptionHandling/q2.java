// 2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.


class OddException extends Exception {
    public OddException(String message) {
        super(message);
    }
}

 class Main {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);

            if (number % 2 == 0) {
                System.out.println("Number is even:"+number);
            } else {
                throw new OddException("Number is odd. Please enter an even number.");
            }
        } catch (OddException e) {
            System.out.println("Error message: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer.");
        }
    }
}