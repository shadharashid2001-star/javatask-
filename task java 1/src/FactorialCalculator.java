public class FactorialCalculator {
    public static  void main(String[] args){
    //Declare an int variable named number and assign it a value of 7
    // Declare a long variable named factorial and initialise it to 1
        int number= 7;
        int  factorial =1;
        // while loop with the condition i <= number
        int i=1;
        while(i <= number){
        factorial= factorial+i;
        i= i +1 ;
         //System.out.println for all output
            System.out.println("number"+number);
            System.out.println("Factorial: " + factorial);
    }}
}
