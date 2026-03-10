
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){

        int array[] = {1,2,2,4,5,6,1};


    //brute force - O(n^2)
        for(int i=0;i<array.length;i++){
            boolean checkDuplicate = false;
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    checkDuplicate=true;
                    break;
                }
            }
            if(!checkDuplicate){
                System.out.println("BruteForce Array : "+array[i]);
            }
        }

            System.out.println();

    //Optimized - O(n)

            HashSet<Integer> hashSet = new HashSet<>();

            for(int i=0;i<array.length;i++){
                if(!hashSet.contains(array[i])){
                    hashSet.add(array[i]);
                }
            }

            System.out.println("Optimized Array  :  "+hashSet);

    }

}
