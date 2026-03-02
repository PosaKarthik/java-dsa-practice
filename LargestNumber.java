public class LargestNumber {
    public static void main(String [] args){

        int []array = {1,5,6,3,2,7};

        int i;
        int maxNumber = array[0];

        for(i=0;i<array.length;i++){
            if(array[i]>maxNumber){
                maxNumber = array[i];
            }
        }
            System.out.println("MaxNumber  : "+maxNumber);

    }
    
}
