package com.oopsexamples.bankaccount;

public class BankAccountDetails {

	public static void main(String[] args) {
		BankAccount navya=new BankAccount();
		navya.setCurrentbalance(1000);
		System.out.println(navya.getCurrentbalance());
		navya.deposite(500);
		navya.withdraw(2000);
//		
//		System.out.println(navya.getCurrentbalance());

		
		
		BankAccount divya=new BankAccount();
		
		divya.setCurrentbalance(300);
	System.out.println("divya amount"+divya.getCurrentbalance());
		//divya.setCurrentbalance(200);
		 //System.out.println(divya.getCurrentbalance());
//
//navya.tranfer(200, divya);
//		
		navya.tranfer(300, divya);
	}

}
