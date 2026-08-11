package task422;

public class Dog implements AnimalBehaviour{
    static void main(String[] args){
        AnimalBehaviour ab = new Dog();
        ab.makeSound();
        ab.sleep();
        ab.eat();

    }
    @Override
    public void eat() {
        IO.println("DOG CAN EAT");
    }

    @Override
    public void sleep() {
        IO.println("DOG CAN SLEEP");

    }

    @Override
    public void makeSound() {
        IO.println("DOG CAN MAKE SOUND");

    }


}
