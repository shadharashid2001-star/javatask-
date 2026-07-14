public class PalindromeChecker {
    public static void main(String[] args){
        //Declare and initialize the required variables.
        Integer number = 1221;
        Integer  original_number= number;
        Integer reversedNumber =0;
        Integer digit = 0;
        //loop to reverse the digits of the given number
         while (number>0){
             digit= number% 10;
             reversedNumber=reversedNumber*10 + digit;
           number = number /10 ;

             }
        if( original_number ==reversedNumber) {
            System.out.println("palindrome");
        }else {
            System.out.println(" not palindrome");
        }

//Display the original number and the reversed result
        System.out.println(" original number:" +original_number);
        System.out.println(" reversedNumber:" +reversedNumber);
    }
}
