public class SumEvenNumbers {
    public static void main(String[] args) {

        System.out.println( sumEven(2) );
    }

    public static int sumEven(int n)  {
        //base case
        if (n ==0){
            return 0;
        }

        // Recursive case
        if (n % 2 == 0) {
            return n + sumEven(n - 1);
        } else {
            return sumEven(n - 1);
        }

    }
}
