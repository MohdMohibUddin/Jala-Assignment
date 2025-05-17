interface DefaultMethod {
    default void greet() {
        System.out.println("Hello from default method");
    }
}

class F implements DefaultMethod {
}

class Test6 {
    public static void main(String[] args) {
        F obj = new F();
        obj.greet();
    }
}