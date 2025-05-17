public class defaulttest 
{
    public static void main(String[] args) {
        defaultdieldmethod obj = new defaultdieldmethod();
        obj.display();  // allowed
        System.out.println("Accessing default field: " + obj.num); // allowed
    }
}
