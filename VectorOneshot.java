import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorOneshot {
    public static void main(String[] args){

        //Vector is a Legacy class because it indtroduced in java 1.0 version and it implements List Interface




        Vector vec = new Vector();
        vec .add(1);
        vec.add("Jocky Chan");
        vec.add(65000.0);

        System.out.println(vec);

        Enumeration enumr = vec.elements();

        while(enumr.hasMoreElements()){
            System.out.println(enumr.nextElement());
        }


    }
}
