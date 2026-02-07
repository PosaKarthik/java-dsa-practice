import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetOneshot {
    public static void main(String[] args){

        //it implements Set interface which means SortedSet
        //it follow sorting order and it will allow only homogenous data which means only one type of data
        //internally treeset using treemap and treeMap implements Red-Black tree (self-balancing BST(Binary Search Tree));
        //Nulls and duplicates are NOT allowed because it compares previoius object/value whenever inserting and when nulll try to Compare the value at a time we will get ClassCastException


        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1000);
        treeSet.add(240);
        treeSet.add(20);

        System.out.println(treeSet);


        //Methods

        treeSet.remove(20);

        //smallest element >= 20
        treeSet.ceiling(20);

        //Greatest element <= 20
        treeSet.floor(20);

        //Smallest element >20
        treeSet.higher(20);

        //Large Element(last)
        treeSet.last();

        //Small Element(first)
        treeSet.first();

        //Greatest element <20
        treeSet.lower(20);

        //(from,<to)
        treeSet.subSet(20,1000);

        //<20  elements
        treeSet.headSet(20);

        //>= 20 elements
        treeSet.tailSet(20);

        //Reverse Order
        treeSet.descendingSet();


        //Revere Order From large to Small
        Iterator iterator = treeSet.descendingIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
