public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(countDigit(2222, 2));
    }
    public static  int  countDigit(int a ,int b){
        //base case
        if (a==0) {
            return 0;
        }


        // Recursive case
        if (a % 10 == b) {
            return 1 + countDigit(a / 10, b);
        } else {
            return countDigit(a / 10, b);
        }

    }
}
