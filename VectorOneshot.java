import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorOneshot {
    public static void main(String[] args){



        //Vector is a Legacy class because it indtroduced in java 1.0 version and it implements List Interface
        //Duplicates and nulls allowed
        //follow insertion order and Synchronized(Thread safety)
        //For iteration have Enumeration legacy cursor
        //Dynamic Data Structure used




        Vector vec = new Vector();
        //List vec = new Vector();
        vec .add(1);
        vec.add("Jocky Chan");
        vec.add(65000.0);

        System.out.println(vec);

        Vector <Integer> v = new Vector<>();
        //List<Integer> v = new Vector<>();
        v.add(1);

        //Legacy Cursor
        Enumeration enumr = vec.elements();

        while(enumr.hasMoreElements()){
            System.out.println(enumr.nextElement());
        }

        //Methods

        vec.addFirst(3);
        vec.addLast(1);

        vec.addElement(1);//at first

        vec.addLast(2);//at last

        vec.insertElementAt(32,4);//object and index

        vec.elements();//return Enumeration

        //return first
        vec.firstElement();

        //returns last
        vec.lastElement();


    }
}
