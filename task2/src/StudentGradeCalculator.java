public class StudentGradeCalculator {
    public static void main(String[] args){
        //Declare and initialize the required variables
        double grade1 = 85.0;
        double grade2 = 90.0;
        double grade3 = 80.0;
        double average = 0.0;
        String status = "";
 // Calculate the average grade and store the result in the average variable
        average= (grade1 + grade2+ grade3 ) /3 ;
// conditional statements to determine the student's performance
        if (average >= 90) {
            status= "Excellent";
        } else if (average >=75 && average<89) {
            status= " Good  ";
        } else if (average>=60 && average<74) {
            status= "  Pass   ";
        }else{
            status= "Fail";
        }
        //Display the grades, average, and final status.
        System.out.println("Grade1:"+grade1 );
        System.out.println("Grade2:"+grade2);
        System.out.println("Grade3:"+grade3);
        System.out.println("Average:"+average);
        System.out.println("Status:"+status);

    }
}
