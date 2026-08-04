public class CountCharacterString {
    public static void main(String[] args) {

        System.out.println(countChar("banana", 'a'));
    }

    public static int countChar(String word ,char ch ) {
        //base case

        if (word.length() == 0) {
            return 0;
        }
        // Recursive case
        if (word.charAt(0) == ch) {
            return 1 + countChar(word.substring(1), ch);
        } else {
            return countChar(word.substring(1), ch);
        }
    }
}

