package org.ecaterina.zooclubservice;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void eat() {
        System.out.println(this.getName() + " eats bones");
    }
    public void makeSound() {
        System.out.println(getName() + " Woof Woof");
    }

}
