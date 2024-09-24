//Super class
class Animal{
    public void eat(){
        System.out.println("The animal is eating");
    }
}

//Subclass
class Dog extends Animal{
    public void bark(){
        System.out.println("The dog is barking");
    }
}

public class Inheritance {
    
    public static void main(String[] args) {    //last piece of the code 
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
