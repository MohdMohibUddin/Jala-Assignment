//3. Apply private, public, protected and default access modifiers to the constructor
class Demo {
    private Demo() {
        System.out.println("Private Constructor");
    }

    Demo(int x) {
        System.out.println("Default Access Constructor: x = " + x);
    }

    protected Demo(String name) {
        System.out.println("Protected Constructor: name = " + name);
    }

    public Demo(double d) {
        System.out.println("Public Constructor: value = " + d);
    }

    public static void main(String[] args) {
        Demo d2 = new Demo(10);
        Demo d3 = new Demo("Java");
        Demo d4 = new Demo(3.14);
    }
}
