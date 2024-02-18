package gunler.gun41_50.gun49_FinalKeyword_VarMethodHiding.FinalKeyword;
public class FinalVariables {

    public final int MAX_SPEED = 320;

//     final int MIN_CAPACITY;
//     MIN_CAPACITY = 1;

    final int MAX_VELOCITY;
    final int MAX_WEIGHT;



    static final int MAX_HEIGHT = 200;
    final static int MAX_LEVEL;

    // static final int MIN_HEIGHT;
    // MIN_HEIGHT = 250;

//    public FinalVariables(){
//        MAX_VELOCITY = 25;
//    }

    public FinalVariables(int number){
        MAX_VELOCITY = number;
        // MIN_HEIGHT = 45;
    }

    {
        MAX_WEIGHT = 100;

    }

    static{
        MAX_LEVEL = 5;
    }

    public static void main(String[] args) {

        final int MAX_CAPACITY;
        MAX_CAPACITY = 200;

//        Math.PI = 3.14; // Error

        final double PI = 3.14;

        final long TCKimlikNo;
        TCKimlikNo = 45745745457l;
        // TCKimlikNo++;

        FinalVariables obj = new FinalVariables(5);
        System.out.println(obj.MAX_VELOCITY);
        System.out.println("MAX_SPEED = " + obj.MAX_SPEED);
        System.out.println("MAX_HEIGHT = " + MAX_HEIGHT);
    }
}