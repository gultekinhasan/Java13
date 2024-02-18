package gunler.gun11_20.gun19.gun19_Methods1;

public class DeepDeeper {
    public static void main(String[] args) {

        System.out.println("In main method");
        deep();
        System.out.println("Back to main method");
        deeper();
        System.out.println("Back to main method");

    }

    public static void deep(){
        System.out.println("In deep method");
        deeper();
        System.out.println("Back to deep method");
    }

    public static void deeper(){
        System.out.println("In deeper method");
    }
}
