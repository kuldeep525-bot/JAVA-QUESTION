// 4. Create a Java program to access the java.util.Date class through qualified way and print the current date of the system but inherit the Date class.


class CurrentDate {
    protected java.util.Date currentDate;

    CurrentDate() {
        this.currentDate = new java.util.Date(); // Fully qualified name
    }

    void printCurrentDate() {
        System.out.println("Current Date: " + currentDate);
    }
}

 class main {
    public static void main(String st[]) {
        CurrentDate date = new CurrentDate();
        date.printCurrentDate();
    }
}