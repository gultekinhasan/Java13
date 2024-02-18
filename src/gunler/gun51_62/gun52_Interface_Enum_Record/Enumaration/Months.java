package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public enum Months {
    JANUARY,FEBRUARY,MARCH,APRIL;

    public static boolean isValidMonth(String  strMonth){
        for (Months month : values()){
            if(month.name().equalsIgnoreCase(strMonth)){
                return true;
            }
        }
        return false;
    }
}
