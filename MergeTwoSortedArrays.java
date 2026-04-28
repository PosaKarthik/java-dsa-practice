public class MergeTwoSortedArrays{
    public static void main(String []args){


        int array1[]={1,3,5,7};
        int array2[]={2,4,6,8};

        int i=0;
        int j=0;
        int k=0;
        int mergedArray[] = new int[array1.length+array2.length];

        while(i<array1.length && j<array2.length){
            if(array1[i]<=array2[j]){
                mergedArray[k++]=array1[i++];
            }else{
                mergedArray[k++]=array2[j++];
            }
        }

        //for remaining array elements

        if(i<array1.length){
            mergedArray[k++]=array1[i++];
        }

        if(j<array2.length){
            mergedArray[k++]=array2[j++];
        }

            System.out.println("Merged Array : ");

        for(int x:mergedArray){
            System.out.println(x);
        }

    }
}