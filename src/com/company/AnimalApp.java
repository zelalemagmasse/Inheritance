package com.company;

public class AnimalApp {

    public static void main(String[] args) {
	// write your code here
        Animal a= new Animal();
        a.eat();
        a.sleep();

        Cat c = new Cat();
        c.eat();
        c.sleep();

        Bird b= new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
