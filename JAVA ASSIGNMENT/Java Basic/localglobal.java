// 5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables
public class localglobal {
    int globalvar = 100;  

    public void show() {
        int localvar = 50;  

        System.out.println("Global variable " + globalvar);
        System.out.println("Local variable" + localvar);
    }

    public static void main(String[] args) {
        localglobal obj = new localglobal();
        obj.show();
    }
}
        
    

