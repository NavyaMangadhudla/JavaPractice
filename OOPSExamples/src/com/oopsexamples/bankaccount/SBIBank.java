package com.oopsexamples.bankaccount;

public class SBIBank {
	private String customerName;
	private long accountNo;
	private double amount;
	private double balance;
	
	//getters and setters
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//deposit method
	public void deposit(double amount) {
		 balance= balance+amount;
		//balance=balance;
		System.out.println("my amount is :"+balance);
	}
	
	//withdraw method
	public void withdraw(double amount) throws Exception {
		try {
		if(amount<balance) {
			balance=balance-amount;
			
			System.out.println("total  balance is:"+balance);
		}
		else {
			throw new Exception("your balance amount is less than withdraw amount");
//			System.out.println("my balance is"+balance);
		}
	}
		catch( Exception e){
			System.out.println("some error is there transaction");
		}
		}

	

	//transfer method
	public void sendAmount(SBIBank from,SBIBank to,double amount) {
	if (balance<amount) {
		System.out.println("send failed");
	}
	else
	{
   	from.balance=from.balance-amount;
   	System.out.println("tranfer "+from.balance);
   	to.balance=to.balance+amount;
   	System.out.println("added"+to.balance);
	  //System.out.println(this.balance);
	  
	  
	  
	}

	}
}
