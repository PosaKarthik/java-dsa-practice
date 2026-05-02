public class EvenOddNumber{
    public static void main(String[] args){

        int n=7;

        if((n&1)==0){
            System.out.println("Even Number");
        }else if((n&1)!=0){
            System.out.println("Odd Number");
        }
    }
}