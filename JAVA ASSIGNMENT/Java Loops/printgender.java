//12. Print gender (Male/Female) program according to given M/F using switch
import java.util.Scanner;

public class printgender {
    public static void main(String[] args) {

        System.out.print("Enter a Character (M/F)  : ");
        Scanner sc = new Scanner(System.in);
        char Gender = sc.next().charAt(0);
        switch (Gender) {
            case 'm' -> System.out.println("Gender is Male");
            case 'f' -> System.out.println("Gender is Female");
        }
     }
}