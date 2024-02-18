package gunler.gun41_50.gun46_Inheritance_2.Bank;

public class GarantiBank extends Bank{
    public GarantiBank(double initialBalance){
        super(initialBalance);
    }

    public double getInterestRate(){
        return 8.0;
    }
}
