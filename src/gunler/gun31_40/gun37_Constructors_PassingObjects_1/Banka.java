package gunler.gun31_40.gun37_Constructors_PassingObjects_1;
import java.util.ArrayList;

public class Banka {
    String name;
    String address;
    int hesapNo;
    ArrayList<Musteri> musteriler;

    public Banka(){
        //Default değerleri-initial values
        name = "isimsiz banka";
        address  ="Adres bilgisi yok";
        hesapNo = 1000;
        musteriler = new ArrayList<>(); //creates empty list of Musteri
    }
    public Banka(String name, String address, int hesapNo){
        this.name = name;
        this.address = address;
        this.hesapNo = hesapNo;
        this.musteriler = new ArrayList<>(); //creates empty list of Musteri
    }

    public void musteriEkle(Musteri musteri){ //Passing objects to method--- Musteri ---> musteri
        hesapNo++;
        musteri.hesapNo = hesapNo;
        musteriler.add(musteri);
        System.out.println(musteri.name  + " isimli müşteri için " + musteri.hesapNo + " hesap no ile banka hesabı açıldı");
    }


    public void paraYatir(Musteri musteri, double miktar){
        if(miktar > 0){
            musteri.bakiye += miktar;
        }
    }
    public void paraCek(Musteri musteri, double miktar){
        if (miktar > 0 && musteri.bakiye >= miktar){
            musteri.bakiye -= miktar;
        }else {
            System.out.println("Hesabınızda yeterli bakiye yok!!!");
            System.out.println("En fazla " + musteri.bakiye + " TL miktarında para çekebilirsiniz.");
        }
    }

    public void findByHesapNo(int hesapNo){
        System.out.println("Hesap numarasından Muşteri bulma metodu");
        System.out.println("---------------------------------------");
        boolean isFound = false;

        for (Musteri musteri : musteriler){
            if(musteri.hesapNo == hesapNo){
                isFound = true;
                musteri.showInfo();
                break;
            }
        }
        if(!isFound){ //(isFound == false)
            System.out.println(hesapNo + " hesap numaralı bir müşteri yok!!!");
        }
    }
    public void finfByName(String name){
        System.out.println("İsim'den Muşteri bulma metodu");
        System.out.println("-----------------------------");
        int count = 0;
        for (Musteri musteri:musteriler){
            //.equals() --> for exact matching
            //.equalsIgnoreCase() --> ignore case
            //.contains() --> contains
            //.startsWith() --> startswith
            if (musteri.name.startsWith(name)){
                count++;
                musteri.showInfo();
                System.out.println("------------------------------");
            }

        }
        if (count == 0){
            System.out.println(name + " isminde bir müşteriye rastlanmadı!!!");
        }else System.out.println(count + " adet " + name + " isminde müşteri bulundu.");
    }
    public void musteriListe(){
        for (Musteri musteri : musteriler){
            musteri.showInfo();
            System.out.println("-------------------------------------");
        }
    }

}
