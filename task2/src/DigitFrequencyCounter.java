public class DigitFrequencyCounter {
    public static void main(String[] args) {
        //Declare and initialize the required variables.
        Integer number = 122333;
        Integer originalNumber = number;
        Integer targetDigit = 3;
        Integer count = 0;
        Integer digit = 0;

        //Use a loop to extract each digit from the given number.
        while (number > 0) {
            digit = number % 10;
            if (digit.equals(targetDigit)) {
                count++;
            }
            number = number / 10;
        }


        System.out.println("Number:"+originalNumber);
        System.out.println("Target Digit:"+targetDigit);
        System.out.println("Frequency:"+count);
    }
    }


