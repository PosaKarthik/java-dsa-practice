public class SumofMaximumSubArray{
    public static void main(String[] args){

        int array[] = {1,2,-2,1,-4,5,-1,4};


        //Bruteforce : TimeComplexity - O(n2) and SpaceComplexity - O(n)

        int max = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum+=array[j];
                max=Math.max(sum,max);
            }
        }

        System.out.println("Sum of Maximum SubArray  :  "+max);


        //Optimal : TimeComplexity - O(n) and SpaceComplexity - O(1)

           int maxSum = array[0];
           int currentSum = array[0];

        for(int i=0;i<array.length;i++){
            currentSum = Math.max(array[i],currentSum+array[i]);
            maxSum = Math.max(currentSum,maxSum);
        }

        System.out.println();
        System.out.println("Sum of Maximum SubArray2  :  "+maxSum);

    }
}