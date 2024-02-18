package exercises.gun29;

public class homework4 {
    //Write a program to count the number of occurrences for specific char
    //String word = “Abcdaorwakocoeeca”
    //Number of ‘a’ in this string is: 3
    public static int spesific(String word,char target){

        int count=0;
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)==target){
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String word = "Abcdaorwakocoeeca";
        char target ='a';
        System.out.println(spesific(word,target));
    }
}
