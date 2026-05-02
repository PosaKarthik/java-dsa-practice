public class InsertingElementinArray {
    public static void main(String[] args){
        

        int array[]={1,2,4,5};
        int insertTargetElement=3;
        int position=2;

        int resultArray[] = new int[array.length+1];

        //TimeComplexity -> O(n)  SpaceComplexity -> O(n)

        for(int i=0;i<position;i++){
            resultArray[i]=array[i];
        }

        resultArray[position]=insertTargetElement;

        for(int i=position+1;i<resultArray.length;i++){
            resultArray[i]=array[i-1];
        }

        for(int x:resultArray){
        System.out.println(x);
        }
    }
    
}
