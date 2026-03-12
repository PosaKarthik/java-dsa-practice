public class RemovingZerosandAddingLast{
    public static void main(String[] args){

        int array[] = {1,0,2,0,3,0,4,0,5};

        System.out.print("New Array : ");

        for(int i=0;i<array.length;i++){
            if(array[i]!= 0){
                System.out.print(array[i]+" ");
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i] == 0){
                System.out.print(array[i]+" ");
            }
        }


    }
}