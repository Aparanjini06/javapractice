package com.codegnan.oop;

import java.util.Scanner;

public class ZoomCar {
	String brand;
	String model;
	double price;
	public ZoomCar(String brand, String model,double price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void displayCarInfo()
	{
		if(brand.length()>0)
		{
			if(model.length()>0)
			{
				if(price>0)
				{
					System.out.println("Brand: "+brand+", Model: "+model+", Price per Day: "+price);
				}
				else {
					System.out.println("Error: Rental price must be positive");
				}
			}
			else {
				System.out.println("Error: model should not be empty");
			}
		}
		else {
			System.out.println("Error: brand should not be empty");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String brand=sc.next();
		String model=sc.next();
		double price=sc.nextDouble();
		ZoomCar zc=new ZoomCar(brand,model,price);
		zc.displayCarInfo();
		sc.close();
	}
}
