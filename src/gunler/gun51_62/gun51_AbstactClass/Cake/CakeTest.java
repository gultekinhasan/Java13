package gunler.gun51_62.gun51_AbstactClass.Cake;

public class CakeTest {
    public static void main(String[] args) {
//        SadeKek sadeKek = new SadeKek(300,100,4,2,1,150);
//        sadeKek.karistir();
//        System.out.println();
//
//        VanilyaliKek vanilyaliKek = new VanilyaliKek(300,100,4,2,1,150);
//        vanilyaliKek.setVanilya(15);
//        vanilyaliKek.karistir();
//        System.out.println();
//        vanilyaliKek.pisir();
//        System.out.println();

        CikolataliKek cikolataliKek = new CikolataliKek(300,100,4,2,1,150);
        cikolataliKek.setCikolata(125);
        cikolataliKek.pisir();
        cikolataliKek.karistir();
        cikolataliKek.pisir();

    }
}
