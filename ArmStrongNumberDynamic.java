import java.util.Scanner;

public class ArmStrongNumberDynamic {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an number : ");
        int inputNumber=scanner.nextInt();
        
        int originalNumber=inputNumber;
        int temp=inputNumber;
        int sum=0;
        int digits=0;

        //finding count of inputNumber

        while(temp>0){
            digits++;
            temp/=10;
        }

        temp=inputNumber;

        while(temp>0){
            int lastDigit=temp%10;
            sum=sum+(int)Math.pow(lastDigit,digits);
            temp/=10;
        }

        if(originalNumber==sum){
            System.out.println("ARMSTRONG Number");
        }else{
            System.out.println("NOT ARMSTRONG Number");
        }



    }
    
}
