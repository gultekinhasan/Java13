package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public enum MonthsEnum {
    JANUARY(1,"Winter"),
    FEBRUARY(2,"Winter"),
    MARCH(3,"Spring"),
    APRIL(4,"Spring"),
    MAY(5,"Spring"),
    JUNE(6,"Summer"),
    JULY(7,"Summer"),
    AUGUST(8,"Summer"),
    SEPTEMBER(9,"Autumn"),
    OCTOBER(10,"Autumn"),
    NOVEMBER(11,"Autumn"),
    DECEMBER(12,"Winter");

    private int numbersOfMonth;
    private String season;

    MonthsEnum(int numbersOfMonth,String season){
        this.numbersOfMonth = numbersOfMonth;
        this.season = season;
    }

    public int getNumbersOfMonth() {
        return numbersOfMonth;
    }

    public void setNumbersOfMonth(int numbersOfMonth) {
        this.numbersOfMonth = numbersOfMonth;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
