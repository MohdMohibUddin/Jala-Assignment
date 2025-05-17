/*2. Call the constructors(both default and argument constructors) of super class from a child 
class */
class Vehicle {
    Vehicle() {
        System.out.println("Default Vehicle Constructor");
    }

    Vehicle(String type) {
        System.out.println("Parameterized Vehicle Constructor: Type = " + type);
    }
}

class Car extends Vehicle {
    Car() {
        super();  // calling default constructor of super class
        System.out.println("Car Default Constructor");
    }

    Car(String type) {
        super(type);  // calling parameterized constructor of super class
        System.out.println("Car with Type Constructor");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Sedan");
    }
}
