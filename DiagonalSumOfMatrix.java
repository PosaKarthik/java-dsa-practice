public class DiagonalSumOfMatrix {
    public static void main(String[] args){
        
        int [][]array={{1,2,3},
                       {4,5,6},
                       {7,8,9}};

            int primarySum=0;
            int secondaySum=0;
            int n=array.length-1;

            for(int i=0;i<array.length;i++){
                primarySum+=array[i][i];
                secondaySum+=array[i][n-i];
            }

            System.out.println("Primary diagonal sum : "+primarySum);
            System.out.println("Secondary diagonal sum : "+secondaySum);
    }
    
}
