package task423;


public class Dog implements AnimalBehaviour {
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
        IO.println("DOG CAN woof");

    }


}
