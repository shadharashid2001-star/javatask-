public class EvenOddCounter {
    public static void main(String[] args){
        //Declare and initialize the required variables.
        Integer start= 1;
        Integer end = 10;
        Integer evenCount= 0;
        Integer oddCount= 0;
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

