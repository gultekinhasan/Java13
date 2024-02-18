package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public class Araba {
    // private String brand;
    private Brands brand;
    private Colors color;

    public Araba(Brands brand, Colors color) {
        this.brand = brand;
        this.color = color;

    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                '}';
    }
}
