//2. Print the fields/instance members of the parent class using super
class Parent {
    int a = 10;
}

class Child extends Parent {
    int a = 20;

    void show() {
        System.out.println("Child's a: " + a);
        System.out.println("Parent's a using super: " + super.a);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}