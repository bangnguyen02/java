import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("Qn", "Quang Nam");

        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Ho Chi Minh");

        System.out.println("danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("QNg" + hashMapCity.get("QNg"));

        System.out.println("NT" + hashMapCity.get("Nt"));

        if (hashMapCity.containsValue("Thanh pho Ho Chi Minh")) {
            System.out.println("Co thanh pho Ho Chi Minh trong hashMapCity");
        }
    }
}