
public class RightRotation{
    public static void main(String[] args){

        int array[] = {1,2,3,4,5};

        int temp = array[array.length-1];

        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=temp;

        System.out.println("Array after RigthRotation  :  ");

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}