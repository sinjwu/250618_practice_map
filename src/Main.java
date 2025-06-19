import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("메론", 10630);

        for (Map.Entry<String, Integer> entry: fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue() + " won.");
        }
        for(int fruitPrice: fruitPrices.values()) {
            System.out.println(fruitPrice);
        }
        System.out.println(fruitPrices.size());

        int sum = 0; //가격의 평균 구하기
        for (int fruitprice : fruitPrices.values()) {
            sum += fruitprice;
        }
        System.out.println("Average Price: " + sum/fruitPrices.size());
        System.out.println(fruitPrices.containsKey("사과"));
        System.out.println(fruitPrices.containsKey("두리안"));
        System.out.println(fruitPrices.containsValue(17980));
        System.out.println(fruitPrices.containsValue(50000));

        System.out.println(fruitPrices.getOrDefault("사과",500));
        System.out.println(fruitPrices.getOrDefault("사과",20000));
        System.out.println(fruitPrices.getOrDefault("대추야자",500));

        fruitPrices.replace("사과", 10000);
        fruitPrices.remove("메론");

        for(Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        for(String key: fruitPrices.keySet()) {
            System.out.println(key);
        }
    }
}