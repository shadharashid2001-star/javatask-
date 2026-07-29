import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CourseEnrollmentSystem {
    void main(){
        //create set and map
        HashSet<Integer> ids = new HashSet<>();
        HashMap<Integer,String> student = new HashMap<>();

        //Prompt the user to enter the number of students using a Scanner

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of student:");
        Integer numstudent = input.nextInt();
        //creat loop
        for (int i = 0 ; i<=numstudent-1 ; i++){

            if (numstudent<=0){
                System.out.println("Invalid number of students.");

            }else {
                System.out.println("enter students id");
                Integer id = input.nextInt();
                input.nextLine();
                System.out.println("enter course name");
                String course = input.nextLine();

                if(student.containsKey(id)) {
                    System.out.println("Student ID already exists. Record not added.");
                }else {
                    student.put(id,course);
                    ids.add(id);
                }
            }
        }
// update course
        System.out.println("Enter student id for update");
        Integer search = input.nextInt();
        if (student.containsKey(search)){
            System.out.println("Enter new course name ");
            String namec= input.nextLine();
            student.replace(search,namec);
            System.out.println("Course updated successfully");
        }else {
            System.out.println("Student ID  not found.");
        }
        // classify  the enrollment
        if(student.size()  > 15) {
            System.out.println("Large Enrollment");
        }else if(student.size() > 5) {
            System.out.println("Medium Enrollment");
        }else {
            System.out.println("Small Enrollment ");
        }

        // print output
        System.out.println("Total unique student :  " + ids.size());
        System.out.println("Total student records :  " + student.size());
        System.out.println("All student IDs with their enrolled courses  :" + student);
        System.out.println("All student IDs  :" + ids);

        input.close();


    }
    }

