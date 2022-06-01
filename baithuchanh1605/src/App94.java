import java.util.LinkedHashMap;
import java.util.Set;

import javax.sound.sampled.LineListener;

public class App94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(2, "PHP");
        linkedHashMap.put(4, "Python");

        System.out.println("Before remove: ");
        show(linkedHashMap);

        linkedHashMap.remove(2);

        System.out.println("After remove: ");
        show(linkedHashMap);
    }
    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = LineListener.keySet();
        for (Integer key: keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}