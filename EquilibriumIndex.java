public class EquilibriumIndex {
    public static void main(String[] args){

        int array[]={1,2,3,2,1};

        for(int i=0;i<array.length;i++){
            int leftSum=0;
            int rightSum=0;
            for(int j=0;j<i;j++){
                leftSum+=array[j];
            }
            for(int j=i+1;j<array.length;j++){
                rightSum+=array[j];
            }
            if(leftSum==rightSum){
                System.out.println("EquilibriumIndex : "+i);
                return;
             }
            
        }
         System.out.println("Equilibrium Index NOT Found");
         return;
    }
    
}
