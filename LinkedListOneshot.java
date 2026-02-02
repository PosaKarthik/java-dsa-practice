import java.util.LinkedList;
import java.util.List;

public class LinkedListOneshot {
    public static void main(String[] args){

        //Each element(node) contains : prev | data | next
        //Better for insertion/deletion
        //Null and duplicates allowed
        //Using Doubly LinkedList Data Structure

        LinkedList list1 = new LinkedList<>();

        //List list1 = new LinkedList();

        list1.add(1);
        list1.add("Surya");
        list1.add(50000.00);

        System.out.println(list1);

        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<>();

        //List<Integer> list2 = new LinkedList<>();

        list2.add(12);
        list2.addFirst(16);
        list2.addLast(1);

        System.out.println(list2);

        //Methods
        list1.getFirst();

        list1.getLast();

        list1.offer(26);//add

        list1.offerFirst(22);

        list1.offerLast(12);

        //remove
        list1.poll();

        list1.pollFirst();

        list1.pollLast();

        //peek element not remove (shows)

        list1.peek();

        list1.peekFirst();

        list1.peekLast();

        list1.size();

        list1.iterator(); //to iterate objects





    }
}
