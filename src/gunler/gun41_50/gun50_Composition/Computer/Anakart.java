package gunler.gun41_50.gun50_Composition.Computer;

public class Anakart {
    private String model;
    private String ureticiFirma;
    private int ramSlot;
    private String bios;
    private int cardSlot;

    public Anakart(String model, String ureticiFirma, int ramSlot, String bios, int cardSlot) {
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.ramSlot = ramSlot;
        this.bios = bios;
        this.cardSlot = cardSlot;
    }

    public void programYukle(String programAdi){
        System.out.println(programAdi + " isimli program yükleniyor..");
    }

    public String getModel() {
        return model;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public String getBios() {
        return bios;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    @Override
    public String toString() {
        return "Anakart{" +
                "model='" + model + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", ramSlot=" + ramSlot +
                ", bios='" + bios + '\'' +
                ", cardSlot=" + cardSlot +
                '}';
    }
}
