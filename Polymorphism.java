class Animal{
    public void sound(){
        System.out.println("Hop Hop");
    }
}

class Dog extends Animal{
    @Override                         // indicate is the same subclass from super class
    public void sound(){
        System.out.println("Barking");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}

// different concept class - inheritance
// same concept class - polymorphism

