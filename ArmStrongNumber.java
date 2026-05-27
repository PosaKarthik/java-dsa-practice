import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an 3 digit number : ");
        int inputNumber=scanner.nextInt();

        int originalNumber=inputNumber;
        int cube=0;
        int sum=0;

        while(inputNumber>0){

            int digit=inputNumber%10;
            cube=digit*digit*digit;
            sum+=cube;

            inputNumber/=10;

        }

        if(originalNumber==sum){
            System.out.println("ARMSTRONG Number");
        }else{
            System.out.println("NOT ARMSTRONG Number");
        }


    }
    
}
