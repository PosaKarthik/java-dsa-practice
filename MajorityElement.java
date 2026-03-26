public class MajorityElement{
    public static void main(String[] args){

        //Find element appearing more than n/2times

        int[] array = {1,3,2,1,1,2,3,2,2,2,3,3,3,3,3,3,3};
        

        //BruteForce : TimeComplexity - O(n2) and SpaceComplexity - O(1)

        int result = majorityElement(array);

        if(result != -1){
        System.out.println("Majority Element  :  "+result);
        }else{
            System.out.println("NOT Found");
        }

        System.out.println();
        int result2 = majorityElement2(array);

        if(result2 != -1){
            System.out.println("MajorityElement  :  "+result2);
        }else{
            System.out.println("NOT Found...");
        }

    }

        public static int majorityElement(int array[]){

        for(int i=0;i<array.length;i++){
            
            int count = 0;
            for(int j=0;j<array.length;j++){
                if(array[i] == array[j]){
                    count++;
                }
            }

            if(count>array.length/2){
              return array[i];
            }

         }
         return -1;

    }

    //Opitmal : Using Boyer-Moore Voting ->TimeComplexity - O(n) and SpaceComplexity - O(1)

    public static int majorityElement2(int array[]){

        int count = 0;
        int candidate = 0;
        
        for(int num : array){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }

        int count2 = 0;
        for(int num : array){
            if(num == candidate){
                count++;
            }
        if (count > array.length/2){
        return candidate;
        }
        }

        return -1;
    }
}