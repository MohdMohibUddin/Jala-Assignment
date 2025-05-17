interface Parent {
    void msg();
}

interface Child extends Parent {
}

class G implements Child {
    public void msg() {
        System.out.println("Inherited interface method");
    }
}

class Test7 {
    public static void main(String[] args) {
        G obj = new G();
        obj.msg();
    }
}