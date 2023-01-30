package com.collections.enumeration;

public enum Mobile {
	REDMI(2000), SAMSUNG(5000), APPLE(8000);

	int price;

	Mobile(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public static void main(String[] args) {

		for (Mobile m : Mobile.values()) {
			System.out.println(m);
		}

	}
}
