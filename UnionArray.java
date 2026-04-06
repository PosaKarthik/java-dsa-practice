import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args){
        
        int array1[] = {1,2,3,4,6};
        int array2[] = {1,2,3,5,7};

        //BruteForce -> TimeComplexity-O(n^2)

        List<Integer> list = new ArrayList<>();

        for(int temp : array1){
            list.add(temp);
        }
        
           for(int i=0;i<array2.length;i++){  
            boolean found = false;
            for(int j=0;j<list.size();j++){
                if(array2[i] == list.get(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                list.add(array2[i]);
            }
           }

           System.out.print(list);

           System.out.println();
           System.out.println();


           //Way -> 2 TimeComplexity - O(n)

           //if insertion order required we will go for LinkedHashSet

           HashSet<Integer> hashSet = new HashSet<>();

           for(int temp1 : array1){
            hashSet.add(temp1);
           }

           for(int temp2 : array2){
            hashSet.add(temp2);
           }

           
           System.out.print("HashSet  : "+hashSet+" ");

    }
    
}
