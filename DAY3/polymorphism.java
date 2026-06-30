// the simple funda of the polymorphism is the single variable can able to dance with different types of object

class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks....");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat Meows....");
    }
}

class Lion extends Animal {

    @Override
    void sound() {
        System.out.println("Lion Roars....");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        //importatnt line in java:-
        Animal a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
        a = new Lion();
        a.sound();
    }
}
