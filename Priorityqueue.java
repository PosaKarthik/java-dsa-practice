import java.util.Iterator;
import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args){

        //PriorityQueue is an class implements Queue  interface
        //Deafualt capacity : 11 ( 11 + 50% = 11+ 5 = 16)
        //It will allow Duplicates NOT null
        //no random access,Synchronized and insertion order it follow the natural order
        //DataStructure : BinaryHeap(Min-Heap Default)

        //Elements are ore ordered using : Natural order(comparable) and custom ordering (comparator)

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(100);
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(10000);
        priorityQueue.offer(7);

        System.out.println(priorityQueue);

        Iterator<Integer> iterator = priorityQueue.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // When we use this it will give low value to high
        while(!priorityQueue.isEmpty()){
            System.out.println("Poll Method : "+priorityQueue.poll());
        }

        //Methods


        //add
        priorityQueue.offer(10);

        //remove
        priorityQueue.poll(10);

        priorityQueue.peek();

        priorityQueue.contains(10);

    }
}
