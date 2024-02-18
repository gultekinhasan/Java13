package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class LabaledForLoop {
    public static void main(String[] args) {
        int hedefSayi =25;
outer:       for (int i=1;i<=10;i++){
            System.out.println("i = " + i);
            for (int j =1;j<=5;j++){
                System.out.println("   j = " + j);
                if (i * j == hedefSayi){
                    System.out.println("Hedef sayıya ulaşıldı, Hedef Sayı = " + hedefSayi);
                    break outer;
                }
            }
        }
        System.out.println("Çalışma sona erdi..");
    }
}
