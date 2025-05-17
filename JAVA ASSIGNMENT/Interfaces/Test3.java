interface MyInterface {
    void display();
}

class C implements MyInterface {
    public void display() {
        System.out.println("Display called");
    }
}

class Test3 {
    public static void main(String[] args) {
        MyInterface obj = new C();
        obj.display();
    }
}