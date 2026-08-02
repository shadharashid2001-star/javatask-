import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NumberStackAnalyzer {
    public static void main(String[] args) {

        Deque<Integer> numbers = new ArrayDeque<>();

        // enter the number of number using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of values ");
        Integer values = input.nextInt();

        // if condition
        if (values <= 0) {
            System.out.println("Invalid number of values.");
            return;
        } else {
            for (int i = 0; i < values; i++) {
                System.out.println("Enter integer num");
                int intnum = input.nextInt();
                numbers.push(intnum);
            }
        }

        int choice;

        do {

            System.out.println("1.Add Number");
            System.out.println("2.Remove Top Number");
            System.out.println("3.View Top Number");
            System.out.println("4.Display All Numbers");
            System.out.println("5.Analyze Numbers");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter new number:");
                    int num2 = input.nextInt();
                    numbers.push(num2);
                    System.out.println("Number added successfully");
                    break;

                case 2:
                    if (numbers.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        int d = numbers.pop();
                        System.out.println("The number removed: " + d);
                    }
                    break;

                case 3:
                    if (numbers.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Top number: " + numbers.peek());
                    }
                    break;

                case 4:
                    if (numbers.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("All numbers:");
                        for (int value : numbers) {
                            System.out.println(value);
                        }
                    }
                    break;

                case 5:
                    if (numbers.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {

                        int sum = 0;
                        int Average;
                        int Largestnumber = numbers.getFirst();
                        int Smallestnumber = numbers.getFirst();
                        int evennumbers = 0;
                        int oddnumbers = 0;
                        int positivenumbers = 0;
                        int negativenumbers = 0;
                        int Totalzeros = 0;

                        for (Integer value : numbers) {

                            sum += value;

                            if (value > Largestnumber) {
                                Largestnumber = value;
                            }

                            if (value < Smallestnumber) {
                                Smallestnumber = value;
                            }

                            if (value % 2 == 0) {
                                evennumbers++;
                            } else {
                                oddnumbers++;
                            }

                            if (value > 0) {
                                positivenumbers++;
                            } else if (value < 0) {
                                negativenumbers++;
                            } else {
                                Totalzeros++;
                            }
                        }

                        Average = sum / numbers.size();

                        System.out.println("Total number of elements: " + numbers.size());
                        System.out.println("Sum of all numbers: " + sum);
                        System.out.println("Average of all numbers: " + Average);
                        System.out.println("Largest number: " + Largestnumber);
                        System.out.println("Smallest number: " + Smallestnumber);
                        System.out.println("Total even numbers: " + evennumbers);
                        System.out.println("Total odd numbers: " + oddnumbers);
                        System.out.println("Total positive numbers: " + positivenumbers);
                        System.out.println("Total negative numbers: " + negativenumbers);
                        System.out.println("Total zeros: " + Totalzeros);
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        input.close();
    }
}