package gunler.gun11_20.gun11.gun11ControlFlowStatement2;

 public class UnPaketi {
     public static void main(String[] args) {
         // Elimizdeki belli sayida 5 kiloluk ve 1 kiloluk unpaketleri mevcut
         // Musterinin talep ettigi kilo sayida paketi verip veremeyecegimizi tespit eden bir program yaziniz

                int beslikPaketSayisi = 3;
                int birlikPaketSayisi = 4;
                int talep = 19;
                boolean karsilanabilirmi = true;

                if(beslikPaketSayisi * 5 >= talep){
                    if(birlikPaketSayisi >= talep%5){
                        karsilanabilirmi = true;
                    }
                }else{
                    if(birlikPaketSayisi >= talep - beslikPaketSayisi * 5){
                        karsilanabilirmi = true;
                    }
                }

                if(karsilanabilirmi){
                    System.out.println(talep + " kilo talebiniz karsilanabilir");
                }else{
                    System.out.println(talep + " kilo talebiniz karsilanamaz");
                }

            }
        }


