public class ArraySorted {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};

        System.out.println(isSorted(x, 0));

    }

    public static boolean isSorted(int[]  arr, int index) {
        //base case
        if (index == arr.length - 1) {
            return true;
        }


// if num greater than the num in arr
        if (arr[index] > arr[index + 1] ){
            return false;
        }


        // Recursive case
        return isSorted(arr, index +1);
    }
}