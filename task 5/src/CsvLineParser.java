import java.util.Scanner;

public class CsvLineParser {

    public static void main(String[] args){
// Read one line like "Ali, 25, Muscat" with a Scanner
        Scanner input = new Scanner(System.in);
        IO.println ("Enter YOUR LINE :");
        //split it
        String l = input.nextLine();
        String[] line =l.split(",");

        if(line.length!=3) {
            IO.println("Invalid record");

        }
        //Trim each field; convert the age to an int with Integer.parseInt.
        String name = line[0].trim();
        Integer age =Integer.parseInt( line[1].trim());
        String city = line[2].trim();
        //Classify the age
if (age <18){
    IO.println(" Minor ");
} else if (age>18 && age<64) {
    IO.println(" Adult ");
}else {
    IO.println("  Senior ");}
}
    }
