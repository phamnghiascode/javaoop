import java.util.HashMap;
public class app86 {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSLT", "Cơ sở lập trình");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "java");
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
