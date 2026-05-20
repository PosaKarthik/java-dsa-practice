import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter an number : ");
            int inputNumber=scanner.nextInt();

            int result=1;

            for(int i=inputNumber;i>=1;i--){
                    result*=i;
            }

            System.out.println(inputNumber+" factorial : "+result);


    }
    
}
