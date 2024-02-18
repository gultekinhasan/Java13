package SelfProjects.HukukBurosu;

public class Muvekkil {

    /*
       - Muvekkil adında bir class olusturun  +
       - Her muvekkilin adi, soyadi, yasi, tel No, adresi, dosyasının konusu ve dosya numarası tanımlansın.  +
       - Ceza Dosya No 1000'den başlasın.+
       - Hukuk Dosya No 500-1000 arası olsun. +

       - getMuvekkilByDosyaNo () adında bir method oluştur. Bu method Dosya No'dan muvekkil bilgilerini getirsin
       - getMuvekkilByDosyaKonusu () adında bir method oluştur. Bu method Dosya Konusu'ndan muvekkil veya muvekkillerin bilgilerini getirsin +

       - Kaç muvekkil eklendiği bilgisi alınabilsin.(static)
        */


    private static int muvekkilID =0;
    private int muvekkilNo;
    private String name;
    private String lastName;
    private int age;
    private String mobileNo;
    private String address;
    private String fileType;

    private static int criminalCaseID=1000;
    private static int civilCaseID=500;
    private int criminalCaseNumber;
    private int civilCaseNumber;


    public Muvekkil( String name, String lastName, int age, String mobileNo, String address,String fileType) {
        muvekkilID++;
        setMuvekkilNo(muvekkilID);
        setName(name);
        setLastName(lastName);
        setAge(age);
        setMobileNo(mobileNo);
        setAddress(address);
        setFileType(fileType);

        criminalCaseID++;
        civilCaseID++;
        setCriminalCaseNumber(criminalCaseID);
        setCivilCaseNumber(civilCaseID);
    }

    public static int getMuvekkilID() {
        return muvekkilID;
    }

    public static void setMuvekkilID(int muvekkilID) {
        Muvekkil.muvekkilID = muvekkilID;
    }

    public int getMuvekkilNo() {
        return muvekkilNo;
    }

    public void setMuvekkilNo(int muvekkilNo) {
        this.muvekkilNo = muvekkilNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public static int getCriminalCaseID() {
        return criminalCaseID;
    }

    public static void setCriminalCaseID(int criminalCaseID) {
        Muvekkil.criminalCaseID = criminalCaseID;
    }

    public static int getCivilCaseID() {
        return civilCaseID;
    }

    public static void setCivilCaseID(int civilCaseID) {
        Muvekkil.civilCaseID = civilCaseID;
    }

    public int getCriminalCaseNumber() {
        return criminalCaseNumber;
    }

    public void setCriminalCaseNumber(int criminalCaseNumber) {
        this.criminalCaseNumber = criminalCaseNumber;
    }

    public int getCivilCaseNumber() {
        return civilCaseNumber;
    }

    public void setCivilCaseNumber(int civilCaseNumber) {
        this.civilCaseNumber = civilCaseNumber;
    }

    @Override
    public String toString() {
        return
                "{ Muvekkil No = " + muvekkilNo + ", name = " + name + '\'' + ", lastName= " + lastName + '\'' +"\n"+
                "age = "  + age +", mobileNo ='" + mobileNo + '\'' +", address='" + address + '\'' +"\n"+
                "fileType='" + fileType + '\'' + ", criminalCaseNumber=" + criminalCaseNumber +  ", civilCaseNumber=" + civilCaseNumber +'}'+"\n"+"\n";
    }
}
