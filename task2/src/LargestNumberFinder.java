public class LargestNumberFinder {
    public static void main(String[] args){
        //Declare and initialize variables to store numbers that need to be compared.
       Integer[] number={23,45,70,89} ;
        Integer largest = number[0];
        for (Integer i = 1; i<number.length ; i++) {
            if (number[i]> largest){
                largest=number[i] ;
            }

        }
        // // Display the largest number
        System.out.println("Largest Number: " + largest);
    }
}
