import java.util.Map;
import java.util.TreeMap;

public class TreeMapOneshot {
    public static void main(String[] args){


        //It is implementation class for Sorted Interface
        //It maintain Natural Sorting order(Comparable) for Keys
        //DataStructure : Red-Black Tree O (log n) -> Self-Blancing BinarySearchTree

        TreeMap <Integer,String> treeMap = new TreeMap<>();

        treeMap.put(3,"Ips");
        treeMap.put(1,"Arjun");
        treeMap.put(2,"Sarkar");

        for(Map.Entry<Integer,String>  entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        //Lowest or First Key
        System.out.println(treeMap.firstKey());

        // Highest or Last Key
        System.out.println(treeMap.lastKey());

        //to <Key
        System.out.println(treeMap.headMap(3));

        //from >=Key
        System.out.println(treeMap.tailMap(2));

        //from  to <Key
        System.out.println(treeMap.subMap(1,3));


        //Methods

        //getting key value
        treeMap.get(101);

        //remove
        treeMap.remove(101);

        //treeMap.remove(101,"Arjun");

        //containsKey or Value
        treeMap.containsKey(101);

        treeMap.containsValue("Arjun");

        //for all keySet
        treeMap.keySet();

        //for all values
        treeMap.values();

        //all Entries or EntrySet
        treeMap.entrySet();

        //clear
//        treeMap.clear();

        treeMap.isEmpty();

        treeMap.size();


    }
}
