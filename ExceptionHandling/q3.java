// 3. Write a Java program to create a method that reads a file and throws an exception if the file is not found

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 class FileRead {

    public static void main(String st[]) {
        String filePath = "kuldeep.txt";
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
