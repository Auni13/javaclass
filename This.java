class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);               //to fetch from super class
    }
    @Override
    public void sound(){
        super.sound();
        System.out.println(name + " barks");
    }
}
public class This {
    public static void main(String[] args) {
        Dog dog = new Dog("Angeer");
        dog.sound();
    }
}

// when there is one need to be constant  
