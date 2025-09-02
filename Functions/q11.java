// 11. Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.

 class Consecutive {
    void checkConsecutive(int a, int b, int c) {
        int[] numbers = {a, b, c};
        java.util.Arrays.sort(numbers);
        // Check if the numbers are consecutive
        if (numbers[1] == numbers[0] + 1 && numbers[2] == numbers[1] + 1) {
            System.out.println("the numbers are consecutive.");
        } else {
            System.out.println("the numbers are not consecutive.");
        }
    }

    public static void main(String st[]) {
        Consecutive cons = new Consecutive();
        cons.checkConsecutive(1, 4, 3); 
        cons.checkConsecutive(1, 2, 3);  
    }
}