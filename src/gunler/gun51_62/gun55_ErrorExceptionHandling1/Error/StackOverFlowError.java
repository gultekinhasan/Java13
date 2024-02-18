package gunler.gun51_62.gun55_ErrorExceptionHandling1.Error;

public class StackOverFlowError {
    static int counter = 0;

    public static void main(String[] args) {
        birMetod();
    }

    public static void birMetod() {
        counter++;
        System.out.println(counter);
        birMetod();
    }
}
