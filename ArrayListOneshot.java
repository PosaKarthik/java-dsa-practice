import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListOneshot {
    public static void main(String[] args){
        //Default capacity = 10
        //Bettter for read(fast access) and allow duplicates
        // It follows insertion order and index based Acces(index start from = 0)
        //for all DataType
        //Using Dynamic Array DataStructure

        ArrayList arrayList1 = new ArrayList();
        //List list = new ArrayList();
        arrayList1.add(1);
        arrayList1.add("Arjun Sarkar");
        arrayList1.add(50000.00);

        // for particular Datatype
        //List<Integer> list = new ArrayList<>();
        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("Surya");
        arrayList2.add("Sarkar");
        System.out.println("------------>  For all DataType");
        System.out.println(arrayList1);

        System.out.println();

        System.out.println("------------>  For particular DataType");
        System.out.println(arrayList2);
        System.out.println();
        System.out.println("---------------Methods-------------");

        arrayList1.add(1);
        arrayList1.add(1,3);

        ArrayList <Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(10);
        arrayList3.add(20);
        arrayList3.add(30);

        arrayList1.addAll(arrayList3);//add all objects into arrayList1 (more Efficient than add for collection adding)

        arrayList1.remove(50000.00);

        arrayList1.remove(3);//index

        arrayList1.get(1); //index

        arrayList1.getFirst();

        arrayList1.getLast();

        //checking object contains or NOT
        arrayList1.contains("Arjun Sarkar");

        //To remove all the Objects
        //arrayList1.clear();

        //Empty or NOT
        arrayList1.isEmpty();

        //if two arraylist have common objects it will keep other wise remove
//        arrayList1.retainAll(arrayList2);

        //First index Posoition
        arrayList1.indexOf(2);

        //Last index Position
        arrayList1.lastIndexOf(2);

        //set at index position
        arrayList1.set(1,1000);

        //iterator --> iterate objects

        //ListIterator ----> Iteratte objects and reverse order




    }
}
class IterateObjects{
    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        //for loop
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        //for-each loop
        for(Object x : arrayList){
            System.out.println(x);
        }

        //Iterator
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //ListIterator
        ListIterator listIterator = arrayList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //reverse
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


    }
}