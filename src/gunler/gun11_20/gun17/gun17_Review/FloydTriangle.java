package gunler.gun11_20.gun17.gun17_Review;

public class FloydTriangle {
    public static void main(String[] args) {
        //Asagidaki sekli sayilarla ciziniz

        //        1
        //        2 3
        //        4 5 6
        //        7 8 9 10
        //        11 12 13 14 15

        int n = 5;
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
