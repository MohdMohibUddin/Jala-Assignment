public class staticvari {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // instance variables
    int instanceVar1 = 5;
    int instanceVar2 = 15;

    // static method
    static void staticMethod1() {
        System.out.println("Inside staticMethod1");

        // access instance variables by creating object
        staticvari obj = new staticvari();
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);

        // call instance method
        obj.instanceMethod1();
    }

    // another static method
    static void staticMethod2() {
        System.out.println("Inside staticMethod2");
    }

    // instance method
    void instanceMethod1() {
        System.out.println("Inside instanceMethod1");

        // access static variables directly
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);

        // call static method
        staticMethod2();
    }

    // another instance method
    void instanceMethod2() {
        System.out.println("Inside instanceMethod2");
    }

    // main method
    public static void main(String[] args) {
        staticvari obj = new staticvari();

        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);

        staticMethod1();
        staticMethod2();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
    
}
