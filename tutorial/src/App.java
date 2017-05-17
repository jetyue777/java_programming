import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        ////////////////Before Java 5 ////////////////////
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String) list.get(2);
        System.out.println(fruit);

        //Generics is introduced (modern style)
        ArrayList<String> strings= new ArrayList<>();

        strings.add("cat");
        strings.add("dog");
        strings.add("bill");

        String animal = strings.get(1);
        System.out.println(animal);

        //////////////There can be more than one type argument////////////
        HashMap<Integer, String> map = new HashMap<>();


    }


}
