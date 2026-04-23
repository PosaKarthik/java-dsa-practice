public class MissingNumber {
    public static void main(String[] args){

        int array[]= {1,2,4,5};
        int missingNumber=0;
        int arraySum=0;

        int n=5;

        int totalSum=n*(n+1)/2;

        //TimeComplexity -> O(n)

        for(int i=0;i<array.length;i++){
            arraySum+=array[i];
        }

        missingNumber=totalSum-arraySum;

        System.out.println("MissingNumber : "+missingNumber);

    }
}
