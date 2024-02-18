package gunler.gun11_20.gun19.gun19_Methods1;

public class HierarchialMethodCall {
    public static void main(String[] args) {

        System.out.println("Main method");
        displayMessage();
        System.out.println("Back to Main method");
    }

    public static void displayMessage(){
        System.out.println("Hello World");
        calculation();
        System.out.println("Back to displayMessage method");
    }

    public static void calculation(){
        System.out.println(10*5/2+1);
    }
}
