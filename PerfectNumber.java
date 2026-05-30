import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an number : ");
        int inputNumber=scanner.nextInt();

        //PerfectNumber -> ex:6 -> factorials-1,2,3,6 -> n/2->6/2=3 numbers
        //1+2+3=6;

        int sum=0;

        if(inputNumber==0){
            System.out.println("Please choose another number");
            return;
        }

        for(int i=1;i<=inputNumber/2;i++){
            if(inputNumber%i==0){
                sum+=i;
            }
        }

        if(sum==inputNumber){
            System.out.println("Perect number");
        }else{
            System.out.println("NOT Perfect number");
        }

    }
    
}
