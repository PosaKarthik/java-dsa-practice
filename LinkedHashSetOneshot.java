import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;


public class LinkedHashSetOneshot {
    public static void main(String[] args){

        //implementaion class of Set

        //It follow Insertion order
        //Deafault Capacity : 16 (load factor reaching 75% *2 = 32 )

        //DataStrucure = Hashtable + DoubleLinkedList

        //Implementaion and Declaration

        //NOTE : There are two differences between HashSet and LinkedHashSet
        //HashSet will NOT follow Insertion order and LinkedHashSet follow Insertion order
        //Hashset is used Hashtable DataStructure and LinkedHashSet is used Hashtable+DoublyLinkedList



        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //Set linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(20);
        linkedHashSet.add("Arjun Sarkar");
        linkedHashSet.add(50000.0);

        System.out.println(linkedHashSet);


        LinkedHashSet <Integer> linkedHashSet1 = new LinkedHashSet<>();
        //Set <Integer> linkedHashSet1  = new LinkedHashSet<>();

        linkedHashSet1.add(1000);
        linkedHashSet1.add(100);
        linkedHashSet1.add(10);

       Iterator <Integer> iterator = linkedHashSet1.iterator();

       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

       //Methods

        linkedHashSet.add(21);

       linkedHashSet.remove(21);

       linkedHashSet.contains(21);

       linkedHashSet.size();

       linkedHashSet.iterator();

       linkedHashSet.isEmpty();

//       linkedHashSet.clear();


    }
}
