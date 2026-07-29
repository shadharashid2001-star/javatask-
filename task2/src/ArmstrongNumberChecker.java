public class ArmstrongNumberChecker {


    public static  void main(String[] args) {

        //Declare and initialize the variables
        Integer number =153;
        Integer original =number;
        Integer digit = 0;
        Integer sum =0;
        Integer count = 0;
        Integer X = number;


        while(X > 0 ) {
            count++;
            X = X /10;
        }

        while(number > 0 ){

            digit = number % 10;
            sum += (int) Math.pow(digit,count);
            number = number /10;
        }
        if (sum.equals(original)) {
            System.out.println("The number is an Armstrong number");
        }

    }
}