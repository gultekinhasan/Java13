package gunler.gun11_20.gun17.gun17_Review;

public class EskenarUcgen {

    public static void main(String[] args) {



        int r = 5;

        for(int i=0; i<r; i++){  // sutun
            for(int k=r; k>i; k--){  // satir / bosluk
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){ // satir / yildiz
                System.out.print(" *");
            }
            System.out.println();
        }




        for(int i=0; i<r; i++){  // sutun
            for(int k=r; k>i; k--){  // satir / bosluk
                System.out.print(" ");
            }
            for(int j=0; j<=i*2; j++){ // satir / yildiz
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
