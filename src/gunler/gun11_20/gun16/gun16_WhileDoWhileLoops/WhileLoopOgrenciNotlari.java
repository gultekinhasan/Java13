package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;
import java.util.Scanner;
public class WhileLoopOgrenciNotlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vize1 = 0;
        int vize2 = 0;
        int ortalama = 0;
        int ogrNo = 0;

        String report = "Öğrencilerin Vize notları ve sınıf geçme notu\n";

        while (true){
            System.out.print("Öğrencinin numarasını giriniz : " );
            ogrNo = input.nextInt();
            if(ogrNo == 0){
                break;
            }
            System.out.print(ogrNo + " numaralı öğrencinin 1. Vize notu : ");
            vize1 = input.nextInt();
            System.out.print(ogrNo + " numaralı öğrencinin 2. Vize notu : ");
            vize2 = input.nextInt();

            ortalama = (vize1 + vize2) / 2;

            //Concatenation
            report += "Öğrenci no = " + ogrNo + "-" +
                    "Vize 1 = " + vize1 + ", "+ " " +
                    "Vize2 = " + vize2 +
                    " öğrencinin ortalama notu = " + ortalama + "\n";
        }
        System.out.println(report);
    }
}
