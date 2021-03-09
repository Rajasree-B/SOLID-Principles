package com.cognizant.solid;

import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");

		String choice;
		choice = sc.nextLine();
		
		switch(choice)
		{
		case "order":
			System.out.println("Please provide the phone model name");
			String modelName=sc.nextLine();
			new Order().processOrder(modelName);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.next();
			if(productType.equals("phone"))
			{
				System.out.println("Please provide the phone model name");
				String productDetail = sc.nextLine();
				new Repair().processPhoneRepair(productDetail);
				break;
						
			}
			else
			{
				System.out.println("Please provide the accessory details:");
				String productDetail = sc.nextLine();
				new Repair().processAccessoryRepair(productDetail);
				break;
			}
		default:
			break;
			
		}
	}

}
