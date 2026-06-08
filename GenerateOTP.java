import java.security.SecureRandom;
import java.util.Random;

public class GenerateOTP {

    private static final SecureRandom secureRandom=new SecureRandom();

           public static String generateOTP(){
            int number =secureRandom.nextInt(1000000);//if otp want to start with 0 then just one zero from nextInt();
            return String.format("%06d", number);
           }
    public static void main(String[] args) {
        
            Random random=new Random();

            int otp=random.nextInt(1000000);
            System.out.println("OTP : "+otp);



            //Way->2

          

           String OTP=generateOTP();
           System.out.println("Secure OTP : "+OTP);

           



    }
    
}
