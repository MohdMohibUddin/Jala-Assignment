interface X {
    void printX();
}

interface Y {
    void printY();
}

class D implements X, Y {
    public void printX() {
        System.out.println("X method");
    }
    public void printY() {
        System.out.println("Y method");
    }
}

class Test4 {
    public static void main(String[] args) {
        D obj = new D();
        obj.printX();
        obj.printY();
    }
}