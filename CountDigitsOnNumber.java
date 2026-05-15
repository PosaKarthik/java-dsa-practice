import java.util.Scanner;

public class CountDigitsOnNumber {
    public static void main(String[] args) {
        

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an number : ");
            int n=scanner.nextInt();

            int count=0;

            if(n==0){
                count=1;
            }

            while(n>0){
                n=n/10;  //n/=10 to remove lastNumber
                count++;

            }

            System.out.println("Count of number : "+count);

    }
    
}
