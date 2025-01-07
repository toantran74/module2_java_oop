package ss9_set_map.map;

import java.util.HashMap;
import java.util.Map;

public class MyMap1 {
    public static void main(String[] args) {
        String text = "Theo bác sĩ Dũng, Xuân Son hoàn toàn có thể trở lại với thể thao đỉnh cao. !";

        Map<String, Integer> map = new HashMap<>();

        // tach chuoi thanh cac tu bang khoang trắng

        String[] words = text.split(" ");

        for (String word : words) {
            word = word.toLowerCase();

            if(map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        for ( String word : map.keySet() ) {
            int count = map.get(word);
            System.out.println(word + "\t" + count);
        }

    }
}
