package com.oopsexamples.bankaccount;

public class BankAccount {
	private String customerName;
	private long accountNumber;
//	private double amount;
		private double currentbalance;
	
	
	public double getCurrentbalance() {
			return currentbalance;
		}
		public void setCurrentbalance(double currentbalance) {
			this.currentbalance = currentbalance;
		}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	
  public void deposite(double amount){
	  
	  currentbalance=currentbalance+amount;
	  System.out.println("total balance is"+currentbalance);
  }
	 
  public void withdraw(double amount) 
  {
	  if(amount<=currentbalance)
	  {
	  currentbalance=currentbalance-amount;
	  System.out.println("total balance is"+currentbalance);
      }
	  else
	  {
		  System.out.println("sry you dont have enough balance");
	  }
}
  
      public void tranfer(double amount, BankAccount acc)
      {
      if(currentbalance<amount)
      {
    	  System.out.println("Transation fail");
      }
      else
      {
    	  this.currentbalance=this.currentbalance-amount;
    	  acc.currentbalance=acc.currentbalance+amount;
    	  System.out.println(this.currentbalance);
    	  System.out.println(acc.currentbalance);
    	  
    	  
      }
      }
}
	