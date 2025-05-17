//4. Call argument constructor of current class using this()
class Book {
    Book() {
        this("Java Programming");
        System.out.println("Default constructor");
    }

    Book(String title) {
        System.out.println("Book title: " + title);
    }

    public static void main(String[] args) {
        new Book();
    }
}