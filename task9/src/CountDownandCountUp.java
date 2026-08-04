public class CountDownandCountUp {

    public static void main(String[] args) {
        countDownUp(3);
    }

    public static void countDownUp(int n){

        //base case
        if (n == 1){
            System.out.println(1);
            return ;
        }
        //countup
        System.out.println("dowm"+n);
        countDownUp(n-1);
   //count up
        System.out.println("up"+n);

    }
}
