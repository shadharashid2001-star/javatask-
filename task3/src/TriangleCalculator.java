import java.util.Scanner;

public class TriangleCalculator {
    public static  void  main(String[] args){
        //Declare all the variables required for the program using meaningful names and
         Integer area;
         Integer perimeter ;
         //Prompt the user to enter the triangle's base, height, and the lengths of its three sides
        //using a Scanner.
        Scanner  b = new Scanner(System.in);
        System.out.println("Enter base ");
        int base = b.nextInt();
        Scanner  h = new Scanner(System.in);
        System.out.println("Enter height ");
        int height = h.nextInt();
        Scanner  l1 = new Scanner(System.in);
        System.out.println("Enter length1 ");
        int length1 = l1.nextInt();
        Scanner l2 = new Scanner(System.in);
        System.out.println("Enter length2");
        int length2 = l2.nextInt();
        Scanner l3 = new Scanner(System.in);
        System.out.println("Enter length3");
        int length3 = l2.nextInt();
        b.close();
        h.close();
        l1.close();
        l2.close();
        l3.close();
//If any entered value is less than or equal to 0, display "Invalid input. All values
//must be greater than zero.
        if( base <=0 || height<=0 || length1<=0 || length2<=0|| length3<=0){
            System.out.println("Invalid input.");
//calculate area + perimeter
        }else{
            area = (base * height) / 2 ;
            perimeter = length1+length2+length3 ;

            System.out.println("Area :" +area);
            System.out.println(" Perimeter :"+ perimeter);}
        //Determine the triangle type using if-else statements
        if (length1==length2 && length2==length3){
            System.out.println(" Equilateral Triangle");}
        else if (length1==length2 || length2==length3 ){
        System.out.println("  Isosceles Triangle ");}
            else{
        System.out.println(" Scalene Triangle ");}
        }

        }




