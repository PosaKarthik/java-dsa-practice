
public class LeftRotation{
    public static void main(String[] args){

        int array[] = {1,2,3,4,5};

        int temp = array[0];

        for(int i=1;i<array.length;i++){
            array[i-1]=array[i];
        }
            array[array.length-1]=temp;

            System.out.println("Array after LeftRotation  :  ");

            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }

    }
}