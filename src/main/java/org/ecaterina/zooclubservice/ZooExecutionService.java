package org.ecaterina.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal timofeiDog = new Dog("Timofei");
        System.out.println("The name of the object timofeiDog is " + timofeiDog.getName());

        timofeiDog.setName("Timofei Ecaterinovici");
        System.out.println("The updated name of the object timofeiDog is " + timofeiDog.getName());

        timofeiDog.eat();
        timofeiDog.makeSound();

        AnimalInterface artosDog = new Dog("Artos");
        artosDog.makeSound();

        Dog bobDog = new Dog("Bob");
        bobDog.eat();
        bobDog.makeSound();

        Cat karaCat = new Cat(" Kara ");
        karaCat.eat();
        karaCat.makeSound();
    }
}
