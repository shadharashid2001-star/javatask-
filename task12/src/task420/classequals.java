package task420;

import java.util.Scanner;

public class classequals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IO.println("Enter word");
        String answer = sc.nextLine();
        if (answer.equals("yes")){
           IO.println("used ==");
        }else {
            IO.println("not used");
        }
    }
}
