public class StringReverse {
    public static void main(String[] args) {
        printReverse("cat");
    }
    public static  void printReverse(String str){
        //base case
        if (str.equals("")) {
            return;
        }


        // Recursive case
        printReverse(str.substring(1));
        System.out.println(str.charAt(0));
        }
    }
