import java.util.TreeMap;
import java.util.Map;

public class MainTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new TreeMap<>();
        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("메론", 10630);

        for(Map.Entry<String, Integer> entry: fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());}
    }
}