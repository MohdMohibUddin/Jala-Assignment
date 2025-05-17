interface OneMethod {
    void show();
}

class A implements OneMethod {
    public void show() {
        System.out.println("Show method called");
    }
}

class Test1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}