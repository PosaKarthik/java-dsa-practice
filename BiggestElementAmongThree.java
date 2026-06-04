public class BiggestElementAmongThree {
    public static void main(String[] args) {
        

        int a=10;
        int b=30;
        int c=20;

        if(a>=b&&a>=c){
            System.out.println("Biggest element : a("+a+")");
        }else if(b>=c&&b>=a){
            System.out.println("Biggest element : b("+b+")");
        }else{
            System.out.println("Biggest element : c("+c+")");   
        }


    }
    
}
