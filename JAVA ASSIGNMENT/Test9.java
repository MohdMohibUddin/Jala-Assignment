class Outer {
    private interface Inner {
        int x = 5;
        void print();
    }

    static class Impl implements Inner {
        public void print() {
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        Inner obj = new Impl();
        obj.print();
    }
}