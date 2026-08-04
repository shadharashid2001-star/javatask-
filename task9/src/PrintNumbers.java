public class PrintNumbers {
    public static void main(String[] args) {
        printUp(3);
    }

    public static void printUp(int n){

        //base case
        if (n == 1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        printUp(n-1);

    }
}


