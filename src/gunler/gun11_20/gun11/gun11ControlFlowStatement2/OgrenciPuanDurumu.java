package gunler.gun11_20.gun11.gun11ControlFlowStatement2;


    public class OgrenciPuanDurumu {

        public static void main(String[] args) {

            int puan = 76;
            char not = ' ';

            if(puan >= 0 && puan <=100){
                if(puan >= 90){
                    not = 'A';
                }else if(puan >= 80){
                    not = 'B';
                }else if(puan >= 70){
                    not = 'C';
                }else if(puan >= 60){
                    not = 'D';
                }else if(puan >= 50){
                    not = 'E';
                }else {
                    not = 'F';
                }
            }else{
                System.out.println("Hatali bir puan girdiniz....");
            }

            if(puan >= 0 && puan <=100) {
                System.out.println("puan = " + puan);
            }

            System.out.println("not = " + not);
        }
    }


