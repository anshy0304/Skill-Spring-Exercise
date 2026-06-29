package Upskilling.CoreJava;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name,String word){
        this.name = name;
        System.out.println(word);
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("bruno","is good");
        System.out.println(dog.name);
    }
}