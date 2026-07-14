public class DigitCounter {
    public static void main(String[] args){
//Declare and initialize the required variables
        Integer number = 123456;
        Integer original_Number = number;
        Integer count = 0;
        Integer digit= 0;
//Use a loop to process the digits of the given number.
        while (number>0){
            digit=number%10 ;
            count++;
            number = number / 10;
        }
        // Use System.out.println() to display the output
        System.out.println("Number: " + original_Number);
        System.out.println("Number of digits: " + count);
    }
}
