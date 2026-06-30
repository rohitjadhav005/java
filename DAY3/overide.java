class Animal {
    void sound() {
        System.out.println("Animal");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog");
    }
}
public class overide{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.sound();
        d.sound();
    }
}