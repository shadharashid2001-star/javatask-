public class SumDigits {
    public static void main(String[] args) {

        System.out.println( sumDigits(5) );
    }

    public static int sumDigits(int n)  {
        //base case
        if (n ==0){
            return 0;
        }
        // Recursive case
      return   (n% 10) + sumDigits(n /10);

    }
}
