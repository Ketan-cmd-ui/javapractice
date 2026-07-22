public class AtmCashWithdrawal {
    public static void main(String[] args) {
        int balance=1000;
        int withdraw=1000;
        int remainingBalance= balance-withdraw;
       if ( withdraw %100 ==0  && balance >=withdraw )  
       {
        System.out.println("Transaction successful");
        System.out.println( "the remaining balacnce is  "+remainingBalance);
       }
       else if( balance <withdraw)
       {
       
        System.out.println("insufficient Balance");
       }
       else
       {
        System.out.println( "invalid amount");
       }
    }
}




/*

Problem #8 – ATM Cash Withdrawal

Write a Java program for an ATM.

The ATM should allow withdrawal only if:

Balance is greater than or equal to the withdrawal amount.
Withdrawal amount is a multiple of 100.


*/