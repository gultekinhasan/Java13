package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public class MonthsEnumTest {
    public static void main(String[] args) {
        MonthsEnum monthsEnum = MonthsEnum.APRIL;

        System.out.println("Name of the month    : " + monthsEnum.name());
        System.out.println("Numbers of the month : " + monthsEnum.getNumbersOfMonth());
        System.out.println("Season of the month  : " + monthsEnum.getSeason());
        System.out.println();

        for (MonthsEnum month: MonthsEnum.values()){
            System.out.println("Name of the month    : " + month.name());
            System.out.println("Numbers of the month : " + month.getNumbersOfMonth());
            System.out.println("Season of the month  : " + month.getSeason());
            System.out.println();
        }

        monthsEnum = MonthsEnum.FEBRUARY;
        switch (monthsEnum){
            case JANUARY -> System.out.println("KIŞ ayıdır");
            case FEBRUARY -> System.out.println("KIŞ ayıdır");
            case MARCH -> System.out.println("Bahar ayıdır");
        }
    }
}
