package gunler.gun21_30.gun26_Review;

public class Televizyon {
    String marka;
    String model;
    int screenSize;
    int volumeLevel = 5;
    int channel = 1;
    boolean isOn = false;

    public Televizyon(){

    }
    public Televizyon(String marka, String model, int screenSize){
        this.marka = marka;
        this.model = model;
        this.screenSize = screenSize;
    }

    public void tvOnOff(){
        if(isOn){
            isOn = false;
            System.out.println(marka + " marka " + model + " model TV kapatıldı.");
        }else {
            isOn = true;
            System.out.println(marka + " marka " + model + " model TV açıldı.");
        }
    }

    public void changeChannel(int channel){
        if(isOn && channel >=0 && channel <=250) {
            this.channel = channel;
            System.out.println("Kanal " + channel + " olarak değiştirildi.");
        } else System.out.println("Televizyon kapalı olduğundan veya uygun bir kanal girmediğinizden kanal değiştiremezsin!!!");
    }

    public void setVolume(int volume){
        if(isOn){
            this.volumeLevel = volume;
        }
    }
    public void setVolumeUp(){
        if(isOn){
            this.volumeLevel++;
        }
    }
    public void setVolumeDown(){
        if(isOn) this.volumeLevel--;
    }
    public void setChannelUp(){
        if(isOn) {
            System.out.println("Gösterilen kanal---> " + this.channel);
            this.channel++;
            System.out.println("Kanalı " + channel + " olarak değiştirdim");
        }
    }
    public void setChannelDown(){
        if(isOn) this.channel--;
    }
    public void showInfo(){
        System.out.println("Marka        : " + marka);
        System.out.println("Model        : " + model);
        System.out.println("Screean Size : " + screenSize);
        System.out.println("Volume level : " + volumeLevel);
        System.out.println("Cahannel     : " + channel);
        System.out.println("Is on ?      : " + isOn);
    }
}
