package com.arrays.controlstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 23;
		int num2 = 48;
		//if the number 1 is 23
		if( num1 == 23 ) {
		//if number is 45
		if( num2 == 45 ) {
		System.out.print("Number 1 is :"+ num1 +" and Number 2 is :"+ num2);
		} // end of if condition 2
		else
		{
		System.out.print("Number 2 is not 45");
		}//end of else condition 2
		} //end of if condition 1

	}

}
