package gunler.gun51_62.gun51_AbstactClass.Vehicle;

public abstract class Vehicle {
    //instance variables
    private String brand;
    private String model;
    private int year;
    private String color;

    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void drive();
    public abstract void turnRight(int angle);
    public abstract void turnLeft(int angle);


    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
