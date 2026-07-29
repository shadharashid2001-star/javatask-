import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniversityCourseRegistrationSystem {

    public static void main(String[] args) {

        // create map and set
        HashSet<Integer> id = new HashSet<>();
        HashMap<Integer, HashSet<String>> student = new HashMap<>();

        // Scanner
        Scanner input = new Scanner(System.in);

        // enter number of students
        System.out.println("Enter num of students");
        Integer numstudent = input.nextInt();


        // check number of students
        if (numstudent <= 0) {

            System.out.println("Invalid number of students.");

        } else {


            // create loop for students
            for (int i = 0; i < numstudent; i++) {


                System.out.println("Enter student id");
                Integer ids = input.nextInt();
                input.nextLine();


                // check  ID
                if (id.contains(ids)) {

                    System.out.println("Student ID already exists. Record not added.");

                } else {


                    // add ID to HashSet
                    id.add(ids);


                    System.out.print("Enter number of courses: ");
                    int numberCourses = input.nextInt();
                    input.nextLine();


                    HashSet<String> courses = new HashSet<>();


                    // enter courses
                    for (int j = 0; j < numberCourses; j++) {

                        System.out.print("Enter course name: ");
                        String course = input.nextLine();

                        courses.add(course);

                    }


                    // save student and courses in HashMap
                    student.put(ids, courses);

                }

            }



            // menu
            boolean exit = false;

            while (!exit) {


                System.out.println("\n===== University Course Registration System =====");
                System.out.println("1. Search Student");
                System.out.println("2. Add Course to Student");
                System.out.println("3. Remove Course from Student");
                System.out.println("4. Display All Students");
                System.out.println("5. Display Registration Statistics");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                int choice = input.nextInt();



                switch(choice) {


                    // Search Student
                    case 1:

                        System.out.print("Enter Student ID: ");
                        int searchId = input.nextInt();


                        if(student.containsKey(searchId)) {

                            System.out.println("Registered Courses: "
                                    + student.get(searchId));

                        } else {

                            System.out.println("Student not found.");

                        }

                        break;



                    // Add Course
                    case 2:

                        System.out.print("Enter Student ID: ");
                        int addId = input.nextInt();


                        if(student.containsKey(addId)) {


                            HashSet<String> courses = student.get(addId);


                            if(courses.size() >= 6) {

                                System.out.println("Cannot add more than 6 courses.");

                            } else {


                                System.out.print("Enter course name: ");
                                String newCourse = input.next();


                                if(courses.contains(newCourse)) {

                                    System.out.println("Course already registered.");

                                } else {

                                    courses.add(newCourse);

                                    student.replace(addId, courses);

                                    System.out.println("Course added successfully.");

                                }

                            }


                        } else {

                            System.out.println("Student not found.");

                        }


                        break;



                    // Remove Course
                    case 3:


                        System.out.print("Enter Student ID: ");
                        int removeId = input.nextInt();


                        if(student.containsKey(removeId)) {


                            System.out.print("Enter course name: ");
                            String removeCourse = input.next();


                            HashSet<String> courses = student.get(removeId);


                            if(courses.contains(removeCourse)) {


                                courses.remove(removeCourse);

                                student.replace(removeId, courses);


                                System.out.println("Course removed successfully.");


                            } else {

                                System.out.println("Course not found.");

                            }


                        } else {

                            System.out.println("Student not found.");

                        }


                        break;



                    // Display All Students
                    case 4:


                        for(Integer studentId : student.keySet()) {


                            System.out.println("---------------------");
                            System.out.println("Student ID: " + studentId);
                            System.out.println("Courses: "
                                    + student.get(studentId));

                        }


                        break;



                    // Statistics
                    case 5:


                        int totalStudents = student.size();

                        int totalCourses = 0;

                        int maxCourses = -1;

                        int minCourses = Integer.MAX_VALUE;


                        Integer highestStudent = null;

                        Integer lowestStudent = null;



                        for(Integer studentId : student.keySet()) {


                            int courseCount = student.get(studentId).size();


                            totalCourses += courseCount;



                            if(courseCount > maxCourses) {

                                maxCourses = courseCount;

                                highestStudent = studentId;

                            }



                            if(courseCount < minCourses) {

                                minCourses = courseCount;

                                lowestStudent = studentId;

                            }


                        }



                        double average = 0;


                        if(totalStudents > 0) {

                            average = (double) totalCourses / totalStudents;

                        }



                        System.out.println("Total number of students: "
                                + totalStudents);

                        System.out.println("Total course registrations: "
                                + totalCourses);

                        System.out.println("Student with highest courses: "
                                + highestStudent);

                        System.out.println("Student with lowest courses: "
                                + lowestStudent);

                        System.out.println("Average courses per student: "
                                + average);


                        break;



                    // Exit
                    case 6:


                        exit = true;

                        System.out.println("Program ended.");

                        break;



                    default:

                        System.out.println("Invalid choice.");

                }

            }

        }


        // close Scanner
        input.close();

    }
}