package gunler.gun51_62.gun59_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PlayerMap {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        ArrayList<String> players = new ArrayList<>();
        players.add("Messi");

        Map<Integer,String> playerNumbers = new LinkedHashMap<>();
        playerNumbers.put(10,"Messi");
        playerNumbers.put(7,"Ronaldo");
        playerNumbers.put(9,"Benzema");
        playerNumbers.put(11,"Bale");
       // playerNumbers.put("Mertens",10);

        System.out.println("10 numaralı formayı giyen oyuncu : " + playerNumbers.get(10));
        System.out.println(" 7 numaralı formayı giyen oyuncu : " + playerNumbers.get(7));
        System.out.println(" 9 numaralı formayı giyen oyuncu : " + playerNumbers.get(9));
        System.out.println(" 9 numaralı formayı giyen oyuncu : " + playerNumbers.get("Benzema"));
        System.out.println(" 8 numaralı formayı giyen oyuncu : " + playerNumbers.get(8));

    }
}
