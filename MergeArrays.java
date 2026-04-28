public class MergeArrays {
    public static void main(String[] args){
        
        int array1[]={1,3,5};
        int array2[]={2,4,6};

        int mergedArray[]= new int[array1.length+array2.length];
        int k=0;

        for(int i=0;i<array1.length;i++){
            mergedArray[k]=array1[i];
            k++;
        }
        for(int j=0;j<array2.length;j++){
            mergedArray[k]=array2[j];
            k++;
        }

        System.out.println("Merged Array : ");
        
        for(int x:mergedArray){
            System.out.println(x);
        }
    }
    
}
