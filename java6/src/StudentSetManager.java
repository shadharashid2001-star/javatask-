import java.util.HashSet;
import java.util.Scanner;

public class StudentSetManager {
    public static void main(String[] args){

// Create a HashSet to store student IDs
        HashSet<Integer> studentid = new HashSet<>();
        //Prompt the user to enter the number of student IDs they want to register using a
        //Scanner.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num student id :");

        Integer numdstudent = input.nextInt();

    for( int i = 0; i<=numdstudent-1 ; ++i){
        if (numdstudent <= 0 ){
            System.out.println("Invalid number of students." );
        }else {
            System.out.println("Enter num id :");
            Integer id = input.nextInt();
if (studentid.contains(id)){
    System.out.println("Duplicate ID detected. ID was not added."  );
}else {
    studentid.add(id);
    //classify the registration using an if-else if-else
    //statement
}    if(id<5){
                System.out.println(" Small Registration  ");
            } else if (id>5 && id<10) {
                System.out.println("Medium Registration  ");
            }else {
                System.out.println("Large Registration ");
            }
        }
//Display output
        System.out.println("TOTAL ID"+numdstudent);
        System.out.println("total u id"+studentid.size());
        System.out.println("all unique student id"+studentid);
        System.out.println("Registration classification ");

    }
    input.close();
    }
}
