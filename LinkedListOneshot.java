import java.util.List;
import java.util.LinkedList;

public class LinkedListOneshot {
    public static void main(String[] args){

        //Each node(Object or element) has : prev | data | next Address
        //Better for Insertion
        //duplicates and null objects allowed

        //for all DataType
        LinkedList list1 = new LinkedList();
//        List list1 = new LinkedList();

        list1.add(1);
        list1.add("SpongBob");
        list1.add(60000.00);

        System.out.println(list1);

        //For Specific
        LinkedList <Double> list2 = new LinkedList<>();
       //List<Double> list2 = new LinkedList<>();

        list2.add(50.00);
        list2.add(23.0);

        System.out.println(list2);


        // Methods

        //add
        list1.offer(1);
        list1.addFirst(2);
        list1.addLast(1);

        //peek
        list1.peek();
        list1.peekFirst();
        list1.peekLast();

        //poll(remove)
        list1.poll();
        list1.pollFirst();
        list1.pollLast();



    }
}
