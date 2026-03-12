public class RemovingZerosandAddingLast{
    public static void main(String[] args){

        int array[] = {1,0,2,0,3,0,4,0,5};


//TimeComplexity = O(n),SpaceComplexity = O(1);
        System.out.print("New Array : ");

        for(int i=0;i<array.length;i++){
            if(array[i]!= 0){
                System.out.print(array[i]+" ");
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i] == 0){
                System.out.print(array[i]+" ");
            }
        }


        //Clean and Simple

//TimeComplexity = O(n),SpaceComplexity = O(n) -> because of an extraArray;
        int result[] = new int[array.length];

        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!= 0){
                result[index++]=array[i];
            }
        }

        System.out.println();
        System.out.print("New array 2 : ");
        
        for(int i : result){
            System.out.print(i+" ");
        }


        //Best for interview

        //TimeComplexity = O(n),SpaceComplexity = O(1);

        int index2 = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[index2];
                array[index2]= temp;
                index2++;
            }
        }

        System.out.println();
        System.out.print("New Array 3  :  ");
        for(int i : array){
            System.out.print(i+" ");
        }

    }
}