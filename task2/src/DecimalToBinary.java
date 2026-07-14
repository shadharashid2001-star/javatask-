public class DecimalToBinary {
    public static void main(String[] args){
        // Declare and initialize the required variables.
        int number = 25;
        int originalNumber = number;
        String binary = "";
        int remainder =0;
        while (number>0){
            remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;


        }
        //Use System.out.println() to display the output
        System.out.println("Decimal Number:"+originalNumber);
        System.out.println("Binary Number:"+binary);
    }
}
