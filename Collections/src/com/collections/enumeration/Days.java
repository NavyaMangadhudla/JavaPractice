package com.collections.enumeration;


public enum Days {

	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	public static void main(String args[]) {
		Days leval = Days.SATURDAY;
		System.out.println(leval);

		//System.out.println(Days.valueOf("SUNDAY"));
		for(Days days:Days.values()) {
			System.out.println(days);
		}
	}

}