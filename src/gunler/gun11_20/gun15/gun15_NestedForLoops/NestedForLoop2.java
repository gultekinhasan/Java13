package gunler.gun11_20.gun15.gun15_NestedForLoops;

public class NestedForLoop2 {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            System.out.println("Dis dongu: " + i);
            for(int j=1; j<=5; j++){
                System.out.println("Ic dongu: " + j);
                for(int k=1; k<=5; k++){
                    System.out.println("En ic dongu: " + k);
                }
                System.out.println("--------------");
            }
            System.out.println("///////////////\n");
        }
    }
}
