package gunler.gun11_20.gun11.gun11ControlFlowStatement2;

public class GeometricShape {
    public static void main(String[] args) {

        //verilen kenar sayısından şeklin hangi geometrik şekil olduğunu bir program yazınız.
        // 3 ve 6 arası kenar sayısı kabul et

        int kenarSayisi = 8;

        String Sekil = "";
        if (kenarSayisi>=3 && kenarSayisi<=6){
            if(kenarSayisi==3){
                Sekil = "Ucgen";
            } else if (kenarSayisi==4) {
                Sekil = "kare veya dikdörtgen";
            }  else if (kenarSayisi==5) {
                Sekil = "besgen";
            } else if (kenarSayisi==6) {
                Sekil = "altgen";
            }
            System.out.println("Sekil = " + Sekil);

        }else{
            System.out.println("Geçersiz Sekil.");
        }

    }
}
