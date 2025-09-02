// 13. Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false.

 class VowelChecker {

    public static void main(String st[]) {
        System.out.println(areAllVowels("aeiou")); // true
        System.out.println(areAllVowels("AEIOU")); // true
        System.out.println(areAllVowels("aEiOu")); // true
        System.out.println(areAllVowels("hello")); // false
        System.out.println(areAllVowels(""));      // true (empty string has no non-vowel characters)
    }

    public static boolean areAllVowels(String input) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (vowels.indexOf(c) == -1) {
                return false; 
            }
        }
        return true;
    }
}