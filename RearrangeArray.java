public class RearrangeArray {
    public static void main(String [] args){

        int array[]={1,-2,3,-4,-5,6,-7,8};
        
        int result[]=new int[array.length];
        int positiveIndex=0;
        int negativeIndex=1;

        for(int i=0;i<array.length;i++){
            if(array[i]>=0 && positiveIndex<result.length){
                result[positiveIndex]=array[i];
                positiveIndex+=2;
            }else if(array[i]<0 && negativeIndex<result.length){
                result[negativeIndex]=array[i];
                negativeIndex+=2;
            }
        }
        for(int x:result){
            System.out.println(x);
        }
    }
    
}
