package com.oopsexamples.ex1;

public class CarData {
	String carModel;
	String carName;
	String Owner;
	double carPrice;
	

	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public void display() {
		System.out.println("the car model is:" +" "+carModel+'\n'+"car name is:"+carName+'\n'+"owner name is:"+Owner+'\n'+"carName is:"+carName);
	}
}
