interface Animal{
    void sound();
}

interface Playbale{
    void play();
}

class Dog implements Animal, Playbale{
    @Override
    public void sound(){
        System.out.println("bark");
    }
    @Override
    public void play(){
        System.out.println("Dog is playing");
    }
}

public class InterfaceSample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.play();
    }
}
 // want to implement multiple variable in single class