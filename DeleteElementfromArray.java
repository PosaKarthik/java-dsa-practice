public class DeleteElementfromArray {
    public static void main(String[] args){

        
        int array[]={1,2,3,4,5};

        //Removing an element at index 2
        int indexToRemove=2;

        for(int i=indexToRemove;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=0;

        for(int x:array){
            System.out.println(x);
        }

    }
    
}
