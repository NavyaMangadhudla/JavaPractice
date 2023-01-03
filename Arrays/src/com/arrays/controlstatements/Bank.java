package com.arrays.controlstatements;

public class Bank {
	static int currentBalance=1000;
	int t2 = 0;
       public static void greetCustomer()
       {
       System.out.println("Hello,welocome to the banking application");
       }
       public void deposit(int amount) {
    	 currentBalance= currentBalance+amount ;
    	 System.out.println("amount is deposite sucessfully");
       }
       public static void withdraw(int amount) {
    	  currentBalance=currentBalance-amount; 
    	  System.out.println("amount is withdrawn successfully");
       }
       public int getCurrentBalance() {
        return currentBalance;
       }
       
	public static void main(String[] args) {
		Bank bank=new Bank();
		greetCustomer();
//	  	bank.deposit(500);
		System.out.println( "current balance is :"+bank.getCurrentBalance());
		Bank.withdraw(300); 
		System.out.println( "current balance is :"+bank.getCurrentBalance());

	}

}
