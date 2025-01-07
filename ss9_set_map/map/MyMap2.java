package ss9_set_map.map;



import java.util.*;

public class MyMap2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toan", "Toan", "Thuong", "Huyen","Danh","Hang");

        Map<String, Integer> nameMap = new HashMap<>();

        for (String s : list) {
            nameMap.put(s, nameMap.getOrDefault(s, 0) + 1); // neu name da ton tai thi gtri tang len 1, neu chua thi dat thanh 1
        }

        System.out.println("Tên xuất hiện duy nhất 1 lần: ");
        for(String s : nameMap.keySet()){
            if(nameMap.get(s) == 1){
                System.out.println(s);
            }
        }

        System.out.println("Tên xuaát hiện nhiều lần: ");
        for(String s : nameMap.keySet()){
            if(nameMap.get(s) > 1){
                System.out.println(s);
            }
        }
    }
}
