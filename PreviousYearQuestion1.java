public class PreviousYearQuestion1 {
    public static void main(String[] args) {
        

        // ATM Withdrawal Validation
        // -------------------------

        // Arjun goes to an ATM to withdraw money
        // The ATM follows these rules

        // ->Withdrawal amount must be a multiple of 100
        // ->Withdrawal amount must be greaterthan 0
        // ->AccountBalance must be greaterthan or equal to Withdrawal amount
        // ->After successful Withdrawal,show the remaining balance 
        // ->if any rule fails,print the exact reason
        
        // Input:
        // withdrawAmount
        // accountBalance

        // Output:
        // Withdrawal Successful Remaining balance XXX 
        // OR 
        // Invalid amount
        // Insufficient balance



        // Solution:


        int withdraw=withdrawAmount;
        int amount=accountBalance;

        if(withdraw%100!=0 || withdraw<0){
            System.out.println("Invalid amount");
        }else if(amount<withdraw){
            System.out.println("Insufficient Balance");
        }else{
            int remainingBalance=amount-withdraw;
            System.out.println("Withdrawal Successful Remaining balance "+remainingBalance);
        }



    }
    
}
