package task411;

import task411.LibraryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Librarymain {
   static Scanner input= new Scanner(System.in);
  static List<LibraryItem> catalogue = new ArrayList<>();
    public static void main(String[] args) {
        menuDeom();
        first();
    }

    public static void menuDeom(){
Boolean exit = false;
        while (!exit) {

            IO.println("""
            LIBRARY MENU:
            1- Add book
            2- Add magazine
            3- Print all
            4- Count
            5- Exit
            """);

            Integer choose = input.nextInt();
            input.nextLine();
            if (choose.equals(1)){
                catalogue.add(addBook());
            } else if (choose.equals(2)) {
                catalogue.add(addMagazine());

            } else if (choose.equals(3)) {
                for(LibraryItem d : catalogue ) {
                    IO.println("data :");
                    d.printAllInfo();
                }

            }else if (choose.equals(4)){
                IO.println(catalogue.size());
            }else if(choose.equals(5)){
                exit = true;
                IO.println("Goodbye");
            }


        }
        }

    public static Book addBook() {

        Book book = new Book();

        book.setTitle(IO.readln("Enter book title "));
        book.setAuthor(IO.readln("Enter book author :"));

        IO.println("Enter book pages:");

        while (!input.hasNextInt()) {
            IO.println("Please enter a number only:");
            input.next();
        }

        book.setPages(input.nextInt());
        input.nextLine();

        IO.println("Added.");

        return book;
    }
public static Book first(){

    IO.println("--- Single item created at startup ---");
    Book book = new Book();
    book.setTitle("Clean Code by Robert Martin");
    book.setPages(464);
    book.getShelfCode();
    book.setAuthor("Robert Martin");
    catalogue.add(book);
    IO.println();
    return book;

}
    public  static Magazine addMagazine(){
        Magazine magazine = new Magazine();
     magazine.setName(IO.readln("Enter name "));
        IO.readln("Enter issue number ");
     magazine.setIssueNumber(input.nextInt());
        IO.readln("Enter month ");
     magazine.setMonth(input.nextInt());
        magazine.printAllInfo();
        magazine.getLabel();
        magazine.getShelfCode();
        return  magazine;
    }
}
