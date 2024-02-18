package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public enum Marriage {
    SINGLE,MARRIED,WIDOW;

    public static boolean isValidMarriage(String marriage) {
        for (Marriage m : Marriage.values()){
            if(m.name().equalsIgnoreCase(marriage)){
                return true;
            }
        }
        return false;
    }
}
