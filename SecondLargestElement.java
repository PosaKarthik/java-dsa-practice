public class SecondLargestElement {
    public static void main(String[] args){

        int array[] = {3,6,2,87,6,12,2,1};
        int largestNumber = array[0];
        int secondLargestNumber = 0;

        for(int i=0;i<array.length;i++){

            if(array[i]>largestNumber){
                largestNumber=array[i];
            }
            
            if(array[i]>secondLargestNumber && array[i] != largestNumber){
                secondLargestNumber = array[i];
            }

        }

        System.out.println("First Largest elemnet of the array  :  "+largestNumber);
        System.out.println("Second Largest elemnet of the array :  "+secondLargestNumber);


    }
    
}
