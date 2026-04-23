public class FindMaximumConsecutiveOnes {
    public static void main(String[] args){

        int array[] = {1,1,0,1,1,1};
        int count=0;
        int maximumCount=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==1){
                count++;
            }else{
                count=0;
            }
            if(count>maximumCount){
                maximumCount=count;
            }
        }
        System.out.println("MaximumCount : "+maximumCount);

        System.out.println();

        //Way -> 2

        int count2=0;
        int maximumCount2=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==1){
                count2++;
            }else{
                count2=0;
            }
            maximumCount2=Math.max(maximumCount2,count2);
        }
        System.out.println("MaximumCount2 : "+maximumCount2);
    }
    
}
