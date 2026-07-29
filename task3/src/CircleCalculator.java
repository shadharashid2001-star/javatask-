import java.sql.SQLOutput;
import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
//Assign the value 3.14 to a variable that represents π.
        Double pi = 3.14;
        //Prompt the user to enter the radius using a Scanner.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius  ");
        int radius = sc.nextInt();

        if (radius <= (0)){
            System.out.println("invalid radius ");
    }else

    {


// Calculate area and circumference
        Double area = (Math.PI * radius * radius);
        Double circumference = (2 * Math.PI * radius);

        System.out.println("Area :"+area);
        System.out.println(" circumference :"+ circumference);


    }
    //Use an if-else if-else statement to classify the circle
    if(radius<5){
            System.out.println(" Small Circle ");}
  else if (radius >5&& radius<15){
        System.out.println("Medium Circle");}

        else if(radius>15){
        System.out.println("Large Circle");}

        sc.close();

}
}
