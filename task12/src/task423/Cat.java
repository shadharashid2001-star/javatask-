package task423;

import java.util.ArrayList;
import java.util.List;

public class Cat implements AnimalBehaviour{
    public static void main(String[] args) {
        List<AnimalBehaviour> animal = new ArrayList<>();
         animal.add(new Cat());
        animal.add(new Dog());
       for (AnimalBehaviour a : animal){
           a.makeSound();
       }
    }

    @Override
    public void eat() {
        IO.println("cat CAN EAT");
    }

    @Override
    public void sleep() {
        IO.println("cat CAN sleeep");
    }

    @Override
    public void makeSound() {
        IO.println("cat CAN meao");
    }
}
