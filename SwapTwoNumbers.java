public class SwapTwoNumbers{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        System.out.println("        -->Way----1");

        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a = "+ a +", b = "+b);

        System.out.println();
        System.out.println("        -->Way-----2");
        System.out.println();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(" a = "+a + ", b = "+b);

    }
}