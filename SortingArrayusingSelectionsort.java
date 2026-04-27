public class SortingArrayusingSelectionsort {
    public static void main(String [] args){

        int array[] = {5,2,9,1,3};
        
        for(int i=0;i<array.length;i++){
            int minimum=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minimum]){
                minimum=j;
                }
            }
            int temp=array[i];
            array[i]=array[minimum];
            array[minimum]=temp;
        }

        for(int sortedArray:array){
            System.out.println(sortedArray);
        }
    }
}
