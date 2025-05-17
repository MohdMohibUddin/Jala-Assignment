 // 1. Create an abstract class with abstract and non-abstract methods.
//2. Create a sub class for an abstract class. Create an object in the child class for the 
//abstract class and access the non-abstract methods
//3. Create an instance for the child class in child class and call abstract methods
//4. Create an instance for the child class in child class and call non-abstract methods */
abstract class Animal {
    // Abstract method (no body)
abstract void sound();

    // Non-abstract method (has body)
void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstractornot {
    public static void main(String[] args) {
    
        Animal a = new Dog();
        a.eat();   
        a.sound();
    }
}
class Cat extends Animal {
    @SuppressWarnings("override")
    void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();   
        c.sound(); 
    }
}