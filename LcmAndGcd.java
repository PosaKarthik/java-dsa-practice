public class LcmAndGcd {
    public static void main(String[] args) {

        int number1 = 12;
        int number2 = 18;

        int Gcd = 0;
        int Lcm = 0;

        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                Gcd = i;
               // System.out.println(Gcd);
            }
        }

        Lcm=(number1*number2)/Gcd;  //formula : (number1*number2)/Gcd(a,b);

        System.out.println("GCD : "+Gcd);
        System.out.println("LCM : "+Lcm);

    }

}
