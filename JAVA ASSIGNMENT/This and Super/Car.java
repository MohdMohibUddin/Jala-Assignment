//6. Use this() and super() in methods not in constructors
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void show() {
        this.message();
        super.run();
    }

    void message() {
        System.out.println("Car-specific method");
    }

    public static void main(String[] args) {
        new Car().show();
    }
}