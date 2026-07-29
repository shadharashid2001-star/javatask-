import java.util.Scanner;
public class FileNameAnalyzer {
public static  void main() {
    //Read a file name from the user with a Scanner
    Scanner input = new Scanner(System.in);
    IO.println ("Enter file name");
    String name = input.nextLine();
// use conditions
    if (name.isBlank()){
        IO.println("invalid file name");
    }
    if(!name.contains(".")){
        IO.println("invalid file name");
    }
    if (name.startsWith(".")){
        IO.println("invalid file name");
    }if (name.endsWith(".")){
        IO.println("invalid file name");
    }
    int ldot = name.lastIndexOf(".") ;
    String bname= name.substring(0,ldot);
    String extention= name.substring(ldot+1).toLowerCase();
    //classfy
    if (extention.equals("pdf")){
        IO.println("file type is pdf: Document  ");
    }if (extention.equals("jpg")){
        IO.println("file type is image ");}
    if (extention.equals("mp3")){
        IO.println("file type is  Audio  ");}
    else {
        IO.println("file type  Other   ");}

    //display output
    System.out.println("extention :"+extention);

}
   }