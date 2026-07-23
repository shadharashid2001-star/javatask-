public class stringdemo {

    public static void main(String[] args) {
     /*String greeting = "Hello";
     greeting.toUpperCase();
     IO.println(greeting);
     String upperCaseGreeting =  greeting.toUpperCase();
     IO.println(upperCaseGreeting);
     //
      String myname= "shadha";
      myname.toUpperCase();
      IO.println(myname);
        String upperCasemyname=  myname.toUpperCase();
        IO.println(upperCasemyname);
 //
        String s = " Hello codeline ";
        Integer strlen = s.length();
        System.out.println(strlen);
        IO.println(s.strip());

        //
       String str1= "  ";
        IO.println((str1.strip()).isBlank());
        IO.println((str1.strip()).isEmpty());
        String str2= "";
        IO.println(str2.isBlank());
        IO.println(str2.isEmpty());
        //

        String input =  IO.readln("Enter your name").strip();
        if(input.isBlank()){
            IO.println("name is required");

        }
        IO.println(input);

//
        String email = IO.readln("Enter email").strip();
            IO.println(email.indexOf("$"));
                    String t = "Hello Codeline World";
// 0123456789...
        IO.println(t.indexOf("Codeline"));
        IO.println(t.indexOf("Java"));
        IO.println(t.lastIndexOf("o"));
        IO.println(t.contains("World"));
        IO.println(t.startsWith("Hello"));
        IO.println(t.endsWith("World"));
         String t = "Hello Codeline World";
        IO.println(t.charAt(16));
        IO.println(t.substring(6,14));
        String file = "java_12.java";
    Integer dot = file.lastIndexOf(".");
    IO.println("File name "+ file.substring(0,dot));
      String t = "Hello Codeline World";
        IO.println(t.replace('0','0'));
            IO.println(t.replace("Hello","Hi"));
            String[] parts = t.split(" ");
            for(String part : parts){
                IO.println(part);
            }
      */

        //*/


        String csvRow = "shadha,25,99999999";
        String[] NAME = csvRow.split(",");
        for (String n : NAME) {
            IO.println(n);
        }
    }
}

