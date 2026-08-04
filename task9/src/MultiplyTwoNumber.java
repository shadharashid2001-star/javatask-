public class MultiplyTwoNumber {
    public static void main(String[] args) {

        System.out.println( multiply(3,4));
    }

    public static int multiply(int a, int b){
        //base case
        if (b==0){
            return 0;
        }
        // Recursive case
      return   a + multiply(a, b-1);


    }
}



