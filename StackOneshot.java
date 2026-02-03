//import java.util.List;
//import java.util.Vector;
import java.util.Stack;

public class StackOneshot {
    public static void main(String[] args){


        //It is legacyclass extends from vector class(jdk 1.0v)
        //duplicates and nulls allowed
        //default capacity : 10  (Increament *2)
        //random accessable and Synchronized
        //LIFO(Last in First Out)  DataStructure Used (push to bottom and remove top element)

        Stack st = new Stack();
        //add() method also works because it extends Vector class
        //push() method is specific fro stack


        //push into bottom
        st.push(1);
        st.push("Jack");
        st.push(50000.0);

        System.out.println(st);

        Stack <Integer> st1 = new Stack<>();
        st1.push(1);

        System.out.println(st1);

       //----> Methods

        //delete top element
         st.pop();

         //to check on top element
         st.peek();

         //same as isEmpty() method
         st.empty();

         //retruns top to bottom position NOT index
         System.out.println( st.search(1));
         System.out.println(st);
    }
}
