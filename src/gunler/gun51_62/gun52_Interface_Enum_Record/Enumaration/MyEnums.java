package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public class MyEnums {
    //We collect all enum types in a class tha we may use our project

    //Enum types for Color
    enum Colors implements Enumerable {
        RED, BLUE, GREEN, YELLOW;

        @Override
        public String getName() {
            return name();
        }
    }

    //Enum types for Models
    enum Models implements Enumerable {
        SEDAN("4 doors"), MINIVAN("5 doors"), SPORT("2 doors");
        private String desc;

        //Constructor
        Models(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String getName() {
            return name();
        }
    }

    //Enum types for Brands
    enum Brands implements Enumerable {
        MERCEDES, FORD, HONDA, TOYOTA;

        @Override
        public String getName() {
            return name();
        }

    }

    //Enum types for EngineTypes
    enum EngineType implements Enumerable {
        DIESEL, PETROL, ELECTRIC, HYBRID;

        @Override
        public String getName() {
            return name();
        }
    }

    //Every enum class which implements the interface has to implement the getName() method
    //this interface can be also used for TAGing.
    interface Enumerable {
        //Every enum class which implements Enumerable interface has to implemet getName() method
        String getName();
    }

    //Enumarable interface'ini implement eden bütün enum type lar için ortak bir validation metodu
    public static boolean isValid(Enumerable[] enumarable, String str) {
        for (Enumerable enumType : enumarable) {
            if (enumType.getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
