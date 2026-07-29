import java.util.HashSet;
import java.util.Scanner;

public class CourseEnrollmentSet {
    public static void main(String[] args){

// HashSet to store cource
        HashSet<String> coursenames = new HashSet<>();
        // Prompt the user to enter the number of c using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter course num. :");
        Integer coursen = input.nextInt();

        for( int i = 0; i<=coursen-1 ; i++) {
            if (coursen <= 0) {
                System.out.println("Invalid number of courses.");
            } else {
                System.out.println("Enter course name :");
                String cn = input.next();
                if (coursenames.contains(cn)) {
                    System.out.println("Course already exists. Duplicate entries are not allowed.");
                } else {
                    coursenames.add(cn);
                }
            }
        }
            //USE REMOVE
            input.nextLine();
            System.out.println("Enter  name of a course to remove");
            String remove = input.nextLine();
            if (coursenames.contains(remove)){
                System.out.println("Course removed successfully..");
                coursenames.remove(remove);
            }else {
                System.out.println("Course not found.");
            }
            //Use an if-else if-else statement to classify the remaining courses
            if (coursenames.size() > 8){
                System.out.println("Large Course Catalog   ");
            } else if (coursenames.size() > 4) {
                System.out.println(" Medium Course Catalog   ");
            }else {
                System.out.println("  Small Course Catalog    ");
            }
            //Display output
            System.out.println("Total courses"+coursen);
            System.out.println("Total unique courses"+coursenames.size());
            System.out.println("All remaining course names"+coursenames);
            System.out.println("Removal result   "+remove);
        }}

