public class BiggestOddNumberinArray {
    public static void main(String[] args){

        int array[] ={1,3,5,9,8,13};
        int biggestOddNumber=Integer.MIN_VALUE; //Beacuse if negative number occurs

        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                if(array[i]>biggestOddNumber){
                    biggestOddNumber=array[i];
                }
            }
        }

        System.out.println("Biggest ODD Number : "+biggestOddNumber);

    }
    
}
