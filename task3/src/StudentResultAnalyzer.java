

public static void main(String[] args) {

    StudentResultAnalyzer student = new StudentResultAnalyzer();

    boolean valid =
            student.validateMarks(
                    student.mathMark,
                    student.englishMark,
                    student.scienceMark);

    if (valid) {

        Integer total =
                student.calculateTotal();

        Double average =
                student.calculateAverage(total);

        String grade =
                student.calculateGrade(average);

        String performance =
                student.checkPerformance(grade);

        student.displayReport(
                student.studentName,
                student.mathMark,
                student.englishMark,
                student.scienceMark,
                total,
                average,
                grade,
                performance);

    } else {

        System.out.println("Invalid marks. Please check the student grades.");
    }
}


public static class StudentResultAnalyzer {

    //Attributes
    String studentName = "Shadha";
    Integer mathMark = 70;
    Integer scienceMark = 80;
    Integer englishMark = 90;
    String grade;
    Integer totalMarks;
    Double average;


    //METHODES

    public boolean validateMarks(Integer mathMark, Integer englishMark, Integer scienceMark) {

        if (mathMark >= 0 && mathMark <= 100 &&
                englishMark >= 0 && englishMark <= 100 &&
                scienceMark >= 0 && scienceMark <= 100) {

            return true;
        }

        return false;
    }


    public Integer calculateTotal() {

        Integer totalMarks = scienceMark + mathMark + englishMark;

        return totalMarks;
    }


    public Double calculateAverage(Integer totalMarks) {

        return (double) totalMarks / 3;
    }


    public String calculateGrade(Double average) {

        if (average >= 90) {

            return "A";

        } else if (average >= 80) {

            return "B";

        } else if (average >= 70) {

            return "C";

        } else if (average >= 60) {

            return "D";

        } else {

            return "F";
        }
    }


    public String checkPerformance(String grade) {

        if (grade.equals("A")) {

            return "Excellent";

        } else if (grade.equals("B")) {

            return "Very Good";

        } else if (grade.equals("C")) {

            return "Good";

        } else if (grade.equals("D")) {

            return "Pass";

        } else {

            return "Fail";
        }
    }


    public void displayReport(
            String studentName,
            Integer mathMark,
            Integer scienceMark,
            Integer englishMark,
            Integer totalMarks,
            Double average,
            String grade,
            String performance) {


        System.out.println("Student Name: " + studentName);
        System.out.println("Math Mark: " + mathMark);
        System.out.println("English Mark: " + englishMark);
        System.out.println("Science Mark: " + scienceMark);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Mark: " + average);
        System.out.println("Final Grade: " + grade);
        System.out.println("Performance Status: " + performance);
    }
}

