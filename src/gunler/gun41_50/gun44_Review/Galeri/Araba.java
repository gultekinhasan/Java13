package gunler.gun41_50.gun44_Review.Galeri;

public class Araba {
    private String name;
    private String model;
    private String VIN;//Vehicle Identification Number
    private String plaka;

    public Araba(String name, String model, String VIN, String plaka) {
//        this.name = name;
//        this.model = model;
//        this.VIN = VIN;
//        this.plaka = plaka;

        setName(name);
        setModel(model);
        setVIN(VIN);
        setPlaka(plaka);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public String toString() {
        return getName() + "-" + getModel() + " - " + " PLAKA ;" + getPlaka() + " VIN :" +getVIN();
    }
    public String toStringFormatted(){
        String str = "";
        str = String.format("%-15s Plaka : %-15s VIN : %-15s",getName(),getPlaka(),getVIN()); // %d--> Integer Number, %s String, %n new Line, %S Uppercase String
        return str;
    }
}
