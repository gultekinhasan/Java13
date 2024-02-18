package gunler.gun11_20.gun19.gun19_Methods1;

public class MethodWithLoop {

    public static void main(String[] args) {

        System.out.println("Main method içerisindeyim");

        for (int i=1;i<=5;i++){
            displayMessage();
            System.out.println("Main method - Döngü içerisindeyim.");
        }
        System.out.println("Son kez main method içerisindeyim.");
    }

    public static void displayMessage(){

        System.out.println("displayMessage methodu içerisindeyim");
    }
}
