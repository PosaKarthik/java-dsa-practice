public class RemoveDuplicates {
    public static void main(String[] args){

        int array[] = {1,2,2,4,5,6,1};

        for(int i=0;i<array.length;i++){
            boolean checkDuplicate = false;
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    checkDuplicate=true;
                    break;
                }
            }
            if(!checkDuplicate){
                System.out.println(array[i]);
            }
        }
    }
    
}
