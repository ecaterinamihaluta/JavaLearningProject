package org.ecaterina.zooclubservice;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats mice");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow,meow!");
    }

}
