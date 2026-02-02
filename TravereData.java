public class TravereData {
    public static void main(String[] args){
        int array1[] = {1,2,3,4,5};
        int array2[] = {6,7,8,9};

        //for-loop
        for(int i = 0; i<array1.length;i++){
            System.out.println(array1[i]);
        }
        System.out.println();
        //for-each loop
        for(int x : array2){
            System.out.println(x);
        }


    }
}
