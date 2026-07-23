import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListScoreAnalysisandManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(85);
        scores.add(70);
        scores.add(95);
        scores.add(80);
        scores.add(50);
        scores.add(99);
        scores.add(5);
        scores.add(30);
        scores.add(55);
        scores.add(33);
        scores.add(44);
        scores.add(34);
        scores.add(25);
        scores.add(75);
        scores.add(45);


        System.out.println("Total Scores: " + scores.size());

        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + i + ": " + scores.get(i));
        }


        int total = 0;
        int highest = scores.get(0);
        int lowest = scores.get(0);

        for (int i = 0; i < scores.size(); i++) {

            total += scores.get(i);

            if (scores.get(i) > highest) {
                highest = scores.get(i);
            }

            if (scores.get(i) < lowest) {
                lowest = scores.get(i);
            }
        }

        double average = (double) total / scores.size();

        System.out.println("Total Score: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);



        System.out.println("Score Classification:");

        for (int i = 0; i < scores.size(); i++) {

            if (scores.get(i) >= 90) {
                System.out.println(scores.get(i) + " Excellent");
            }
            else if (scores.get(i) >= 60) {
                System.out.println(scores.get(i) + " Pass");
            }
            else {
                System.out.println(scores.get(i) + " Failed");
            }
        }


        System.out.print("Enter score to search: ");
        int search = input.nextInt();

        if (scores.contains(search)) {

            System.out.println("Score found");
            System.out.println("Index: " + scores.indexOf(search));

        } else {

            System.out.println("Score not found");
        }



        System.out.print("Enter index to update: ");
        int updateIndex = input.nextInt();

        if (updateIndex >= 0 && updateIndex < scores.size()) {

            System.out.print("Enter new score: ");
            int newScore = input.nextInt();

            scores.set(updateIndex, newScore);

            System.out.println("Score updated successfully");

        } else {

            System.out.println("Invalid index");
        }



        System.out.print("Enter score to remove: ");
        int removeScore = input.nextInt();

        if (scores.remove(Integer.valueOf(removeScore))) {

            System.out.println("Score removed successfully");

        } else {

            System.out.println("Score not found");
        }



        System.out.print("Enter index to remove: ");
        int removeIndex = input.nextInt();

        if (removeIndex >= 0 && removeIndex < scores.size()) {

            scores.remove(removeIndex);

            System.out.println("Score removed successfully");

        } else {

            System.out.println("Invalid index");
        }



        ArrayList<Integer> sortedScores = new ArrayList<>(scores);

        Collections.sort(sortedScores);

        System.out.println("Original List:");
        System.out.println(scores);

        System.out.println("Sorted List:");
        System.out.println(sortedScores);



        System.out.println("Reverse List:");

        for (int i = scores.size() - 1; i >= 0; i--) {

            System.out.println(scores.get(i));
        }



        ArrayList<Integer> copyScores = new ArrayList<>(scores);

        Collections.sort(copyScores);

        System.out.println("Copy Sorted List:");

        for (int i = 0; i < copyScores.size(); i++) {

            System.out.println(copyScores.get(i));
        }


        System.out.println("Smallest Value: " + copyScores.get(0));
        System.out.println("Largest Value: " + copyScores.get(copyScores.size() - 1));



        scores.clear();

        System.out.println("After Clear:");
        System.out.println(scores);

        System.out.println("Is Empty: " + scores.isEmpty());


        input.close();
    }
}