import java.util.Scanner;

public class PowerOfTwoNumbers {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter base number : ");
        double baseNumber=scanner.nextDouble();

        System.out.println("Enter exponent number : ");
        double exponentNumber=scanner.nextDouble();

        int result=(int)Math.pow(baseNumber, exponentNumber);

        System.out.println("Result : "+result);




    }
    
}
