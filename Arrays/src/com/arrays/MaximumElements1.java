package com.arrays;

public class MaximumElements1 {

	public static void main(String[] args) {
		int[] a= {20,43,40,16,21,92,71,59};
		int max=a[0];
		for(int i=1;i<7;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
           System.out.println("maximum number in the array " + max);
	}

}
