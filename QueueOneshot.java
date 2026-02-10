import java.util.Iterator;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class QueueOneshot {
    public static void main(String[] args){


        //Queue is an interface extends Collections interface
        //it follow FIFO (First In First Out)  which means First inserted element First removed
        //Queue is an interface we cannot create object for the interfce
        //DataStructures : LinkedList and ArrayDeque based Implementation

        Queue <Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(1);
        queue.add(100);

        System.out.println(queue);

        Queue <Integer> arrayDequeue = new ArrayDeque<>();

        arrayDequeue.add(100);
        arrayDequeue.add(1000);
        arrayDequeue.add(1);

        System.out.println("ArrayDeque : "+arrayDequeue);


        //Methods

        queue.addAll(arrayDequeue);

        queue.removeAll(arrayDequeue);

        //add
        queue.offer(10);

        //remove

    }
}
