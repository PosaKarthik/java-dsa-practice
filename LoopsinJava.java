public class LoopsinJava{
    public static void main(String[] args){

        // ------->       1.forLoop

        //  1.intialization ,2.checkCondition  , 4.increment/decrement
        for(int   i=1;            i<6;                  i++){

            //3.printBlockOFCode
            System.out.println(i);
        }


        // ---------->  2.whileLoop

        int i=5;
        //   check condition 
        while(i<=5){
            System.out.println(i);
            i++;//here we are incremented i value 
            // else it runs infinity times because condition is always true
        }


        // -------->  3.doWhile

        int x=3;

        // first print one statement even the contion is niether true/false
        do{
            System.out.println(x);
            x++;//incremented now x=4 condition become false
        }while(x<=3);//false


        //  ----------->  4. foreach


        int array[]={1,2,3,4,5};
        
        //used to iterate data

        for(int k:array){
            System.out.println(k);
        }




    }
}