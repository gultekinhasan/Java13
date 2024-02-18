package SelfProjects.ogrenci;

public class Ogrenci {
    private static int nextNumber = 1000; //Class variable. Every instance of this class can access this variable
    private String name;
    private int okulNo = 0;
    private static String okulAdi = "ABC Lisesi";
    private static String  okulAdresi = "Mamak/ANKARA Boğaziçi Mah. 123.Sk No:40";
    public Ogrenci(String name) {
        //   nextNumber++; //Class variable
        // okulNo++; //Instance variable
      /*  this.okulNo = nextNumber;
        this.name = name;*/
        setName(name);
        setOkulNo(++nextNumber); //Prefix assignment. First increase the value of variable then sent to the method
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public String getOkulAdresi() {
        return okulAdresi;
    }
    public static int getNextNumber(){
        return nextNumber;
    }

   // @Override
  /*  public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", okulNo=" + okulNo +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
       return okulAdi + "\n" + okulAdresi + "\n" + name + "\n"+ okulNo +"\n";
    }
}
