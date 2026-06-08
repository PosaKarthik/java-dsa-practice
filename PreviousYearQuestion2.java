import java.util.Scanner;

public class PreviousYearQuestion2 {
    public static void main(String[] args) {

        // Electricity Bill Calculation
        // -----------------------------

        // Problem Statement :
        // An electricity board calculates the monthly electricity bill of its customer
        // based on the number units consumed

        //The tariff rules are as follows :
        //-> for the first 100units,the charge is $1 per unit
        //-> for the next 100units,the charge is $2 per unit
        //-> for any unit above 200,the charge is $3 per unit

        //Input Format : 
        //An integers units representing the total number of electricity units consumed.
        //Output Format :
        //Print a single integer representing the total electricity bill amount
        //SampleInput : 
        //250
        //SampleOutput : 
        // 450     -

        //Explanation : 
        //First 100*1=100
        //Second 100*2=200
        //Remainig 50*3=150
        //100+200+150 = 450

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Units : ");
        int units=scanner.nextInt();

        int totalBill=0;


        if(units<=100){
            totalBill=units*1;
        }else if(units<=200){
            totalBill=(100*1)+(units-100)*2;
        }else{
            totalBill=(100*1)+(100*2)+(units-200)*3;
        }


        System.out.println("Electricity Bill : "+totalBill);

    }

}
