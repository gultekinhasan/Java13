package gunler.gun21_30.gun26_Review;

public class TelevizyonTest {
    public static void main(String[] args) {
        Televizyon televizyon1 = new Televizyon();
        televizyon1.marka = "Samsung";
        televizyon1.model = "ABX512345-50";
        televizyon1.screenSize = 50;

        Televizyon televizyon2 = new Televizyon("LG", "XXYY6787-48", 48);

        televizyon1.showInfo();
        System.out.println();
        televizyon2.showInfo();

        televizyon1.tvOnOff();
        televizyon2.tvOnOff();

        televizyon1.tvOnOff();

        televizyon2.changeChannel(16);
        televizyon2.showInfo();

        televizyon2.changeChannel(1500);
        televizyon2.showInfo();

        televizyon2.setVolume(35);
        televizyon2.showInfo();

        televizyon2.setVolume(25);
        televizyon2.showInfo();
        televizyon2.setVolumeUp();
        televizyon2.showInfo();

        televizyon2.setChannelUp();
    }
}
