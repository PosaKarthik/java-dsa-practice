import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an number : ");
        int inputNumber=scanner.nextInt();

        int a=0;
        int b=1;
        
        for(int i=0;i<inputNumber;i++){
            System.out.println(a);
           int c=a+b;
            a=b;
            b=c;
        }

    }
    
}
