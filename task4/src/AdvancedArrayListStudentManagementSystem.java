import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AdvancedArrayListStudentManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        students.add("Ali");
        students.add("Sara");
        students.add("Omar");
        students.add("Jojo");
        students.add("Said");
        students.add("Reem");
        students.add("Ahmed");
        students.add("Salim");
        students.add("Maryam");
        students.add("Elan");


        System.out.println("Total Students: " + students.size());

        for(int i = 0; i < students.size(); i++) {

            System.out.println("Student " + i + ": " + students.get(i));

        }



        System.out.print("Enter student name to add: ");
        String newStudent = input.nextLine();

        students.add(newStudent);

        System.out.println("Student added successfully");



        System.out.print("Enter position: ");
        int position = input.nextInt();
        input.nextLine();

        System.out.print("Enter student name: ");
        String name = input.nextLine();


        if(position >= 0 && position <= students.size()) {

            students.add(position, name);

            System.out.println("Student added");

        } else {

            System.out.println("Invalid position");
        }




        System.out.print("Enter index to update: ");
        int update = input.nextInt();
        input.nextLine();


        if(update >= 0 && update < students.size()) {

            System.out.print("Enter new name: ");
            String newName = input.nextLine();

            students.set(update, newName);

            System.out.println("Updated successfully");

        } else {

            System.out.println("Invalid index");
        }




        input.nextLine();

        System.out.print("Enter student name to search: ");
        String search = input.nextLine();


        if(students.contains(search)) {

            System.out.println("Student found");
            System.out.println("Index: " + students.indexOf(search));

        } else {

            System.out.println("Student not found");

        }




        System.out.print("Enter student name to remove: ");
        String removeName = input.nextLine();


        if(students.remove(removeName)) {

            System.out.println("Student removed");

        } else {

            System.out.println("Student not found");
        }




        System.out.print("Enter index to remove: ");
        int removeIndex = input.nextInt();


        if(removeIndex >= 0 && removeIndex < students.size()) {

            students.remove(removeIndex);

            System.out.println("Removed successfully");

        } else {

            System.out.println("Invalid index");

        }




        System.out.println("Total Students: " + students.size());


        if(students.isEmpty()) {

            System.out.println("List is empty");

        } else {

            System.out.println("List is not empty");

        }



        System.out.println("First Student: " + students.get(0));

        System.out.println("Last Student: "
                + students.get(students.size()-1));




        ArrayList<String> sortedStudents = new ArrayList<>(students);

        Collections.sort(sortedStudents);


        System.out.println("Original List:");
        System.out.println(students);


        System.out.println("Sorted List:");
        System.out.println(sortedStudents);


        input.close();
    }
}