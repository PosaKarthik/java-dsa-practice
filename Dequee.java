import java.util.Iterator;
import java.util.Collections;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Dequee {
    public static void main(String[] args){

        //It is an interface extends Queue and internally it we can add/remove from front and rear;
//        DataStructure : Depends on implemntation LinkedList / ArrayDeque
        // Deque means Double Ended Queue

        Deque <Integer> deque = new LinkedList<>();

        deque.offer(1);
        deque.offer(3);
        deque.offer(2);

        System.out.println(deque);

        Deque<String> deque1 = new ArrayDeque<>();

        deque1.offer("Sarkar");
        deque1.offer("Sarkar");

        System.out.println(deque1);

        //Methods

        //AddFirst and Last
        deque.offerFirst(100000);

        deque.offerLast(200000);

        //removeFirst and Last

        deque.pollFirst();

        deque.removeLast();




    }
}
