public class EvenOddCounter {
    public static void main(String[] args){
        //Declare and initialize the required variables.
        int start= 1;
        int end = 10;
        int evenCount= 0;
        int oddCount= 0;
// Use a loop to check numbers within the given range.
        for(int i= start;i<=10 ;++i )
            if(i %2 == 0){
                evenCount++;

            }else
                oddCount++;
        //Use System.out.println() to display the output.
        System.out.println("Even Numbers Count:"+evenCount);
        System.out.println("Odd Numbers Count:"+oddCount);
    }
}
