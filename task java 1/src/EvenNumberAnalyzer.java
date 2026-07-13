public class EvenNumberAnalyzer {
    public static void main(String[] args) {
        //Declare an int variable named count and initialise it to 0
        int count = 0;
        // Declare an int variable named sum and initialise it to 0
        int sum= 0;
        //for loop to iterate from 1 to limit
         for(int i= 1; i<=20 ;i++)
             if (i % 2== 0) {
                 System.out.println("number"+ i);
                 count++;
                 sum +=i ;

             }
        System.out.println("count of number:"+count);
        System.out.println("sum of number:"+sum);
    }
}
