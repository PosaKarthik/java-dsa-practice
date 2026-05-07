public class Sumof2DArrayElements {
    public static void main(String[] args){
//                       i=0     i=1
        int [][]array={{1,2,3},{4,5,6}};
        //             j=0,1,2 
        // i=0 -> j=0,1,2 >> [0][0],[0][1],[0][2]
        //i=1 -> j=0,1,2  >> [1][0],[1][1],[1][2]
        int sumOfTwoDArray=0;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sumOfTwoDArray+=array[i][j];
            }
        }

        System.out.println("Sum of 2D array : "+sumOfTwoDArray);
    }
    
}
