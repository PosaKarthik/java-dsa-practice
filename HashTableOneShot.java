import java.util.Map;
import java.util.Hashtable;


public class HashTableOneShot {
    public static void main(String[] args){


        //It is implementation class for Map interface and its a legacy class(java 1.0 v)
        //Default Capacity :11 (100% -> *2)=22
        //DataStructure : Hashtable(Array+LinkedList)
        //It is Synchronized(Thead-safe) and NOT allow nulls
        //Slightly slower than HashMap and also we Synchronized version of HashMap
        //Nowadays we use(replaced by) ConcurrentHashMap


        Hashtable<Integer,String> hashTable = new Hashtable<>();

        hashTable.put(21,"Dragon");
        hashTable.put(24,"Salaar");
        hashTable.put(25,"Java");

        for(Map.Entry<Integer,String> entry : hashTable.entrySet()){
            System.out.println(entry.getKey()+" - "+ entry.getValue());
        }


        //Methods

        //getting key value
        hashTable.get(101);

        //remove
        hashTable.remove(101);

        //hashTable.remove(101,"Arjun");

        //containsKey or Value
        hashTable.containsKey(101);

        hashTable.containsValue("Arjun");

        //for all keySet
        hashTable.keySet();

        //for all values
        hashTable.values();

        //all Entries or EntrySet
        hashTable.entrySet();

        //clear
//        hashTable.clear();

        hashTable.isEmpty();

        hashTable.size();


    }
}
