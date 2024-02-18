package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class LabeledWhileLoop {
    public static void main(String[] args) {
        int i;

outer:      do {
            i=8;
          inner:  while (true){
                System.out.println("i = " + i--);
                if (i==4){
                    break outer;
                }
                System.out.println("While Loop");
            }

           // System.out.println("Do While Loop");
        }while (true);
        System.out.println("out of do while loop");
    }
}
