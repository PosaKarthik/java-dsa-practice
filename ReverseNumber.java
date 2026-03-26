public class ReverseNumber{
    public static void main(String[] args){
        int number = -123;

        int sign = (number<0)? -1 : 1;
         number = Math.abs(number);  // convert into Positive number
        
        int answer = 0;
        
        while(number>0){
            int digit = number%10; // To get lastt number
            answer = answer * 10 +digit;
            number = number/10; // To remove last number
        }
        answer = answer * sign; //To check if number negative
        System.out.println("Reversed Number  :  "+answer);
    }
}