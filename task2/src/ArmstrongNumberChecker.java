public class ArmstrongNumberChecker {


    public static  void main(String[] args) {

        //Declare and initialize the variables
        int number =153;
        int original =number;
        int digit = 0;
        int sum =0;
        int count = 0;
        int temp = number;


        while(temp > 0 ) {
            count++;
            temp = temp /10;
        }

        while(number > 0 ){

            digit = number % 10;

            sum += Math.pow(digit,count);
            number = number /10;
        }
        if(sum == original) {
            System.out.println("The number is an Armstrong number");
        }

    }
}