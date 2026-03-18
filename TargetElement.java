public class TargetElement{
    public static void main(String[] args){

        int array[] = {1,4,5,3,6,3};

        //Bruteforce : LinearSearch -> TimeComplexity - O(n) and SpaceComplexity - O(1)

      int target = 6;
      for(int i=0;i<array.length;i++){
        if(array[i] == target){
            System.out.println("Element found at Index : "+i);
        }
      }  

      //Optimal : BinarySearch -> TimeComplexity - O(logn) and SpaceComplexity - O(1)


            int result = binarySearch(array,target);

            if(result != -1){
                System.out.println();
                System.out.println("Element found at Index : "+result);
            }else{
                System.out.println("NOT Found....");
            }
    }
        public static int binarySearch(int array[],int target){
            int left = 0;
            int right = array.length-1;

            while(left <= right){
                int middle = left +(right-left)/2; //instead of this -> l+r/2 it gives Integer Overflow when array becomes large
                if(array[middle] == target){
                    return middle;
                }
                else if(array[middle] > target){
                    right = middle-1;
                }else{
                    left = middle+1;
                }
            }
            return -1;
        } 
}