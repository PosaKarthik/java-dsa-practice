import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapOneshot {
    public static void main(String[] args){

        SortedMap<Integer,String> sortedMap = new TreeMap<>();

        //It is an Interface extensds Map Interface
        //Maintains Keys in Sorting Order(Asceding)-> By default it follow the Natural order(Comparable) OR usind Comparator
        //Automatically Sorted

        sortedMap.put(3,"A");
        sortedMap.put(1,"A");
        sortedMap.put(2,"A");

        for(Map.Entry<Integer,String> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }


        //Lowest or First Key
        System.out.println(sortedMap.firstKey());

       // Highest or Last Key
        System.out.println(sortedMap.lastKey());

        //to <Key
        System.out.println(sortedMap.headMap(3));

        //from >=Key
        System.out.println(sortedMap.tailMap(2));

        //from  to <Key
        System.out.println(sortedMap.subMap(1,3));


        //Methods

        //getting key value
        sortedMap.get(101);

        //remove
        sortedMap.remove(101);

        //sortedMap.remove(101,"Arjun");

        //containsKey or Value
        sortedMap.containsKey(101);

        sortedMap.containsValue("Arjun");

        //for all keySet
        sortedMap.keySet();

        //for all values
        sortedMap.values();

        //all Entries or EntrySet
        sortedMap.entrySet();

        //clear
//        sortedMap.clear();

        sortedMap.isEmpty();

        sortedMap.size();



    }
}
