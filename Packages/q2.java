// 2. Create a Java program to access the java.util.Date class through qualified way and print the current date of the system.

//it means without importing


 class CurrentDate {
    public static void main(String st[]) {
        java.util.Date currentDate = new java.util.Date();
        System.out.println("Current Date: " + currentDate);
    }
}