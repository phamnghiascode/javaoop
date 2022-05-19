import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class app88 {
    public static void main(String[] args){
        HashMap<String, String> hashMapCity = new HashMap<>();
        
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Ho Chi Minh city");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("QNg: " + hashMapCity.get("QNg"));
        System.out.println("NT: " + hashMapCity.get("NT"));
        if(hashMapCity.containsValue("Ho Chi Minh city")){
            System.out.println("Co thanh pho HCM trong hashMapCity");
        }

    }
}
