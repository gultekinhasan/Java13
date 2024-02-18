package gunler.gun51_62.gun59_Map;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfWord {

    public static void main(String[] args) {

        // Asagida verilen array icerisindeki Stringlerin her birinin kac defa tekrarlandigini tespit ederek
        // String in kendisi ile mapleyen bir program yaziniz
        String[] words = {"apple", "banana", "apple", "banana", "orange", "banana", "cherry"};

        System.out.println("wordCount = " + countWord(words));
    }

    public static Map<String,Integer> countWord(String[] arr){

        Map<String,Integer> wordCount = new TreeMap<>();

        for(String word : arr){
            Integer count = wordCount.get(word);
            if(count == null){
                count = 0;
            }
            wordCount.put(word, count + 1);
        }
        return wordCount;
    }
}