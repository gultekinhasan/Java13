package gunler.gun41_50.gun46_Inheritance_2.Bank;

public class YapiKredi extends Bank{
    public YapiKredi(double initialBalance){
        super(initialBalance);
    }

    public double getInterestRate(){
        return 9.0;
    }
}
