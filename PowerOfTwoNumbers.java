import java.util.Scanner;

public class PowerOfTwoNumbers {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("==========Way -> 1==========");
        System.out.println();

        System.out.println("Enter base number : ");
        double baseNumber=scanner.nextDouble();

        System.out.println("Enter exponent number : ");
        double exponentNumber=scanner.nextDouble();

        int result=(int)Math.pow(baseNumber, exponentNumber);

        System.out.println("Result : "+result);

        System.out.println();
        System.out.println("==========Way -> 2==========");
        System.out.println();

        System.out.println("Enter base1 number : ");
        int baseNumber1=scanner.nextInt();

        System.out.println("Enter exponent1 number : ");
        int exponentNumber1=scanner.nextInt();


        int result1=1;

        for(int i=1;i<=exponentNumber1;i++){
            result1*=baseNumber1;
        }
        System.out.println("Result1 : "+result1);






    }
    
}
