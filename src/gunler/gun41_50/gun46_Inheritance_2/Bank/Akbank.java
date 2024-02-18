package gunler.gun41_50.gun46_Inheritance_2.Bank;

public class Akbank extends Bank{
    public Akbank(double initialBalance){
        super(initialBalance);
    }

    public double getInterestRate(){
        return 7.0;
    }
}
