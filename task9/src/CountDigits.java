public class CountDigits {
    public static void main(String[] args) {

        System.out.println( countDigits(7));
    }

    public static int countDigits(int n){

        //base case
        if (n ==0){
            return 0;
        }
        // Recursive case
        return 1 + countDigits(n / 10);

    }
}


