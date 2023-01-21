package com.oopsexamples.bankaccount;

public class SBIDetails {

	public static void main(String[] args) throws Exception {
	SBIBank vani=new SBIBank(); //first object creation
	vani.setCustomerName("vani");
	vani.setAccountNo(9010119894622l);
	System.out.println("customer name :"+vani.getCustomerName()+'\n'+"customer account :"+vani.getAccountNo());
	vani.setBalance(100);  
	System.out.println("my balance :"+vani.getBalance());
   vani.deposit(200);  //deposit method
    vani.withdraw(1000);  //withdraw method
	SBIBank sony=new SBIBank();  //second object creation
	sony.setBalance(400);  
	System.out.println("sony balance :"+sony.getBalance());  
    vani.sendAmount(vani, sony, 100); // transfer method
	
	vani.withdraw(200);

	}

}
