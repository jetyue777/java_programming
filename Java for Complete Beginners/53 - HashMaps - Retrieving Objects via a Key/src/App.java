import java.util.HashMap;
import java.util.Map;

public class App {


    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "Five");   //add element in map (lookup table)
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        String text = map.get(6); //pass key to get value

        System.out.println(map);
        //{2=Two, 4=Four, 5=Five, 6=Six, 8=Eight}


        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }

}