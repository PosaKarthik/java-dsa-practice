import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Year : ");
            int inputYear=scanner.nextInt();

            if(inputYear%400==0 || (inputYear%4==0 && inputYear%100!=0)){
                System.out.println("Leap Year");
            }else{
                System.out.println("NOT Leap Year");
            }


    }
    
}
