public class NumberReversal {
    public static void main(String[] args) {

        //Declare and initialize the required variables.
        int number = 12345;
        int  original_number= number;
        int reversedNumber =0;
        int digit = 0;
    // Use a loop to extract the digits from the given number
     while (number>0) {
         digit = number % 10;
         reversedNumber=reversedNumber* 10 + digit;
         //remove
         number = number /10;

     }
     //Display the original number and the reversed result
        System.out.println(" original number:" +original_number);
        System.out.println(" reversedNumber:" +reversedNumber);


    }
}
