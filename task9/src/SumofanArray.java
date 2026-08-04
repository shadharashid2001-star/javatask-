public class SumofanArray {
    public static void main(String[] args) {

        int[] x = {1, 2, 3};
        int[] a = {10, 20, 30, 40};

        System.out.println(sumArray(x, 0));
        System.out.println(sumArray(a, 0));

    }
    public static int sumArray(int[] arr, int index ){
        //base case
        if(index == arr.length) {
            return 0;
        }

        // Recursive case

        return arr[index] + sumArray(arr, index + 1) ;

    }
}
