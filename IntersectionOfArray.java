import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args){
        
        int array1[] = {1,2,3,3,5};
        int array2[] = {3,4,5,6,7};


        // TimeComplexity -> O(n*m) , SpaceComplexity -> O(1)
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i] == array2[j]){
                    hashSet.add(array1[i]);
                }
            }
        }

        System.out.println("1.Intersection of Array : ");
        System.out.println(hashSet);

        System.out.println();
        System.out.println();


        //TimeComplexity -> O(n+m) , SpaceComplexity -> O(n)

        HashSet<Integer> tempSet = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for(int temp1 : array1){
            tempSet.add(temp1);
        }

        for(int temp2 : array2){
            if(tempSet.contains(temp2)){
                resultSet.add(temp2);
            }
        }

        System.out.println("2.Intersection of Array : ");
        System.out.println(resultSet);

    }
    
}
