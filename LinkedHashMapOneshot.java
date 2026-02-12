import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapOneshot {
    public static void main(String[] args){


        //It is implementation class of Map interface
        //It follow the Insertion Order and allow only one null and multiple values because values are replaced by old value to new value
        //Not Synchronized and sligthy slower then HashMap
        //DataStructure : Hashtable + Doubly LinkedList
        //Default Capacity : 16 (Load factor 0.75 -> *2 = 32)

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();


        linkedHashMap.put(10,"Sarkar");
        linkedHashMap.put(1,"Arjun");
        linkedHashMap.put(5,"Surya");

        for(Map.Entry<Integer,String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }


        //Methods

        //getting key value
        linkedHashMap.get(101);

        //remove
        linkedHashMap.remove(101);

        //linkedHashMap.remove(101,"Arjun");

        //containsKey or Value
        linkedHashMap.containsKey(101);

        linkedHashMap.containsValue("Arjun");

        //for all keySet
        linkedHashMap.keySet();

        //for all values
        linkedHashMap.values();

        //all Entries or EntrySet
        linkedHashMap.entrySet();

        //clear
//        linkedHashMap.clear();

        linkedHashMap.isEmpty();

        linkedHashMap.size();

    }
}
