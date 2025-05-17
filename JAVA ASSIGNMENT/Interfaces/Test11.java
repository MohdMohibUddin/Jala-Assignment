interface StaticFinal {
    static final int num = 100;
    void show();
}

class I implements StaticFinal {
    public void show() {
        System.out.println("num = " + num);
    }
}

class Test11 {
    public static void main(String[] args) {
        I obj = new I();
        obj.show();
    }
}