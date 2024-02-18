package gunler.gun11_20.gun20.gun20_Methods2;

public class OtherTypesOfArgument {
    public static void main(String[] args) {


       // passing String value directly
        displayName("Ayşe");

        //passing String via variable
        String name = "Ahmet";
        displayName(name);

        //passing boolean value
        climbEverst(true);

        boolean isHealty =false;
        climbEverst(isHealty);


    }
    public static void displayName(String name){
        System.out.println("your name is : " + name);
    }
    public static void climbEverst(boolean isHealty){
        if (isHealty){
            System.out.println("Yes, you're eligible to climb Everest. ");
        }else{
            System.out.println("No, you're not eligible to climb Everest. ");
        }
    }
}
