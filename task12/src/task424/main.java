package task424;

public class main {
    public static void main(String[] args){

        Dog d = new Dog();
        d.setAge(5);
        IO.println(d.getAge());
        d.setAge(-1);
        IO.println(d.getAge());
    }
}
