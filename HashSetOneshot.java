
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


public class HashSetOneshot {
    public static void main(String[] args){

        //Set is a interface it extends Collections interface

        //HashSet and LinkedHashSet implements Set interface

        //Duplicates NOT allowed and Only one null allowed

        //Insertion order will not be maintained
        //Default or Intial Capacity : 16 (Load factor reacing 75% it will *2=32)

        //DataStructure : Hashtable


        //Implementation and Declaration

        HashSet hashSet = new HashSet();
        //Set set = new HashSet();

        hashSet.add(1);
        hashSet.add("Arjun Sarkar");
        hashSet.add(50000.0);
        hashSet.add(2);

        System.out.println(hashSet);

        HashSet <Integer> hashSetSpecific = new HashSet<>();

        hashSetSpecific.add(10);
        hashSetSpecific.add(5);
        hashSetSpecific.add(1);


                System.out.println(hashSetSpecific);


                //Methods

        hashSet.remove(1);

        hashSet.contains(1);

        hashSet.isEmpty();

        hashSet.size();

        hashSet.toArray();

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
