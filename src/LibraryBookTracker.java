import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LibraryBookTracker {
    public static void main(String[] args){
//creat set and map
        HashSet<Integer> idbook=  new HashSet<>();
        HashMap<Integer, String>  books = new HashMap<>();
        //Prompt the user to enter the number of books using a Scanner.
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter num of book ");
        Integer numbooks= input.nextInt();
//creat loop
        for (int i = 0 ; i<=numbooks -1;i++){
            //check numofbook
            if (numbooks<=0){
                System.out.println("Invalid number of books");
            }else {
                System.out.println("Enter book id");
                Integer id = input.nextInt();
                input.nextLine();
                System.out.println("Enter book title");
                String title = input.nextLine();

                if (books.containsKey(id)){
                    System.out.println("Duplicate Book ID. Record not added.");

                }else {
                    books.put(id,title);
                    idbook.add(id);
                }
            }
            //After all books have been entered, prompt the user to enter a book ID to search for

            System.out.println("Enter book id to search");
            Integer search= input.nextInt();
            if(books.containsKey(search)){
                System.out.println("The book ID  :" + search);
                System.out.println("The book title  :" + books.get(search));
            }else {
                System.out.println("Book not found.");
            }

        }
        // classify  the library
        if(books.size()  > 10) {
            System.out.println("Large Library");
        }else if(books.size() > 5) {
            System.out.println("Medium Library");
        }else {
            System.out.println("Small Library");
        }

        // display  output
        System.out.println("Total unique book :  " + numbooks);
        System.out.println("Total book records :  " + books.size());
        System.out.println("All book id and title :" + books);

    }
}


