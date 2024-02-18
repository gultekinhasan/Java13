package exercises.gun17;

public class homeWork1 {
    public static void main(String[] args) {
        int r=5;

        for(int i=0; i<r; i++){  // sutun
            for(int k=r; k>i; k--){// satir / bosluk
                System.out.print(" ");
            }
            for(int j=0; j<=i*2; j++){ // satir / yildiz
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=5; i>=1; i--) {  // sutun
            for (int k = 0; k <= 4; k++) {// satir / bosluk
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 -1; j++) { // satir / yildiz
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
