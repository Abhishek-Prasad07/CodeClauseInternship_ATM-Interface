import java.util.Scanner;

public class AtmExample{
    public static void main(String[] args){
         int balance = 50000;
         int withdraw =0;
         int deposit=0;

         Scanner sc=new Scanner(System.in);


        while(true){
         System.out.println("........**Welcome to ATM**.........");
         System.out.println("-----------------------------------------");
         System.out.println("Option 1: Withdarw");
         System.out.println("Option 2: Deposit");
         System.out.println("Option 3: Check Balance");
         System.out.println("Option 4: Exit");
         System.out.println("Choose any one option above:-------");

         int option=sc.nextInt();

         switch(option){
            case 1:
            System.out.println("Enter withdraw amount:");
               System.out.println("-----------------------------------------");
            withdraw=sc.nextInt();
            if(balance<withdraw){
                System.out.println("Sorry insufficient balance");
            }

            else{
                balance=balance-withdraw;
                System.out.println("Successfully withdrawn");
                  System.out.println("-----------------------------------------");

            }
                    break;
            case 2:
            System.out.println("Enter Deposit amount");
                 System.out.println("-----------------------------------------");
            deposit=sc.nextInt();
            balance=balance+deposit;
            System.out.println("Successfully Deposited");
                 System.out.println("-----------------------------------------");

             break;

            case 3:
                System.out.println("Your Account Balance is :"+balance);
                break;
            case 4:
                System.exit(0);
                break;
            default:System.out.println("Please Enter Correct Option");
                    
                

         }


    }
}
}