package gunler.gun31_40.gun40_Encapsulation_1;

public class SimpleGetterAndSetter {
    //default(no modifier) access modifier--- can be accessed by classes in same package
    //private-restricted access-- only class members can access
    //Data members--> must be private
    private int number;

    //Constructors
    public SimpleGetterAndSetter() {
        //this.number = 0;
        setNumber(0);
    }

    public SimpleGetterAndSetter(int number) {
        setNumber(number);

        //Constructor'da kural belirlemek/kontrol yapmak yerine ilgili setter metodunda kural belirlemek/kontrol yapmak daha doğrudur.
      /*  if (number > 0) {
            this.number = number;
        } else{
            System.out.println("Number değişkeni 0'dan küçük olamaz!!");
            this.number = 0;
        }*/
    }

    //Method-Accessor(get) and Mutator(set)

    // Accessor(get)---getter method
    public int numberDegerOku() {//bir getter metod ancak isimlendirme standardına uygun değil
        return number;
    }

    public void numberDegerGuncelle(int number) { //bir setter metod ancak isimlendirme standardına uygun değil
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Number değişkeni 0'dan küçük olamaz!!");
            this.number = 0;
        }
    }

    //getter method--> returns the value of variable
    public int getNumber() {
        return number;
    }

    //Mutator(set) --- //getter method--> sets(updates) the value of variable
    public void setNumber(int number) {
        //this.number = number; // herhangi bir kontrol yapmadan doğrudan değişkene değer atar
        //Yukarıddaki gibi Doğrudan değer atamak yerine bazı kontroller sonrası değer atamak için aşağıdaki kontrolleri yazdık

        //Değişkene doğrudan değer atamak yerine belirli bir kurala uygun olup olmadığına karar verip değer atamasını bu karara göre yaptık
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Number değişkeni 0'dan küçük olamaz!!");
            this.number = 0;
        }
    }

    @Override
    public String toString() {
        return "SimpleGetterAndSetter{" +
                "number=" + number +
                '}';
    }
}
