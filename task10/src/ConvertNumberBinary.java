public class ConvertNumberBinary {
    public static void main(String[] args) {

        System.out.println( toBinary(2) );
    }

    public static String toBinary(int n){

        //base case
        if (n ==0){
            return "";
        }
        // Recursive case
        if (n % 2 == 0) {
            return toBinary(n / 2) + "0";
        } else {
            return toBinary(n / 2) + "1";
        }

    }
}


