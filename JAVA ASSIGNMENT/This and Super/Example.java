//3. Call constructor of the current class using this()
class Example {
    Example() {
        this(10); 
        System.out.println("No-arg constructor");
    }

    Example(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new Example();  
    }
}