import java.util.ArrayList;
public class NumberListStatistics {
    public static void main(String[] args){
            // Create list
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(-13);
            numbers.add(-10);
            numbers.add(-8);
            numbers.add(-5);
            numbers.add(-3);
            numbers.add(-1);
            numbers.add(0);
            numbers.add(2);
            numbers.add(4);
            numbers.add(6);
            numbers.add(8);
            numbers.add(10);
            numbers.add(12);
            numbers.add(15);
            numbers.add(18);
            numbers.add(20);
            numbers.add(25);
            numbers.add(30);
            numbers.add(35);
            numbers.add(40);

            // Create variables to store results
            Integer totalsum = 0;
            Integer counteven = 0;
            Integer countodd = 0;
            Integer countpostive = 0;
            Integer countnegative = 0;
            Integer largestnum = numbers.get(0);
            Integer smallestnum = numbers.get(0);
            Double averagev =0.0;

            // Loop
            for (int i = 0; i < numbers.size(); i++) {

                int number = numbers.get(i);

                // Check even or odd
                if (number % 2 == 0) {
                    counteven++;
                } else {
                    countodd++;
                }

                // Check positive or negative
                if (number > 0) {
                    countpostive++;
                } else if (number < 0) {
                    countnegative++;
                }

                // Find largest number
                if (number > largestnum) {
                    largestnum = number;
                }

                // Find smallest number
                if (number < smallestnum) {
                    smallestnum = number;
                }

                // Calculate total sum
                totalsum += number;
            }

            // Calculate average
            averagev = totalsum / (double) numbers.size();

            // Display results
            System.out.println("Numbers = " + numbers);
            System.out.println("Even Numbers = " + counteven);
            System.out.println("Odd Numbers = " + countodd);
            System.out.println("Positive Numbers = " + countpostive);
            System.out.println("Negative Numbers = " + countnegative);
            System.out.println("Largest Number = " + largestnum);
            System.out.println("Smallest Number = " + smallestnum);
            System.out.println("Total Sum = " + totalsum);
            System.out.println("Average = " + averagev);
        }
    }


