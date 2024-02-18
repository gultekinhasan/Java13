package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public class MyEnumsTest {
    public static void main(String[] args) {
        MyEnums.Brands brand = MyEnums.Brands.MERCEDES;
        MyEnums.Models model = MyEnums.Models.SEDAN;
        MyEnums.Colors color = MyEnums.Colors.RED;
        MyEnums.EngineType engineType = MyEnums.EngineType.HYBRID;

        System.out.println("brand.name() = " + brand.name());
        System.out.println("model.name() = " + model.name());
        System.out.println("color.name() = " + color.name());
        System.out.println("engineType.name() = " + engineType.name());

        //Checking validation
        boolean isValid;
        isValid = MyEnums.isValid(MyEnums.Colors.values(),"BLUE");
        System.out.println("isValid = " + isValid);

        isValid = MyEnums.isValid(MyEnums.Brands.values(),"ŞAHİN");
        System.out.println("isValid = " + isValid);
    }
}
