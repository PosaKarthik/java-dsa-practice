import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int userInput=scanner.nextInt();

        int originalNumber=userInput;
        int reversedNumber=0;

        while(userInput>0){
            int remainder=userInput%10;
            reversedNumber=reversedNumber*10+remainder;
            userInput/=10;
        }

        if(originalNumber == reversedNumber){
            System.out.println("Palindrome");
        }else{
            System.out.println("NOT Palindrome");
        }


    }
    
}
