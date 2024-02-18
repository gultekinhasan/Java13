package gunler.gun31_40.gun33_MultiDimensionalArrays;
import java.util.Arrays;

public class ExerciseExamEvaluate {
    public static void main(String[] args) {
        //Answers of 8 students --- answer[8][10]
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //1.Öğrenci Cevapları
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, //2.Öğrenci Cevapları
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, //3.Öğrenci Cevapları
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, //4.Öğrenci Cevapları
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //5.Öğrenci Cevapları
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //6.Öğrenci Cevapları
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, //7.Öğrenci Cevapları
                {'D', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}  //8.Öğrenci Cevapları
        };

        //Answer Key of 10 questions
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

        System.out.println("Öğrencilerin sınav sonuçlarının değerlendirilmesi");
        System.out.println("-------------------------------------------------");
        System.out.println("Cevap anahtarı : " + Arrays.toString(keys));
        for (int ogrenci = 0; ogrenci < answers.length; ogrenci++) {
            int dogruCevapSayisi = 0;
            String yanlis = "";
            String yanlisCevap = "";
            for (int cevap = 0; cevap < answers[ogrenci].length; cevap++) {
                if(answers[ogrenci][cevap] == keys[cevap]){
                    dogruCevapSayisi++;
                }else {
                    yanlis += cevap + 1 + "-" + answers[ogrenci][cevap] + " ";
                    //    yanlisCevap += answers[ogrenci][cevap] + " ";
                }
            }
            System.out.println((ogrenci + 1) + ". Öğrencinin doğru cevap sayısı : " + dogruCevapSayisi);
            System.out.println("yanlış cevapları  = " + yanlis);
            //   System.out.println("yanlisCevap       = " + yanlisCevap);
        }
    }
}
