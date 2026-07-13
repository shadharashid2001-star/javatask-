public class MultiplicationTable {
    public static  void main(String[] args){
        // Set the base number for the multiplication table
        int base = 9;
        // Loop from 1 to 10 and calculate each multiplication result
        for (int i= 1; i<=10 ; i++){
            // Calculate the product
            int result =  base* i ;
            // Print the multiplication expression
            System.out.println(base+ "*" +i+"="+result);
        }
    }
}
