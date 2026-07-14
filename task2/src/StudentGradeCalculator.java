public class StudentGradeCalculator {
    public static void main(String[] args) {
        //Declare and initialize the required variables
        Double grade1 = 85.0;
        Double grade2 = 90.0;
        Double grade3 = 80.0;
        Double average = 0.0;
        StringBuilder status = new StringBuilder();
        // Calculate the average grade and store the result in the average variable
        average = (grade1 + grade2 + grade3) / 3;
// conditional statements to determine the student's performance
        if (average >= 90) {
            status.append("Excellent");
        } else if (average >= 75 && average < 89) {
            status.append(" Good  ");
        } else if (average >= 60 && average < 74) {
            status.append( "  Pass   ") ;
        } else {
            status .append("Fail");
        }
        //Display the grades, average, and final status.
        System.out.println("Grade1: " + grade1);
        System.out.println("Grade2: " + grade2);
        System.out.println("Grade3: " + grade3);
        System.out.println("Average: " + average);
        System.out.println("Status: " + status);

    }
}
