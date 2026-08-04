public class NumberVowelsString {

    public static void main(String[] args) {

        System.out.println(countVowels("hello"));

    }

    public static int countVowels(String word) {

        // Base Case
        if (word.length() == 0) {
            return 0;
        }

        // Recursive Case
        char ch = Character.toLowerCase(word.charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1 + countVowels(word.substring(1));
        } else {
            return countVowels(word.substring(1));
        }
    }
}