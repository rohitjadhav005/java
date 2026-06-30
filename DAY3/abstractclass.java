// An Abstract Class is an incomplete class that cannot create objects directly. 
// It acts as a blueprint for its child classes.
// Abstract Class

// ↓

// Defines the rule

// ↓

// Child Class

// ↓

// Implements the rule
abstract class Animal{
    void eat(){
        System.out.println("Eating...");
    }
    abstract void sound();
    
}
class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Dog Barks...");   
        }
}
public class abstractclass{
    public static void main(String[] args){

        Dog d = new Dog();
        d.eat();
        d.sound();
      

    }

}