public class MultiplicationCalculator {
    public static void main(String[] args)
    {
        // Declare and initialize the required variables.
        Integer start = 1;
        Integer end = 5;
        Integer result = 1;
//Use a loop to multiply the numbers from start to end.
        for(int i =start; i<=end;i++){
          result= result * i;
        }
        //Use System.out.println() to display the output.
        System.out.println("Multiplication Result:"+result);

    }
}
