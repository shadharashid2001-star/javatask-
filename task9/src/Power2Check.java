public class Power2Check {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(1));
    }

    public static  boolean isPowerOfTwo(int n)  {
        //base case
        if (n ==1){
            return true;
        }
        if (  n % 2 != 0 ){
            return false;
        }
        // Recursive case
        return isPowerOfTwo(n /2);

    }
}


