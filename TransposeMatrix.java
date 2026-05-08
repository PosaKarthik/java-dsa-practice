public class TransposeMatrix {
    public static void main(String[] args){

        int [][]matrix={{1,2,3},{4,5,6}};

        int rowsLength=matrix.length;
        int columnsLength=matrix[0].length;

        for(int i=0;i<columnsLength;i++){
            for(int j=0;j<rowsLength;j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
    
}
