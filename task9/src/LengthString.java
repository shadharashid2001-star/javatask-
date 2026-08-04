public class LengthString {
    public static void main(String[] args) {

        System.out.println( length("cat") );
    }

    public static int length(String word) {
        //base case

        if (word.equals("")){
            return 0;
        }
        // Recursive case

        return  1 + length(word.substring(1));
    }
}

