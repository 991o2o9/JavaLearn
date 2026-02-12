import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String,Double> map = new HashMap<>();

        map.put("Bread", 3.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.35);

        map.put("Worm",0.20);

        System.out.println(map);

//        System.out.println(map.get("Banana"));

        System.out.println(map.containsKey("Worm"));

//        for (String key : map.keySet()){
//            System.out.println(key+ " : $" + map.get(key));
//        }
        for (Map.Entry<String,Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : $" + entry.getValue());
        }
    }
}