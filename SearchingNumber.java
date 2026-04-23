public class SearchingNumber {
    public static void main(String[] args){

        int array[] = {1,5,2,8,7,4,8,6};
        int target=8;

        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("Target element found at Index of : "+i);
                return; //if target found it ends here
            }
        }
                System.out.println("Element NOT Found");
    }
    
}
