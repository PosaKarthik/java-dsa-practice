import java.util.Map;
import java.util.HashMap;

public class HashMapOneshot {
    public static void main(String[] args){

        /*HashMap internally uses an array of buckets.
        Each bucket stores nodes containing key, value, hash, and next reference. \
        When we insert a key-value pair, hashCode() of key is calculated to determine bucket index.
        If collision occurs, elements are stored in a LinkedList,
        and in Java 8 if bucket size exceeds 8, it converts into a Red-Black Tree for better performance.
        Default capacity is 16 and load factor is 0.75.
                When threshold exceeds, it resizes by doubling capacity.*/


        //before java8 -> O(n)
        //after java8->O(log n)
        //It is implemttaion class for Map interface
        //DataStructure : hashTable
        //It is used Store data in Key-Value Format


        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(101,"Arjun Sarkar");
        hashMap.put(102,"Surya");
        hashMap.put(103,"Anjali");

        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "  -  "+entry.getValue());
        }

        System.out.println(hashMap);


        //Methods

        //getting key value
        hashMap.get(101);

        //remove
        hashMap.remove(101);

        //hashMap.remove(101,"Arjun");

        //containsKey or Value
        hashMap.containsKey(101);

        hashMap.containsValue("Arjun");

        //for all keySet
        hashMap.keySet();

        //for all values
        hashMap.values();

        //all Entries or EntrySet
        hashMap.entrySet();

        //clear
//        hashMap.clear();

        hashMap.isEmpty();

        hashMap.size();

    }
}
