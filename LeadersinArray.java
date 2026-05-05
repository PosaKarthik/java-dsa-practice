public class LeadersinArray {
    public static void main(String [] args){

        //Leaders means if present element right side there is no having a greater element 
        // and element right side have no elements also taken as leaders

        int array[]={16,17,4,3,5,2};

        int leaders[]=new int[array.length];
        int k=0;

        for(int i=0;i<array.length;i++){
            int j;
            for(j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    break;
                }
            }
            if(j==array.length){
                leaders[k]=array[i];
                k++;
            }
        }

        for(int x:leaders){
            if(x!=0)    //Beacuse there are empty space in array int default valuse is 0
            System.out.println(x);
        }
    }
    
}
