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

    }

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
    
}
