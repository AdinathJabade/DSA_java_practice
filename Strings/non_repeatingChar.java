import java.util.LinkedHashMap;

public class non_repeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
