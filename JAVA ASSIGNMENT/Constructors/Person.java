/*1. Write a class with a default constructor, one argument constructor and two argument 
constructors. Instantiate the class to call all the constructors of that class from a main 
class**/
class Person {
    Person() {
        System.out.println("Default Constructor");
    }

    Person(String name) {
        System.out.println("One-Arg Constructor: Name = " + name);
    }

    Person(String name, int age) {
        System.out.println("Two-Arg Constructor: Name = " + name + ", Age = " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Amit");
        Person p3 = new Person("Amit", 22);
    }
}
