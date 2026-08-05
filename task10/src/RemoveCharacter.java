public class RemoveCharacter {
    public static void main(String[] args) {
        System.out.println(removeChar("banana", 'a'));


    }
    public static String removeChar(String str , char ch){
//base case

        if(str.isEmpty()){
            return "";
        }

        // Recursive case
  char f=str.charAt(0);
        if( f == ch ){
            return removeChar(str.substring(1) ,ch);
        } else {
            return f + removeChar(str.substring(1), ch);
        }
    }
}

