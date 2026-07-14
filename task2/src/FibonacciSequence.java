public class FibonacciSequence {

    public static void main(String[] args){
      int first  = 0;
      int second = 1;
      int next = 0;
      int count= 0;
        // Print the first two Fibonacci numbers
        System.out.print(first + " ");
        System.out.print(second + " ");
        // Generate the remaining numbers
        for (int i=3; i<=15  ; i++) {
            next= first + second;
            first= second;
            second= next;
            System.out.print(next + " ");

        }

    }
}
