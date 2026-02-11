import java.util.Iterator;
import java.util.Collections;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args){

        //ArrayDeque is a class it implements Deque interface
        //DataStructure : Circular Dynamic Array (Head/Tail)
        //It is better than Stack and LinkedList ->  insertion/deletion - O(1)
        //No shiftings like Array it maintain Head index and tail index
        //Stack is legacy and Synchronized slow
        //LinkedList Extramemory for pointers and slower than Array
        //Default Capacity : 16
        //It can work as Stack,Queue,Dequeue


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(1000);
        arrayDeque.add(1);
        arrayDeque.add(100);

        //Queue
        arrayDeque.offer(1000);
        arrayDeque.offer(1);
        arrayDeque.offer(100);

        //Stack
        arrayDeque.push(1000);
        arrayDeque.push(1);
        arrayDeque.push(100);

        System.out.println(arrayDeque);

        while(!arrayDeque.isEmpty()){
            System.out.println(arrayDeque.pop());
        }

        //Methods

        arrayDeque.addFirst(23);

        arrayDeque.addLast(21);

        arrayDeque.pollFirst();

        arrayDeque.pollLast();

        arrayDeque.peekFirst();

        arrayDeque.peekLast();


    }
}
