//4. Write constructors with return type int and String
class InvalidConstructor {
   
    int InvalidConstructor() {
        System.out.println("This is a method, not a constructor");
        return 10;
    }


    InvalidConstructor() {
        System.out.println("Valid constructor");
    }

    public static void main(String[] args) {
        InvalidConstructor obj = new InvalidConstructor();
        obj.InvalidConstructor();
    }
}
