import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Map;


public class Sem5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        while (map.size() < 10) {
            String key = String.valueOf(Words.values()[new Random().nextInt(Words.values().length)]);
            map.put(key, (int) key.charAt(0));
        }
        LinkedHashMap<String, Integer> mapLinked = new LinkedHashMap<>();
// System.out.println("arr = " + Arrays.toString(arr));
// ArrayList<Integer> arrayList = new ArrayList<>();
// Arrays.stream(map.values().toArray()).forEach(n -> arrayList.add((Integer) n));
// arrayList.sort(Comparator.naturalOrder());
// for (Integer num : arrayList) {
// for (Map.Entry<String, Integer> el : map.entrySet()) {
// if (el.getValue() == num)
// mapLinked.put(el.getKey(), num);
// }
// }
// System.out.println("mapLinked = " + mapLinked);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(map.size() / 2)
                .forEach(n -> mapLinked.put(n.getKey(), n.getValue()));
        System.out.println("mapLinked = " + mapLinked);
        mapLinked.forEach((k, v) -> System.out.print(k + " = " + v + ", "));
    }

}
