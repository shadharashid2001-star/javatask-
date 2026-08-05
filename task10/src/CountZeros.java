public class CountZeros {
    public static void main(String[] args) {

        System.out.println( countZeros(1020));
    }

    public static int countZeros(int n){

        //base case
        if (n ==0){
            return 0;
        }
        // Recursive case
       if(n %10 ==0 ){
           return 1+countZeros(n / 10);
       }else {
           return countZeros(n / 10);
       }

    }
}

