package com.oopsexamples.ex1;

public class Average {
	public static void main(String args[]) 
	{
		int []number= {2,3,4,5,6};
		double avg;
		int s;
		
		s=0;
		for(int i=0;i<=number.length;i++)
		{
			s=s+i;
			
		}
		avg=(s/number.length);
		System.out.println(avg);
		
		
	}

}
