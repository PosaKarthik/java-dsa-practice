import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){

                // TestCase - 1

  int nums[] = {2,7,11,15};
  int target = 9;

                // TestCase - 2

  int nums2[] = {3,2,4};
  int target2 = 6;

                // TestCase - 3

   int nums3[] = {3,3};
   int target3 = 6;             

  int result[] = twoSum(nums,target);

  if(result.length == 2){
    System.out.println("Indices : ["+result[0]+","+result[1]+"]");
  }else{
    System.out.println("Solution NOT found");
  }

  int result2[] = twoSumOptimize(nums2,target2);

  if(result2.length == 2){
    System.out.println("Indices : ["+result2[0]+","+result2[1]+"]");
  }else{
    System.out.println("Solution NOT found");
  }

    }


    // BruteForce--> TimeComplexity - O(n^2), SpaceComplexity - O(1);

    public static int[] twoSum(int nums[],int target){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};

    }

    // Optimized -> TimeComplexity - O(n) , SpaceComplexity - O(1)

  public static int[] twoSumOptimize(int nums2[],int target2){

    HashMap<Integer,Integer> hashMap = new HashMap<>();

    for(int i=0;i<nums2.length;i++){
        int compliment = target2-nums2[i];
        if(hashMap.containsKey(compliment)){
            return new int[] {hashMap.get(compliment),i};
        }
        hashMap.put(nums2[i],i);
    }
    return new int[]{};
  }

    
}
