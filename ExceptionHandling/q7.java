// 7. Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.

class main {
    public static void main(String st[]) {
        try {
            String input = "kuldeep";
            checkForVowels(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
          System.out.println("thanks for visiting");
        }
    }

    public static void checkForVowels(String str) throws Exception {
        str = str.toLowerCase();
        boolean containsVowel = false;

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                containsVowel = true;
                break; 
            }
        }
        if (containsVowel) {
            System.out.println("The string contains vowels.");
        } else {
            throw new Exception("The string does not contain any vowels.");
        }
    }
}