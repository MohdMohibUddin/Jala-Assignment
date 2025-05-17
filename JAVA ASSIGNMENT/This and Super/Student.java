//1.1. Print the fields/instance members of the current class using this and without using object
class Student {
    int roll = 006;
    String name = "Mohib";

    void display() {
        System.out.println("Roll: " + this.roll);   // using this
        System.out.println("Name: " + this.name);   // using this
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}