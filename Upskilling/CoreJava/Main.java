package Upskilling.CoreJava;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("bruno");
        System.out.println(dog.name);
    }
}