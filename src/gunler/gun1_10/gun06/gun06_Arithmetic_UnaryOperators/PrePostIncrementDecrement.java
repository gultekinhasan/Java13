package gunler.gun1_10.gun06.gun06_Arithmetic_UnaryOperators;
public class PrePostIncrementDecrement {

    public static void main(String[] args) {

        int x = 5;
        int y = x++; // x in degeri assign edildigi esnada artis henuz uygulanmadigi icin x 5 olarak assign ediliyor, deger sonra arttiriliyor

        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 5
    }
}

