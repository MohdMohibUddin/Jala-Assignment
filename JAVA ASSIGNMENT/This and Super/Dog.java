//5. Call constructor of the parent class using super()
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super();  
        System.out.println("Dog constructor called");
    }

    public static void main(String[] args) {
        new Dog();
    }
}