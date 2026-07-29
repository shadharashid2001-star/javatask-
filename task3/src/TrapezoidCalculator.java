import java.util.Scanner;

public class TrapezoidCalculator {

    public static  void  main(String[] args){
        //Declare all the variables required for the program using meaningful names and
        Integer area;
        Integer perimeter =0 ;
        //Prompt the user to enter the triangle's base, height, and the lengths of its three sides
        //using a Scanner.
        Scanner b1 = new Scanner(System.in);
        System.out.println("Enter base1 ");
        int base1 = b1.nextInt();
        Scanner  b2 = new Scanner(System.in);
        System.out.println("Enter base2 ");
        int base2 = b2.nextInt();
        Scanner  h = new Scanner(System.in);
        System.out.println("Enter height ");
        int height= h.nextInt();
        Scanner  l1 = new Scanner(System.in);
        System.out.println("Enter legs1 ");
        int leg1 = l1.nextInt();
        Scanner l2 = new Scanner(System.in);
        System.out.println("Enter legs2");
        int leg2 = l2.nextInt();
// Check that all entered values are greater than 0
        if (base1>0 && base2>0  &&  height>0  &&  leg1>0  && leg1>0){
            System.out.println("valid input");
            // If any value is less than or equal to 0
        } else if (base1<=0|| base2<=0 || height<=0 || leg1<=0 ||leg1<=0) {
            System.out.println("invalid input");
            // calculation
        }else{
            area = ((base1 + base2) * height) / 2;
          perimeter = base1 + base2 + leg1 + leg2 ;
            System.out.println("Area :" +area);
            System.out.println(" Perimeter :"+ perimeter);}

        //Use an if-else statement to classify the trapezoid based on its perimeter
         if (perimeter<30){
             System.out.println("Small Trapezoid  ");

    } else if (perimeter >30  && perimeter<60) {
             System.out.println("Medium Trapezoid  ");

         } else {
            System.out.println("Large Trapezoid  ");
        }
        b1.close();
        b2.close();
        h.close();
        l1.close();
        l2.close();



    }

    }
