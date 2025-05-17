interface TwoMethods {
    void method1();
    void method2();
}

abstract class B implements TwoMethods {
    public void method1() {
        System.out.println("Method1 implemented");
    }
}

class Test2 {
    public static void main(String[] args) {
        B obj = new B() {};
        obj.method1();
    }
}