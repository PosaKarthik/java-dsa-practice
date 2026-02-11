import java.util.Map;
import java.util.HashMap;

public class MapOneshot {
    public static void main(String[] args){

        //Map is ans interface used to store data in Key-Value format
        //One key value pair is called Entry or EntrySet
        //In map Key should be unique and value can be duplicate, if Key duplucate it replace old value data to new value data


        Map<Integer,String> map = new HashMap<>();

        //add
        map.put(101,"Arjun");
        map.put(102,"Sarkar");
        map.put(103,"Arjun Sarkar");

        System.out.println(map);

        //Methods

        //getting key value
        map.get(101);

         //remove
        map.remove(101);

        //map.remove(101,"Arjun");

        //containsKey or Value
        map.containsKey(101);

        map.containsValue("Arjun");

        //for all keySet
        map.keySet();

        //for all values
        map.values();

        //all Entries or EntrySet
        map.entrySet();

        //clear
//        map.clear();

        map.isEmpty();

        map.size();

    }
}
