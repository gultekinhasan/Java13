package gunler.gun41_50.gun50_Composition.Computer;

public class Kasa {
    private String model;
    private String ureticiFirma;
    private String gucKaynagi;
    private Boyut boyut;

    public Kasa (String model,String ureticiFirma,String gucKaynagi,Boyut boyut){
        this.model=model;
        this.ureticiFirma=ureticiFirma;
        this.gucKaynagi=gucKaynagi;
        this.boyut=boyut;
    }

    public void calistir(){
        System.out.println("bilgisayar baslatildi");
    }

    public String getModel(){
        return model;
    }
    public String getUreticiFirma(){
        return ureticiFirma;
    }
    public String getGucKaynagi(){
        return gucKaynagi;
    }
    public Boyut getBoyut(){
        return boyut;
    }

    @Override
    public String toString() {
        return "Kasa{" +
                "model='" + model + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", gucKaynagi='" + gucKaynagi + '\'' +
                ", boyut=" + boyut +
                '}';
    }
}
