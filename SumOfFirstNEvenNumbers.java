
import java.util.Scanner;

public class SumOfFirstNEvenNumbers{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number : ");
        int n=scanner.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
                if(i%2==0){
                    sum+=i;
                }
        }

            System.out.println("Sum : "+sum);
    }
}