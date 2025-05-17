//5. Try to call the constructor multiple times with the same object
class Sample {
    Sample() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Sample s = new Sample();
    }
}
