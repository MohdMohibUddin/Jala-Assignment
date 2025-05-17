public interface PublicInterface {
    int a = 10;
    void print();
}

class H implements PublicInterface {
    public void print() {
        System.out.println("a = " + a);
    }
}

class Test8 {
    public static void main(String[] args) {
        H obj = new H();
        obj.print();
    }
}