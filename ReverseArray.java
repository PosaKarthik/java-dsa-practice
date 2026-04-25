import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        int []array = {1,2,3,4,5};

        int i=0;
        int j=array.length-1;

        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }

        System.out.println("Reverse Array : "+Arrays.toString(array));

        //else
            System.out.println();

            for(int reverseArray:array){
                System.out.println(reverseArray);
            }
        
    }

}
