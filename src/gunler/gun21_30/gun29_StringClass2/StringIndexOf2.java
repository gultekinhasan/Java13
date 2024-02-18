package gunler.gun21_30.gun29_StringClass2;

public class StringIndexOf2 {
    public static void findIndexOfWord(String targetStr, String searchStr){
        int count = 0;
        int index = targetStr.indexOf(searchStr);
        System.out.println("Cümle         : " + targetStr);
        System.out.println("Aranan kelime : " + searchStr);
        while (index > -1){
            count++;
            System.out.println(count + ". index : " + index);
            index = targetStr.indexOf(searchStr,index+1);
        }
        if(count > 0){
            System.out.println(searchStr + " kelimesi cümle içerisinde " + count + " adet vardır.");
        }else System.out.println(searchStr + " cümle içerisinde yoktur.");
    }

    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        String searchStr = "planet";

        findIndexOfWord(myStr,searchStr);
    }
}
