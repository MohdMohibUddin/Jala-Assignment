interface P {
    void show();
}

interface Q {
    void show();
}

class E implements P, Q {
    public void show() {
        System.out.println("Same method from both interfaces");
    }
}

class Test5 {
    public static void main(String[] args) {
        E obj = new E();
        obj.show();
    }
}