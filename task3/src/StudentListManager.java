import java.sql.SQLOutput;
import java.util.ArrayList;

public class StudentListManager {
    public static void main(String[] args) {
        int total = 0;
        //Create a Lis
        ArrayList<String> students = new ArrayList<>();
        students.add("shadha");
        students.add("ali");
        students.add("reem");
        students.add("ahmed");
        students.add("sara");
        students.add("jokha");
        students.add("shahed");
        students.add("maryam");
        students.add("said");
        students.add("rashid ");
//Use a loop to display all student names in the list.
        for (String s :students) {
            System.out.println(s);
        }
            System.out.println(students);
            //Display the total number of students in the list.
            total = students.size();
            System.out.println("total:" + total);
            //Display the first student in the list.
            System.out.println(students.get(0));
            //Display the last student in the list
            System.out.println(students.get(students.size() - 1));


            String name = IO.readln("Enter name");
            if (students.contains(name) ) {
                System.out.println("name already exit");
            } else {
                students.add(name);
                System.out.println(students);
            }


        //Remove a student from the list


        }

    }





