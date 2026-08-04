public class CheckWordPalindrome {
        public static void main(String[] args) {

            System.out.println(isPalindrome("level") );
        }

        public static boolean isPalindrome(String word)  {
            //base case
            if (word.length() ==0 ||word.length() ==1  ){
                return true;
            }
            if (word.charAt(0) != word.charAt(word.length() - 1)) {
                return false;
            }
            // Recursive case
            return isPalindrome(word.substring(1,word.length()-1));

        }
    }


