public class RemovingZerosAddingToLast {
    public static void main(String[] args){
        int array[] = {1,2,0,0,3,0,4,0,50};

        //Way -> 1 
        //Here we can store into another array instead of printing

        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                System.out.print(array[i]+" ");
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                System.out.print(array[i]+" ");
            }
        }


        //Way -> 2

        System.out.println();
        System.out.println();
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
                j++;
            }
        }

        for(int arr : array)
        System.out.print(arr+" ");
    }
}
