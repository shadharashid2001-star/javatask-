import java.util.Scanner;
import java.util.Arrays;

public class ArrayDataAnalyzerSystem {

    public static void main(String[] args) {

        int[] numbers = {45, 12, -5, 90, 33, 12, 0, 67, -20, 88, 45, 100, 7, -3, 55};

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;


        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Index " + i + " = " + numbers[i]);

            sum += numbers[i];


            if(numbers[i] > largest) {
                largest = numbers[i];
            }

            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }


            if(numbers[i] > 0) {
                positive++;
            }
            else if(numbers[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }


            if(numbers[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }


        double average = (double) sum / numbers.length;


        System.out.println("Total Elements: " + numbers.length);
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[numbers.length-1]);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);



        System.out.print("Enter number to search: ");
        int search = input.nextInt();

        int count = 0;
        int firstIndex = -1;


        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] == search) {

                count++;

                if(firstIndex == -1) {
                    firstIndex = i;
                }
            }
        }


        if(count > 0) {

            System.out.println("Number found");
            System.out.println("First Index: " + firstIndex);
            System.out.println("Occurrences: " + count);

        } else {

            System.out.println("Number not found");
        }



        System.out.print("Enter index to update: ");
        int index = input.nextInt();


        if(index >= 0 && index < numbers.length) {

            System.out.print("Enter new value: ");
            numbers[index] = input.nextInt();

            System.out.println("Updated Array:");

            for(int i = 0; i < numbers.length; i++) {
                System.out.println("Index " + i + " = " + numbers[i]);
            }

        } else {

            System.out.println("Invalid index");
        }



        System.out.println("Reverse Array:");

        for(int i = numbers.length-1; i >= 0; i--) {

            System.out.println(numbers[i]);
        }



        int[] copy = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(copy);


        System.out.println("Sorted Array:");

        for(int i = 0; i < copy.length; i++) {

            System.out.println(copy[i]);
        }


        System.out.println("Smallest Value: " + copy[0]);
        System.out.println("Largest Value: " + copy[copy.length-1]);


        input.close();
    }
}